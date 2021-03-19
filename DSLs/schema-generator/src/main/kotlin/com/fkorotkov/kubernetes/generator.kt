package com.fkorotkov.kubernetes

import com.fkorotkov.kotlin.dsl.crd.CRDDefinition
import com.fkorotkov.kotlin.dsl.crd.CRDDefinitionVersion
import com.fkorotkov.kotlin.dsl.crd.OpenAPIV3Schema
import com.google.gson.GsonBuilder
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory
import java.io.File
import java.io.FileFilter
import java.util.*

fun main(args: Array<String>) {
    val sourceDir = File(args[0])
    val targetDir = File(args[1])

    val gson = GsonBuilder()
            .registerTypeAdapterFactory(
                    RuntimeTypeAdapterFactory.of(PropertyDefinition::class.java)
                            .registerSubtype(PrimitiveStringPropertyDefinition::class.java, "string")
                            .registerSubtype(PrimitiveIntegerPropertyDefinition::class.java, "integer")
                            .registerSubtype(PrimitiveBooleanPropertyDefinition::class.java, "boolean")
                            .registerSubtype(ArrayPropertyDefinition::class.java, "array")
                            .registerSubtype(RefPropertyDefinition::class.java, "ref")
                            .registerSubtype(ExistingTypePropertyDefinition::class.java, "object")
                            .registerSubtype(AnyPropertyDefinition::class.java, "any")
            )
            .setPrettyPrinting()
            .create()

    targetDir.mkdirs()
    println("sourceDir: ${sourceDir}")
    println("targetDir: ${targetDir}")

    sourceDir.listFiles(FileFilter { f -> f.extension == "json" }).forEach { crdFile ->
        println(crdFile.absolutePath)
        val crd = CRDDefinition.parse(crdFile.readText())
        crd.spec.versions.forEach { version ->
            println("processing ${crd.spec.names.singular} ${version.name}")
            val versionDir = File(targetDir, version.name)
            versionDir.mkdirs()
            val newSchema = createSchema(crd, version)
            val outputFile = File(versionDir, "${crd.spec.names.singular}.json")


            outputFile.writeText(gson.toJson(newSchema))
        }
    }
}

fun createSchema(crd: CRDDefinition, version: CRDDefinitionVersion): Schema {
    val result = Schema()
    val typeDefinitionRegistry = mutableMapOf<String, TypeDefinition>()
    val packageName = crd.spec.group.split('.').reversed().joinToString(".") + ".k8s.api.${version.name}"
    generateTypes(typeDefinitionRegistry, packageName, crd.spec.names.kind, version.schema.openAPIV3Schema)

    typeDefinitionRegistry.remove("Metadata")
    typeDefinitionRegistry.forEach { _, definition ->
        if (definition.properties.containsKey("metadata")) {
            definition.javaInterfaces = definition.javaInterfaces + "io.fabric8.kubernetes.api.model.HasMetadata"
            definition.properties = definition.properties + mapOf(
                    "metadata" to ExistingTypePropertyDefinition().apply {
                        existingJavaType = "io.fabric8.kubernetes.api.model.ObjectMeta"
                    }
            )
        }
    }

    typeDefinitionRegistry["${crd.spec.names.kind}List"] = TypeDefinition().apply {
        javaType = "${packageName}.${crd.spec.names.kind}List"
        javaInterfaces = listOf(
                "io.fabric8.kubernetes.api.model.KubernetesResource",
                "io.fabric8.kubernetes.api.model.KubernetesResourceList<${crd.spec.names.kind}>"
        )
        properties = TreeMap(mapOf(
                "apiVersion" to PrimitiveStringPropertyDefinition().apply { default = "${crd.spec.group}/${version.name}" },
                "kind" to PrimitiveStringPropertyDefinition().apply { default = "${crd.spec.names.kind}List" },
                "items" to ArrayPropertyDefinition().apply {
                    items = RefPropertyDefinition().apply {
                        ref = "#/definitions/${crd.spec.names.kind}"
                        javaType = "${packageName}.${crd.spec.names.kind}"
                    }
                },
                "metadata" to ExistingTypePropertyDefinition().apply {
                    existingJavaType = "io.fabric8.kubernetes.api.model.ListMeta"
                }
        ))
    }

    (typeDefinitionRegistry[crd.spec.names.kind]?.properties?.get("apiVersion") as? PrimitiveStringPropertyDefinition)?.default = "${crd.spec.group}/${version.name}"
    (typeDefinitionRegistry[crd.spec.names.kind]?.properties?.get("kind") as? PrimitiveStringPropertyDefinition)?.default = crd.spec.names.kind

    result.definitions = TreeMap(typeDefinitionRegistry)
    result.properties = TreeMap(typeDefinitionRegistry.map { (name, definition) ->
        name.decapitalize() to RefPropertyDefinition().apply {
            ref = "#/definitions/$name"
            javaType = "${packageName}.$name"
        }
    }.toMap())
    return result
}

fun generateTypes(registry: MutableMap<String, TypeDefinition>, packagePrefix: String, name: String, schema: OpenAPIV3Schema) {
    val fqn = "$packagePrefix.$name"
    val typeRef = name
    if (schema.type != "object") {
        return
    }
    if (registry.containsKey(typeRef)) {
        return
    }
    val result = TypeDefinition().apply {
        javaType = fqn
    }

    // object is always KubernetesResource
    result.javaInterfaces = listOf("io.fabric8.kubernetes.api.model.KubernetesResource")
    result.properties = schema.properties.mapValues { (name, openAPISchema) ->
        val typeName = name.capitalize()
        when (openAPISchema.type) {
            "object" -> {
                generateTypes(registry, packagePrefix, typeName, openAPISchema)
                RefPropertyDefinition().apply {
                    ref = "#/definitions/$typeName"
                    javaType = "$packagePrefix.$typeName"
                }
            }
            "array" -> {
                generateTypes(registry, packagePrefix, typeName.removeSuffix("s"), openAPISchema.items
                        ?: throw IllegalStateException("Array for $typeName should have items!!"))

                ArrayPropertyDefinition().apply {
                    items = when (openAPISchema.items?.type) {
                        "string" -> PrimitiveStringPropertyDefinition()
                        "boolean" -> PrimitiveBooleanPropertyDefinition()
                        "integer" -> PrimitiveIntegerPropertyDefinition()
                        else -> RefPropertyDefinition().apply {
                            ref = "#/definitions/${typeName.removeSuffix("s")}"
                            javaType = "$packagePrefix.${typeName.removeSuffix("s")}"
                        }
                    }
                }
            }
            "string" -> PrimitiveStringPropertyDefinition()
            "boolean" -> PrimitiveBooleanPropertyDefinition()
            "integer" -> PrimitiveIntegerPropertyDefinition()
            "Any" -> AnyPropertyDefinition();
            else -> throw IllegalStateException("unknown type ${openAPISchema.type}")
        }
    }

    registry[typeRef] = result
}
