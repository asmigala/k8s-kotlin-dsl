
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
    "medium",
    "sizeLimit"
})
public class EmptyDir implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("medium")
    @JsonPropertyDescription("")
    private String medium;
    /**
     * 
     */
    @JsonProperty("sizeLimit")
    @JsonPropertyDescription("")
    private SizeLimit sizeLimit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public EmptyDir() {
    }

    /**
     * 
     * @param sizeLimit
     * @param medium
     */
    public EmptyDir(String medium, SizeLimit sizeLimit) {
        super();
        this.medium = medium;
        this.sizeLimit = sizeLimit;
    }

    /**
     * 
     */
    @JsonProperty("medium")
    public String getMedium() {
        return medium;
    }

    /**
     * 
     */
    @JsonProperty("medium")
    public void setMedium(String medium) {
        this.medium = medium;
    }

    /**
     * 
     */
    @JsonProperty("sizeLimit")
    public SizeLimit getSizeLimit() {
        return sizeLimit;
    }

    /**
     * 
     */
    @JsonProperty("sizeLimit")
    public void setSizeLimit(SizeLimit sizeLimit) {
        this.sizeLimit = sizeLimit;
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
