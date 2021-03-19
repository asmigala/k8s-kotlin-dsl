
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
    "fsType",
    "readOnly",
    "secretRef",
    "volumeName",
    "volumeNamespace"
})
public class Storageos implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("fsType")
    @JsonPropertyDescription("")
    private String fsType;
    /**
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("")
    private Boolean readOnly;
    /**
     * 
     */
    @JsonProperty("secretRef")
    @JsonPropertyDescription("")
    private SecretRef secretRef;
    /**
     * 
     */
    @JsonProperty("volumeName")
    @JsonPropertyDescription("")
    private String volumeName;
    /**
     * 
     */
    @JsonProperty("volumeNamespace")
    @JsonPropertyDescription("")
    private String volumeNamespace;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Storageos() {
    }

    /**
     * 
     * @param volumeNamespace
     * @param volumeName
     * @param secretRef
     * @param readOnly
     * @param fsType
     */
    public Storageos(String fsType, Boolean readOnly, SecretRef secretRef, String volumeName, String volumeNamespace) {
        super();
        this.fsType = fsType;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.volumeName = volumeName;
        this.volumeNamespace = volumeNamespace;
    }

    /**
     * 
     */
    @JsonProperty("fsType")
    public String getFsType() {
        return fsType;
    }

    /**
     * 
     */
    @JsonProperty("fsType")
    public void setFsType(String fsType) {
        this.fsType = fsType;
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
    @JsonProperty("volumeName")
    public String getVolumeName() {
        return volumeName;
    }

    /**
     * 
     */
    @JsonProperty("volumeName")
    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    /**
     * 
     */
    @JsonProperty("volumeNamespace")
    public String getVolumeNamespace() {
        return volumeNamespace;
    }

    /**
     * 
     */
    @JsonProperty("volumeNamespace")
    public void setVolumeNamespace(String volumeNamespace) {
        this.volumeNamespace = volumeNamespace;
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
