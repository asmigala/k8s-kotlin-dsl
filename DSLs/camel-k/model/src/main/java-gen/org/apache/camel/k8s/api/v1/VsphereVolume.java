
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
    "storagePolicyID",
    "storagePolicyName",
    "volumePath"
})
public class VsphereVolume implements KubernetesResource
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
    @JsonProperty("storagePolicyID")
    @JsonPropertyDescription("")
    private String storagePolicyID;
    /**
     * 
     */
    @JsonProperty("storagePolicyName")
    @JsonPropertyDescription("")
    private String storagePolicyName;
    /**
     * 
     */
    @JsonProperty("volumePath")
    @JsonPropertyDescription("")
    private String volumePath;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public VsphereVolume() {
    }

    /**
     * 
     * @param storagePolicyName
     * @param storagePolicyID
     * @param volumePath
     * @param fsType
     */
    public VsphereVolume(String fsType, String storagePolicyID, String storagePolicyName, String volumePath) {
        super();
        this.fsType = fsType;
        this.storagePolicyID = storagePolicyID;
        this.storagePolicyName = storagePolicyName;
        this.volumePath = volumePath;
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
    @JsonProperty("storagePolicyID")
    public String getStoragePolicyID() {
        return storagePolicyID;
    }

    /**
     * 
     */
    @JsonProperty("storagePolicyID")
    public void setStoragePolicyID(String storagePolicyID) {
        this.storagePolicyID = storagePolicyID;
    }

    /**
     * 
     */
    @JsonProperty("storagePolicyName")
    public String getStoragePolicyName() {
        return storagePolicyName;
    }

    /**
     * 
     */
    @JsonProperty("storagePolicyName")
    public void setStoragePolicyName(String storagePolicyName) {
        this.storagePolicyName = storagePolicyName;
    }

    /**
     * 
     */
    @JsonProperty("volumePath")
    public String getVolumePath() {
        return volumePath;
    }

    /**
     * 
     */
    @JsonProperty("volumePath")
    public void setVolumePath(String volumePath) {
        this.volumePath = volumePath;
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
