
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
    "addons",
    "backup",
    "components",
    "demoData",
    "forceMigration",
    "infraScheduling",
    "integrationScheduling",
    "routeHostname"
})
public class Spec implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("addons")
    @JsonPropertyDescription("")
    private Addons addons;
    /**
     * 
     */
    @JsonProperty("backup")
    @JsonPropertyDescription("")
    private Backup backup;
    /**
     * 
     */
    @JsonProperty("components")
    @JsonPropertyDescription("")
    private Components components;
    /**
     * 
     */
    @JsonProperty("demoData")
    @JsonPropertyDescription("")
    private Boolean demoData;
    /**
     * 
     */
    @JsonProperty("forceMigration")
    @JsonPropertyDescription("")
    private Boolean forceMigration;
    /**
     * 
     */
    @JsonProperty("infraScheduling")
    @JsonPropertyDescription("")
    private InfraScheduling infraScheduling;
    /**
     * 
     */
    @JsonProperty("integrationScheduling")
    @JsonPropertyDescription("")
    private IntegrationScheduling integrationScheduling;
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
    public Spec() {
    }

    /**
     * 
     * @param backup
     * @param components
     * @param routeHostname
     * @param addons
     * @param infraScheduling
     * @param integrationScheduling
     * @param demoData
     * @param forceMigration
     */
    public Spec(Addons addons, Backup backup, Components components, Boolean demoData, Boolean forceMigration, InfraScheduling infraScheduling, IntegrationScheduling integrationScheduling, String routeHostname) {
        super();
        this.addons = addons;
        this.backup = backup;
        this.components = components;
        this.demoData = demoData;
        this.forceMigration = forceMigration;
        this.infraScheduling = infraScheduling;
        this.integrationScheduling = integrationScheduling;
        this.routeHostname = routeHostname;
    }

    /**
     * 
     */
    @JsonProperty("addons")
    public Addons getAddons() {
        return addons;
    }

    /**
     * 
     */
    @JsonProperty("addons")
    public void setAddons(Addons addons) {
        this.addons = addons;
    }

    /**
     * 
     */
    @JsonProperty("backup")
    public Backup getBackup() {
        return backup;
    }

    /**
     * 
     */
    @JsonProperty("backup")
    public void setBackup(Backup backup) {
        this.backup = backup;
    }

    /**
     * 
     */
    @JsonProperty("components")
    public Components getComponents() {
        return components;
    }

    /**
     * 
     */
    @JsonProperty("components")
    public void setComponents(Components components) {
        this.components = components;
    }

    /**
     * 
     */
    @JsonProperty("demoData")
    public Boolean getDemoData() {
        return demoData;
    }

    /**
     * 
     */
    @JsonProperty("demoData")
    public void setDemoData(Boolean demoData) {
        this.demoData = demoData;
    }

    /**
     * 
     */
    @JsonProperty("forceMigration")
    public Boolean getForceMigration() {
        return forceMigration;
    }

    /**
     * 
     */
    @JsonProperty("forceMigration")
    public void setForceMigration(Boolean forceMigration) {
        this.forceMigration = forceMigration;
    }

    /**
     * 
     */
    @JsonProperty("infraScheduling")
    public InfraScheduling getInfraScheduling() {
        return infraScheduling;
    }

    /**
     * 
     */
    @JsonProperty("infraScheduling")
    public void setInfraScheduling(InfraScheduling infraScheduling) {
        this.infraScheduling = infraScheduling;
    }

    /**
     * 
     */
    @JsonProperty("integrationScheduling")
    public IntegrationScheduling getIntegrationScheduling() {
        return integrationScheduling;
    }

    /**
     * 
     */
    @JsonProperty("integrationScheduling")
    public void setIntegrationScheduling(IntegrationScheduling integrationScheduling) {
        this.integrationScheduling = integrationScheduling;
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
