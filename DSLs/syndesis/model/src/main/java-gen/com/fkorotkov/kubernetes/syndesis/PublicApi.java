
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
    "disable-sar-check",
    "enabled",
    "routeHostname"
})
public class PublicApi implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("disable-sar-check")
    @JsonPropertyDescription("")
    private Boolean disableSarCheck;
    /**
     * 
     */
    @JsonProperty("enabled")
    @JsonPropertyDescription("")
    private Boolean enabled;
    /**
     * 
     */
    @JsonProperty("routeHostname")
    @JsonPropertyDescription("")
    private String routeHostname;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PublicApi() {
    }

    /**
     * 
     * @param disableSarCheck
     * @param routeHostname
     * @param enabled
     */
    public PublicApi(Boolean disableSarCheck, Boolean enabled, String routeHostname) {
        super();
        this.disableSarCheck = disableSarCheck;
        this.enabled = enabled;
        this.routeHostname = routeHostname;
    }

    /**
     * 
     */
    @JsonProperty("disable-sar-check")
    public Boolean getDisableSarCheck() {
        return disableSarCheck;
    }

    /**
     * 
     */
    @JsonProperty("disable-sar-check")
    public void setDisableSarCheck(Boolean disableSarCheck) {
        this.disableSarCheck = disableSarCheck;
    }

    /**
     * 
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * 
     */
    @JsonProperty("routeHostname")
    public String getRouteHostname() {
        return routeHostname;
    }

    /**
     * 
     */
    @JsonProperty("routeHostname")
    public void setRouteHostname(String routeHostname) {
        this.routeHostname = routeHostname;
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
