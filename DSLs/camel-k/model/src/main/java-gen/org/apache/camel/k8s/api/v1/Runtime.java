
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
import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.ObjectMeta;


/**
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "applicationClass",
    "capabilities",
    "dependencies",
    "metadata",
    "provider",
    "version"
})
public class Runtime implements HasMetadata, KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("applicationClass")
    @JsonPropertyDescription("")
    private String applicationClass;
    /**
     * 
     */
    @JsonProperty("capabilities")
    @JsonPropertyDescription("")
    private Capabilities capabilities;
    /**
     * 
     */
    @JsonProperty("dependencies")
    @JsonPropertyDescription("")
    private List<Dependencie> dependencies = new ArrayList<Dependencie>();
    /**
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("")
    private ObjectMeta metadata;
    /**
     * 
     */
    @JsonProperty("provider")
    @JsonPropertyDescription("")
    private String provider;
    /**
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("")
    private String version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Runtime() {
    }

    /**
     * 
     * @param metadata
     * @param capabilities
     * @param applicationClass
     * @param provider
     * @param version
     * @param dependencies
     */
    public Runtime(String applicationClass, Capabilities capabilities, List<Dependencie> dependencies, ObjectMeta metadata, String provider, String version) {
        super();
        this.applicationClass = applicationClass;
        this.capabilities = capabilities;
        this.dependencies = dependencies;
        this.metadata = metadata;
        this.provider = provider;
        this.version = version;
    }

    /**
     * 
     */
    @JsonProperty("applicationClass")
    public String getApplicationClass() {
        return applicationClass;
    }

    /**
     * 
     */
    @JsonProperty("applicationClass")
    public void setApplicationClass(String applicationClass) {
        this.applicationClass = applicationClass;
    }

    /**
     * 
     */
    @JsonProperty("capabilities")
    public Capabilities getCapabilities() {
        return capabilities;
    }

    /**
     * 
     */
    @JsonProperty("capabilities")
    public void setCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * 
     */
    @JsonProperty("dependencies")
    public List<Dependencie> getDependencies() {
        return dependencies;
    }

    /**
     * 
     */
    @JsonProperty("dependencies")
    public void setDependencies(List<Dependencie> dependencies) {
        this.dependencies = dependencies;
    }

    /**
     * 
     */
    @JsonProperty("metadata")
    public ObjectMeta getMetadata() {
        return metadata;
    }

    /**
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
    }

    /**
     * 
     */
    @JsonProperty("provider")
    public String getProvider() {
        return provider;
    }

    /**
     * 
     */
    @JsonProperty("provider")
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * 
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
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
