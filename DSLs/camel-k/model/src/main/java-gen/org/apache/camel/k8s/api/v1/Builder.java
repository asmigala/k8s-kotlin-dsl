
package org.apache.camel.k8s.api.v1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "affinity",
    "baseImage",
    "buildDir",
    "dependencies",
    "image",
    "maven",
    "meta",
    "name",
    "properties",
    "resources",
    "runtime",
    "sources",
    "steps",
    "timeout",
    "volumeMounts",
    "volumes"
})
public class Builder implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("affinity")
    @JsonPropertyDescription("")
    private Affinity affinity;
    /**
     * 
     */
    @JsonProperty("baseImage")
    @JsonPropertyDescription("")
    private String baseImage;
    /**
     * 
     */
    @JsonProperty("buildDir")
    @JsonPropertyDescription("")
    private String buildDir;
    /**
     * 
     */
    @JsonProperty("dependencies")
    @JsonPropertyDescription("")
    private List<String> dependencies = new ArrayList<String>();
    /**
     * 
     */
    @JsonProperty("image")
    @JsonPropertyDescription("")
    private String image;
    /**
     * 
     */
    @JsonProperty("maven")
    @JsonPropertyDescription("")
    private Maven maven;
    /**
     * 
     */
    @JsonProperty("meta")
    @JsonPropertyDescription("")
    private Meta meta;
    /**
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("")
    private String name;
    /**
     * 
     */
    @JsonProperty("properties")
    @JsonPropertyDescription("")
    private Properties properties;
    /**
     * 
     */
    @JsonProperty("resources")
    @JsonPropertyDescription("")
    private List<Resource> resources = new ArrayList<Resource>();
    /**
     * 
     */
    @JsonProperty("runtime")
    @JsonPropertyDescription("")
    private Runtime runtime;
    /**
     * 
     */
    @JsonProperty("sources")
    @JsonPropertyDescription("")
    private List<Source> sources = new ArrayList<Source>();
    /**
     * 
     */
    @JsonProperty("steps")
    @JsonPropertyDescription("")
    private List<String> steps = new ArrayList<String>();
    /**
     * 
     */
    @JsonProperty("timeout")
    @JsonPropertyDescription("")
    private String timeout;
    /**
     * 
     */
    @JsonProperty("volumeMounts")
    @JsonPropertyDescription("")
    private List<VolumeMount> volumeMounts = new ArrayList<VolumeMount>();
    /**
     * 
     */
    @JsonProperty("volumes")
    @JsonPropertyDescription("")
    private List<Volume> volumes = new ArrayList<Volume>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Builder() {
    }

    /**
     * 
     * @param image
     * @param sources
     * @param buildDir
     * @param maven
     * @param baseImage
     * @param volumes
     * @param resources
     * @param runtime
     * @param steps
     * @param timeout
     * @param dependencies
     * @param volumeMounts
     * @param meta
     * @param name
     * @param properties
     * @param affinity
     */
    public Builder(Affinity affinity, String baseImage, String buildDir, List<String> dependencies, String image, Maven maven, Meta meta, String name, Properties properties, List<Resource> resources, Runtime runtime, List<Source> sources, List<String> steps, String timeout, List<VolumeMount> volumeMounts, List<Volume> volumes) {
        super();
        this.affinity = affinity;
        this.baseImage = baseImage;
        this.buildDir = buildDir;
        this.dependencies = dependencies;
        this.image = image;
        this.maven = maven;
        this.meta = meta;
        this.name = name;
        this.properties = properties;
        this.resources = resources;
        this.runtime = runtime;
        this.sources = sources;
        this.steps = steps;
        this.timeout = timeout;
        this.volumeMounts = volumeMounts;
        this.volumes = volumes;
    }

    /**
     * 
     */
    @JsonProperty("affinity")
    public Affinity getAffinity() {
        return affinity;
    }

    /**
     * 
     */
    @JsonProperty("affinity")
    public void setAffinity(Affinity affinity) {
        this.affinity = affinity;
    }

    /**
     * 
     */
    @JsonProperty("baseImage")
    public String getBaseImage() {
        return baseImage;
    }

    /**
     * 
     */
    @JsonProperty("baseImage")
    public void setBaseImage(String baseImage) {
        this.baseImage = baseImage;
    }

    /**
     * 
     */
    @JsonProperty("buildDir")
    public String getBuildDir() {
        return buildDir;
    }

    /**
     * 
     */
    @JsonProperty("buildDir")
    public void setBuildDir(String buildDir) {
        this.buildDir = buildDir;
    }

    /**
     * 
     */
    @JsonProperty("dependencies")
    public List<String> getDependencies() {
        return dependencies;
    }

    /**
     * 
     */
    @JsonProperty("dependencies")
    public void setDependencies(List<String> dependencies) {
        this.dependencies = dependencies;
    }

    /**
     * 
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * 
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 
     */
    @JsonProperty("maven")
    public Maven getMaven() {
        return maven;
    }

    /**
     * 
     */
    @JsonProperty("maven")
    public void setMaven(Maven maven) {
        this.maven = maven;
    }

    /**
     * 
     */
    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    /**
     * 
     */
    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     */
    @JsonProperty("properties")
    public Properties getProperties() {
        return properties;
    }

    /**
     * 
     */
    @JsonProperty("properties")
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    /**
     * 
     */
    @JsonProperty("resources")
    public List<Resource> getResources() {
        return resources;
    }

    /**
     * 
     */
    @JsonProperty("resources")
    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    /**
     * 
     */
    @JsonProperty("runtime")
    public Runtime getRuntime() {
        return runtime;
    }

    /**
     * 
     */
    @JsonProperty("runtime")
    public void setRuntime(Runtime runtime) {
        this.runtime = runtime;
    }

    /**
     * 
     */
    @JsonProperty("sources")
    public List<Source> getSources() {
        return sources;
    }

    /**
     * 
     */
    @JsonProperty("sources")
    public void setSources(List<Source> sources) {
        this.sources = sources;
    }

    /**
     * 
     */
    @JsonProperty("steps")
    public List<String> getSteps() {
        return steps;
    }

    /**
     * 
     */
    @JsonProperty("steps")
    public void setSteps(List<String> steps) {
        this.steps = steps;
    }

    /**
     * 
     */
    @JsonProperty("timeout")
    public String getTimeout() {
        return timeout;
    }

    /**
     * 
     */
    @JsonProperty("timeout")
    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    /**
     * 
     */
    @JsonProperty("volumeMounts")
    public List<VolumeMount> getVolumeMounts() {
        return volumeMounts;
    }

    /**
     * 
     */
    @JsonProperty("volumeMounts")
    public void setVolumeMounts(List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    /**
     * 
     */
    @JsonProperty("volumes")
    public List<Volume> getVolumes() {
        return volumes;
    }

    /**
     * 
     */
    @JsonProperty("volumes")
    public void setVolumes(List<Volume> volumes) {
        this.volumes = volumes;
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
