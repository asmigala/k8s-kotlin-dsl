
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
    "containerName",
    "divisor",
    "resource"
})
public class ResourceFieldRef implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("containerName")
    @JsonPropertyDescription("")
    private String containerName;
    /**
     * 
     */
    @JsonProperty("divisor")
    @JsonPropertyDescription("")
    private Divisor divisor;
    /**
     * 
     */
    @JsonProperty("resource")
    @JsonPropertyDescription("")
    private String resource;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResourceFieldRef() {
    }

    /**
     * 
     * @param divisor
     * @param resource
     * @param containerName
     */
    public ResourceFieldRef(String containerName, Divisor divisor, String resource) {
        super();
        this.containerName = containerName;
        this.divisor = divisor;
        this.resource = resource;
    }

    /**
     * 
     */
    @JsonProperty("containerName")
    public String getContainerName() {
        return containerName;
    }

    /**
     * 
     */
    @JsonProperty("containerName")
    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * 
     */
    @JsonProperty("divisor")
    public Divisor getDivisor() {
        return divisor;
    }

    /**
     * 
     */
    @JsonProperty("divisor")
    public void setDivisor(Divisor divisor) {
        this.divisor = divisor;
    }

    /**
     * 
     */
    @JsonProperty("resource")
    public String getResource() {
        return resource;
    }

    /**
     * 
     */
    @JsonProperty("resource")
    public void setResource(String resource) {
        this.resource = resource;
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
