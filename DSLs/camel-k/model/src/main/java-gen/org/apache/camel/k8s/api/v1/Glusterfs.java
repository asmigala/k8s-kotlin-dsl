
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
    "endpoints",
    "path",
    "readOnly"
})
public class Glusterfs implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("endpoints")
    @JsonPropertyDescription("")
    private String endpoints;
    /**
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("")
    private String path;
    /**
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("")
    private Boolean readOnly;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Glusterfs() {
    }

    /**
     * 
     * @param path
     * @param endpoints
     * @param readOnly
     */
    public Glusterfs(String endpoints, String path, Boolean readOnly) {
        super();
        this.endpoints = endpoints;
        this.path = path;
        this.readOnly = readOnly;
    }

    /**
     * 
     */
    @JsonProperty("endpoints")
    public String getEndpoints() {
        return endpoints;
    }

    /**
     * 
     */
    @JsonProperty("endpoints")
    public void setEndpoints(String endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * 
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 
     */
    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * 
     */
    @JsonProperty("readOnly")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
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
