
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
    "partition",
    "readOnly",
    "volumeID"
})
public class AwsElasticBlockStore implements KubernetesResource
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
    @JsonProperty("partition")
    @JsonPropertyDescription("")
    private Integer partition;
    /**
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("")
    private Boolean readOnly;
    /**
     * 
     */
    @JsonProperty("volumeID")
    @JsonPropertyDescription("")
    private String volumeID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public AwsElasticBlockStore() {
    }

    /**
     * 
     * @param partition
     * @param volumeID
     * @param readOnly
     * @param fsType
     */
    public AwsElasticBlockStore(String fsType, Integer partition, Boolean readOnly, String volumeID) {
        super();
        this.fsType = fsType;
        this.partition = partition;
        this.readOnly = readOnly;
        this.volumeID = volumeID;
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
    @JsonProperty("partition")
    public Integer getPartition() {
        return partition;
    }

    /**
     * 
     */
    @JsonProperty("partition")
    public void setPartition(Integer partition) {
        this.partition = partition;
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
    @JsonProperty("volumeID")
    public String getVolumeID() {
        return volumeID;
    }

    /**
     * 
     */
    @JsonProperty("volumeID")
    public void setVolumeID(String volumeID) {
        this.volumeID = volumeID;
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
