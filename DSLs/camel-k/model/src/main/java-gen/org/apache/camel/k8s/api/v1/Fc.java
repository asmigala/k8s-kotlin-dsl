
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
    "fsType",
    "lun",
    "readOnly",
    "targetWWNs",
    "wwids"
})
public class Fc implements KubernetesResource
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
    @JsonProperty("lun")
    @JsonPropertyDescription("")
    private Integer lun;
    /**
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("")
    private Boolean readOnly;
    /**
     * 
     */
    @JsonProperty("targetWWNs")
    @JsonPropertyDescription("")
    private List<String> targetWWNs = new ArrayList<String>();
    /**
     * 
     */
    @JsonProperty("wwids")
    @JsonPropertyDescription("")
    private List<String> wwids = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fc() {
    }

    /**
     * 
     * @param lun
     * @param targetWWNs
     * @param readOnly
     * @param wwids
     * @param fsType
     */
    public Fc(String fsType, Integer lun, Boolean readOnly, List<String> targetWWNs, List<String> wwids) {
        super();
        this.fsType = fsType;
        this.lun = lun;
        this.readOnly = readOnly;
        this.targetWWNs = targetWWNs;
        this.wwids = wwids;
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
    @JsonProperty("lun")
    public Integer getLun() {
        return lun;
    }

    /**
     * 
     */
    @JsonProperty("lun")
    public void setLun(Integer lun) {
        this.lun = lun;
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
    @JsonProperty("targetWWNs")
    public List<String> getTargetWWNs() {
        return targetWWNs;
    }

    /**
     * 
     */
    @JsonProperty("targetWWNs")
    public void setTargetWWNs(List<String> targetWWNs) {
        this.targetWWNs = targetWWNs;
    }

    /**
     * 
     */
    @JsonProperty("wwids")
    public List<String> getWwids() {
        return wwids;
    }

    /**
     * 
     */
    @JsonProperty("wwids")
    public void setWwids(List<String> wwids) {
        this.wwids = wwids;
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
