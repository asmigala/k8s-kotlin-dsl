
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
    "deployIntegrations",
    "integrationLimit",
    "integrationStateCheckInterval",
    "managementUrlFor3scale",
    "maven"
})
public class Features implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("deployIntegrations")
    @JsonPropertyDescription("")
    private Boolean deployIntegrations;
    /**
     * 
     */
    @JsonProperty("integrationLimit")
    @JsonPropertyDescription("")
    private Integer integrationLimit;
    /**
     * 
     */
    @JsonProperty("integrationStateCheckInterval")
    @JsonPropertyDescription("")
    private Integer integrationStateCheckInterval;
    /**
     * 
     */
    @JsonProperty("managementUrlFor3scale")
    @JsonPropertyDescription("")
    private String managementUrlFor3scale;
    /**
     * 
     */
    @JsonProperty("maven")
    @JsonPropertyDescription("")
    private Maven maven;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Features() {
    }

    /**
     * 
     * @param managementUrlFor3scale
     * @param integrationStateCheckInterval
     * @param maven
     * @param deployIntegrations
     * @param integrationLimit
     */
    public Features(Boolean deployIntegrations, Integer integrationLimit, Integer integrationStateCheckInterval, String managementUrlFor3scale, Maven maven) {
        super();
        this.deployIntegrations = deployIntegrations;
        this.integrationLimit = integrationLimit;
        this.integrationStateCheckInterval = integrationStateCheckInterval;
        this.managementUrlFor3scale = managementUrlFor3scale;
        this.maven = maven;
    }

    /**
     * 
     */
    @JsonProperty("deployIntegrations")
    public Boolean getDeployIntegrations() {
        return deployIntegrations;
    }

    /**
     * 
     */
    @JsonProperty("deployIntegrations")
    public void setDeployIntegrations(Boolean deployIntegrations) {
        this.deployIntegrations = deployIntegrations;
    }

    /**
     * 
     */
    @JsonProperty("integrationLimit")
    public Integer getIntegrationLimit() {
        return integrationLimit;
    }

    /**
     * 
     */
    @JsonProperty("integrationLimit")
    public void setIntegrationLimit(Integer integrationLimit) {
        this.integrationLimit = integrationLimit;
    }

    /**
     * 
     */
    @JsonProperty("integrationStateCheckInterval")
    public Integer getIntegrationStateCheckInterval() {
        return integrationStateCheckInterval;
    }

    /**
     * 
     */
    @JsonProperty("integrationStateCheckInterval")
    public void setIntegrationStateCheckInterval(Integer integrationStateCheckInterval) {
        this.integrationStateCheckInterval = integrationStateCheckInterval;
    }

    /**
     * 
     */
    @JsonProperty("managementUrlFor3scale")
    public String getManagementUrlFor3scale() {
        return managementUrlFor3scale;
    }

    /**
     * 
     */
    @JsonProperty("managementUrlFor3scale")
    public void setManagementUrlFor3scale(String managementUrlFor3scale) {
        this.managementUrlFor3scale = managementUrlFor3scale;
    }

    /**
     * 
     */
    @JsonProperty("maven")
    public Maven getMaven() {
        return maven;
    }

    /**
     * 
     */
    @JsonProperty("maven")
    public void setMaven(Maven maven) {
        this.maven = maven;
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
