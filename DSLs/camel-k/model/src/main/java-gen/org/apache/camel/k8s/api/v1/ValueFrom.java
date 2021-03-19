
package org.apache.camel.k8s.api.v1;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.fabric8.kubernetes.api.model.KubernetesResource;


/**
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "configMapKeyRef",
    "fieldRef",
    "resourceFieldRef",
    "secretKeyRef"
})
public class ValueFrom implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("configMapKeyRef")
    @JsonPropertyDescription("")
    private ConfigMapKeyRef configMapKeyRef;
    /**
     * 
     */
    @JsonProperty("fieldRef")
    @JsonPropertyDescription("")
    private FieldRef fieldRef;
    /**
     * 
     */
    @JsonProperty("resourceFieldRef")
    @JsonPropertyDescription("")
    private ResourceFieldRef resourceFieldRef;
    /**
     * 
     */
    @JsonProperty("secretKeyRef")
    @JsonPropertyDescription("")
    private SecretKeyRef secretKeyRef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ValueFrom() {
    }

    /**
     * 
     * @param secretKeyRef
     * @param resourceFieldRef
     * @param configMapKeyRef
     * @param fieldRef
     */
    public ValueFrom(ConfigMapKeyRef configMapKeyRef, FieldRef fieldRef, ResourceFieldRef resourceFieldRef, SecretKeyRef secretKeyRef) {
        super();
        this.configMapKeyRef = configMapKeyRef;
        this.fieldRef = fieldRef;
        this.resourceFieldRef = resourceFieldRef;
        this.secretKeyRef = secretKeyRef;
    }

    /**
     * 
     */
    @JsonProperty("configMapKeyRef")
    public ConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    /**
     * 
     */
    @JsonProperty("configMapKeyRef")
    public void setConfigMapKeyRef(ConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    /**
     * 
     */
    @JsonProperty("fieldRef")
    public FieldRef getFieldRef() {
        return fieldRef;
    }

    /**
     * 
     */
    @JsonProperty("fieldRef")
    public void setFieldRef(FieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    /**
     * 
     */
    @JsonProperty("resourceFieldRef")
    public ResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    /**
     * 
     */
    @JsonProperty("resourceFieldRef")
    public void setResourceFieldRef(ResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    /**
     * 
     */
    @JsonProperty("secretKeyRef")
    public SecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    /**
     * 
     */
    @JsonProperty("secretKeyRef")
    public void setSecretKeyRef(SecretKeyRef secretKeyRef) {
        this.secretKeyRef = secretKeyRef;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
