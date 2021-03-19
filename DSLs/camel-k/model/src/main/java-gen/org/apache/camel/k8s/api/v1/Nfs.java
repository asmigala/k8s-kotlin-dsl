
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
    "path",
    "readOnly",
    "server"
})
public class Nfs implements KubernetesResource
{

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
    /**
     * 
     */
    @JsonProperty("server")
    @JsonPropertyDescription("")
    private String server;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Nfs() {
    }

    /**
     * 
     * @param path
     * @param server
     * @param readOnly
     */
    public Nfs(String path, Boolean readOnly, String server) {
        super();
        this.path = path;
        this.readOnly = readOnly;
        this.server = server;
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

    /**
     * 
     */
    @JsonProperty("server")
    public String getServer() {
        return server;
    }

    /**
     * 
     */
    @JsonProperty("server")
    public void setServer(String server) {
        this.server = server;
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
