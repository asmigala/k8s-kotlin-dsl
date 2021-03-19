
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
    "driver",
    "fsType",
    "nodePublishSecretRef",
    "readOnly",
    "volumeAttributes"
})
public class Csi implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("driver")
    @JsonPropertyDescription("")
    private String driver;
    /**
     * 
     */
    @JsonProperty("fsType")
    @JsonPropertyDescription("")
    private String fsType;
    /**
     * 
     */
    @JsonProperty("nodePublishSecretRef")
    @JsonPropertyDescription("")
    private NodePublishSecretRef nodePublishSecretRef;
    /**
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("")
    private Boolean readOnly;
    /**
     * 
     */
    @JsonProperty("volumeAttributes")
    @JsonPropertyDescription("")
    private VolumeAttributes volumeAttributes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Csi() {
    }

    /**
     * 
     * @param driver
     * @param nodePublishSecretRef
     * @param readOnly
     * @param fsType
     * @param volumeAttributes
     */
    public Csi(String driver, String fsType, NodePublishSecretRef nodePublishSecretRef, Boolean readOnly, VolumeAttributes volumeAttributes) {
        super();
        this.driver = driver;
        this.fsType = fsType;
        this.nodePublishSecretRef = nodePublishSecretRef;
        this.readOnly = readOnly;
        this.volumeAttributes = volumeAttributes;
    }

    /**
     * 
     */
    @JsonProperty("driver")
    public String getDriver() {
        return driver;
    }

    /**
     * 
     */
    @JsonProperty("driver")
    public void setDriver(String driver) {
        this.driver = driver;
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
    @JsonProperty("nodePublishSecretRef")
    public NodePublishSecretRef getNodePublishSecretRef() {
        return nodePublishSecretRef;
    }

    /**
     * 
     */
    @JsonProperty("nodePublishSecretRef")
    public void setNodePublishSecretRef(NodePublishSecretRef nodePublishSecretRef) {
        this.nodePublishSecretRef = nodePublishSecretRef;
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
    @JsonProperty("volumeAttributes")
    public VolumeAttributes getVolumeAttributes() {
        return volumeAttributes;
    }

    /**
     * 
     */
    @JsonProperty("volumeAttributes")
    public void setVolumeAttributes(VolumeAttributes volumeAttributes) {
        this.volumeAttributes = volumeAttributes;
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
