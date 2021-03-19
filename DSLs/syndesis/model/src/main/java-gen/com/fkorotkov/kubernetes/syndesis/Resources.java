
package com.fkorotkov.kubernetes.syndesis;

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
    "limit",
    "request",
    "volumeAccessMode",
    "volumeCapacity",
    "volumeLabels",
    "volumeName",
    "volumeStorageClass"
})
public class Resources implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("limit")
    @JsonPropertyDescription("")
    private Limit limit;
    /**
     * 
     */
    @JsonProperty("request")
    @JsonPropertyDescription("")
    private Request request;
    /**
     * 
     */
    @JsonProperty("volumeAccessMode")
    @JsonPropertyDescription("")
    private String volumeAccessMode;
    /**
     * 
     */
    @JsonProperty("volumeCapacity")
    @JsonPropertyDescription("")
    private String volumeCapacity;
    /**
     * 
     */
    @JsonProperty("volumeLabels")
    @JsonPropertyDescription("")
    private VolumeLabels volumeLabels;
    /**
     * 
     */
    @JsonProperty("volumeName")
    @JsonPropertyDescription("")
    private String volumeName;
    /**
     * 
     */
    @JsonProperty("volumeStorageClass")
    @JsonPropertyDescription("")
    private String volumeStorageClass;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Resources() {
    }

    /**
     * 
     * @param request
     * @param volumeLabels
     * @param volumeCapacity
     * @param volumeStorageClass
     * @param volumeName
     * @param limit
     * @param volumeAccessMode
     */
    public Resources(Limit limit, Request request, String volumeAccessMode, String volumeCapacity, VolumeLabels volumeLabels, String volumeName, String volumeStorageClass) {
        super();
        this.limit = limit;
        this.request = request;
        this.volumeAccessMode = volumeAccessMode;
        this.volumeCapacity = volumeCapacity;
        this.volumeLabels = volumeLabels;
        this.volumeName = volumeName;
        this.volumeStorageClass = volumeStorageClass;
    }

    /**
     * 
     */
    @JsonProperty("limit")
    public Limit getLimit() {
        return limit;
    }

    /**
     * 
     */
    @JsonProperty("limit")
    public void setLimit(Limit limit) {
        this.limit = limit;
    }

    /**
     * 
     */
    @JsonProperty("request")
    public Request getRequest() {
        return request;
    }

    /**
     * 
     */
    @JsonProperty("request")
    public void setRequest(Request request) {
        this.request = request;
    }

    /**
     * 
     */
    @JsonProperty("volumeAccessMode")
    public String getVolumeAccessMode() {
        return volumeAccessMode;
    }

    /**
     * 
     */
    @JsonProperty("volumeAccessMode")
    public void setVolumeAccessMode(String volumeAccessMode) {
        this.volumeAccessMode = volumeAccessMode;
    }

    /**
     * 
     */
    @JsonProperty("volumeCapacity")
    public String getVolumeCapacity() {
        return volumeCapacity;
    }

    /**
     * 
     */
    @JsonProperty("volumeCapacity")
    public void setVolumeCapacity(String volumeCapacity) {
        this.volumeCapacity = volumeCapacity;
    }

    /**
     * 
     */
    @JsonProperty("volumeLabels")
    public VolumeLabels getVolumeLabels() {
        return volumeLabels;
    }

    /**
     * 
     */
    @JsonProperty("volumeLabels")
    public void setVolumeLabels(VolumeLabels volumeLabels) {
        this.volumeLabels = volumeLabels;
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
    @JsonProperty("volumeStorageClass")
    public String getVolumeStorageClass() {
        return volumeStorageClass;
    }

    /**
     * 
     */
    @JsonProperty("volumeStorageClass")
    public void setVolumeStorageClass(String volumeStorageClass) {
        this.volumeStorageClass = volumeStorageClass;
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
