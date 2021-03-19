
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
    "backup",
    "description",
    "forceUpgrade",
    "lastUpgradeFailure",
    "phase",
    "reason",
    "targetVersion",
    "upgradeAttempts",
    "version"
})
public class Status implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("backup")
    @JsonPropertyDescription("")
    private Backup backup;
    /**
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("")
    private String description;
    /**
     * 
     */
    @JsonProperty("forceUpgrade")
    @JsonPropertyDescription("")
    private Boolean forceUpgrade;
    /**
     * 
     */
    @JsonProperty("lastUpgradeFailure")
    @JsonPropertyDescription("")
    private String lastUpgradeFailure;
    /**
     * 
     */
    @JsonProperty("phase")
    @JsonPropertyDescription("")
    private String phase;
    /**
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("")
    private String reason;
    /**
     * 
     */
    @JsonProperty("targetVersion")
    @JsonPropertyDescription("")
    private String targetVersion;
    /**
     * 
     */
    @JsonProperty("upgradeAttempts")
    @JsonPropertyDescription("")
    private Integer upgradeAttempts;
    /**
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("")
    private String version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Status() {
    }

    /**
     * 
     * @param phase
     * @param reason
     * @param backup
     * @param forceUpgrade
     * @param description
     * @param lastUpgradeFailure
     * @param upgradeAttempts
     * @param version
     * @param targetVersion
     */
    public Status(Backup backup, String description, Boolean forceUpgrade, String lastUpgradeFailure, String phase, String reason, String targetVersion, Integer upgradeAttempts, String version) {
        super();
        this.backup = backup;
        this.description = description;
        this.forceUpgrade = forceUpgrade;
        this.lastUpgradeFailure = lastUpgradeFailure;
        this.phase = phase;
        this.reason = reason;
        this.targetVersion = targetVersion;
        this.upgradeAttempts = upgradeAttempts;
        this.version = version;
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
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     */
    @JsonProperty("forceUpgrade")
    public Boolean getForceUpgrade() {
        return forceUpgrade;
    }

    /**
     * 
     */
    @JsonProperty("forceUpgrade")
    public void setForceUpgrade(Boolean forceUpgrade) {
        this.forceUpgrade = forceUpgrade;
    }

    /**
     * 
     */
    @JsonProperty("lastUpgradeFailure")
    public String getLastUpgradeFailure() {
        return lastUpgradeFailure;
    }

    /**
     * 
     */
    @JsonProperty("lastUpgradeFailure")
    public void setLastUpgradeFailure(String lastUpgradeFailure) {
        this.lastUpgradeFailure = lastUpgradeFailure;
    }

    /**
     * 
     */
    @JsonProperty("phase")
    public String getPhase() {
        return phase;
    }

    /**
     * 
     */
    @JsonProperty("phase")
    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * 
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * 
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * 
     */
    @JsonProperty("targetVersion")
    public String getTargetVersion() {
        return targetVersion;
    }

    /**
     * 
     */
    @JsonProperty("targetVersion")
    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    /**
     * 
     */
    @JsonProperty("upgradeAttempts")
    public Integer getUpgradeAttempts() {
        return upgradeAttempts;
    }

    /**
     * 
     */
    @JsonProperty("upgradeAttempts")
    public void setUpgradeAttempts(Integer upgradeAttempts) {
        this.upgradeAttempts = upgradeAttempts;
    }

    /**
     * 
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
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
