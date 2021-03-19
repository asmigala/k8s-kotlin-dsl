
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
    "pdName",
    "readOnly"
})
public class GcePersistentDisk implements KubernetesResource
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
    @JsonProperty("pdName")
    @JsonPropertyDescription("")
    private String pdName;
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
    public GcePersistentDisk() {
    }

    /**
     * 
     * @param partition
     * @param readOnly
     * @param pdName
     * @param fsType
     */
    public GcePersistentDisk(String fsType, Integer partition, String pdName, Boolean readOnly) {
        super();
        this.fsType = fsType;
        this.partition = partition;
        this.pdName = pdName;
        this.readOnly = readOnly;
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
    @JsonProperty("pdName")
    public String getPdName() {
        return pdName;
    }

    /**
     * 
     */
    @JsonProperty("pdName")
    public void setPdName(String pdName) {
        this.pdName = pdName;
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
