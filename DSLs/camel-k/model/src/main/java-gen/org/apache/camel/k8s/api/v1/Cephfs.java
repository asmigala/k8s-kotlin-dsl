
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
    "monitors",
    "path",
    "readOnly",
    "secretFile",
    "secretRef",
    "user"
})
public class Cephfs implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("monitors")
    @JsonPropertyDescription("")
    private List<String> monitors = new ArrayList<String>();
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
    @JsonProperty("secretFile")
    @JsonPropertyDescription("")
    private String secretFile;
    /**
     * 
     */
    @JsonProperty("secretRef")
    @JsonPropertyDescription("")
    private SecretRef secretRef;
    /**
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("")
    private String user;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cephfs() {
    }

    /**
     * 
     * @param path
     * @param secretRef
     * @param secretFile
     * @param readOnly
     * @param user
     * @param monitors
     */
    public Cephfs(List<String> monitors, String path, Boolean readOnly, String secretFile, SecretRef secretRef, String user) {
        super();
        this.monitors = monitors;
        this.path = path;
        this.readOnly = readOnly;
        this.secretFile = secretFile;
        this.secretRef = secretRef;
        this.user = user;
    }

    /**
     * 
     */
    @JsonProperty("monitors")
    public List<String> getMonitors() {
        return monitors;
    }

    /**
     * 
     */
    @JsonProperty("monitors")
    public void setMonitors(List<String> monitors) {
        this.monitors = monitors;
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
    @JsonProperty("secretFile")
    public String getSecretFile() {
        return secretFile;
    }

    /**
     * 
     */
    @JsonProperty("secretFile")
    public void setSecretFile(String secretFile) {
        this.secretFile = secretFile;
    }

    /**
     * 
     */
    @JsonProperty("secretRef")
    public SecretRef getSecretRef() {
        return secretRef;
    }

    /**
     * 
     */
    @JsonProperty("secretRef")
    public void setSecretRef(SecretRef secretRef) {
        this.secretRef = secretRef;
    }

    /**
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
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
