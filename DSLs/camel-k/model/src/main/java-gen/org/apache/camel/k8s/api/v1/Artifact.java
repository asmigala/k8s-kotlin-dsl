
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
    "checksum",
    "id",
    "location",
    "target"
})
public class Artifact implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("checksum")
    @JsonPropertyDescription("")
    private String checksum;
    /**
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("")
    private String id;
    /**
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("")
    private String location;
    /**
     * 
     */
    @JsonProperty("target")
    @JsonPropertyDescription("")
    private String target;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Artifact() {
    }

    /**
     * 
     * @param checksum
     * @param location
     * @param id
     * @param target
     */
    public Artifact(String checksum, String id, String location, String target) {
        super();
        this.checksum = checksum;
        this.id = id;
        this.location = location;
        this.target = target;
    }

    /**
     * 
     */
    @JsonProperty("checksum")
    public String getChecksum() {
        return checksum;
    }

    /**
     * 
     */
    @JsonProperty("checksum")
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * 
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 
     */
    @JsonProperty("target")
    public String getTarget() {
        return target;
    }

    /**
     * 
     */
    @JsonProperty("target")
    public void setTarget(String target) {
        this.target = target;
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
