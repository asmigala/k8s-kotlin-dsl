
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
    "artifacts",
    "baseImage",
    "conditions",
    "digest",
    "duration",
    "error",
    "failure",
    "image",
    "phase",
    "platform",
    "startedAt"
})
public class Status implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("artifacts")
    @JsonPropertyDescription("")
    private List<Artifact> artifacts = new ArrayList<Artifact>();
    /**
     * 
     */
    @JsonProperty("baseImage")
    @JsonPropertyDescription("")
    private String baseImage;
    /**
     * 
     */
    @JsonProperty("conditions")
    @JsonPropertyDescription("")
    private List<Condition> conditions = new ArrayList<Condition>();
    /**
     * 
     */
    @JsonProperty("digest")
    @JsonPropertyDescription("")
    private String digest;
    /**
     * 
     */
    @JsonProperty("duration")
    @JsonPropertyDescription("")
    private String duration;
    /**
     * 
     */
    @JsonProperty("error")
    @JsonPropertyDescription("")
    private String error;
    /**
     * 
     */
    @JsonProperty("failure")
    @JsonPropertyDescription("")
    private Failure failure;
    /**
     * 
     */
    @JsonProperty("image")
    @JsonPropertyDescription("")
    private String image;
    /**
     * 
     */
    @JsonProperty("phase")
    @JsonPropertyDescription("")
    private String phase;
    /**
     * 
     */
    @JsonProperty("platform")
    @JsonPropertyDescription("")
    private String platform;
    /**
     * 
     */
    @JsonProperty("startedAt")
    @JsonPropertyDescription("")
    private String startedAt;
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
     * @param duration
     * @param phase
     * @param image
     * @param failure
     * @param baseImage
     * @param digest
     * @param startedAt
     * @param conditions
     * @param error
     * @param platform
     * @param artifacts
     */
    public Status(List<Artifact> artifacts, String baseImage, List<Condition> conditions, String digest, String duration, String error, Failure failure, String image, String phase, String platform, String startedAt) {
        super();
        this.artifacts = artifacts;
        this.baseImage = baseImage;
        this.conditions = conditions;
        this.digest = digest;
        this.duration = duration;
        this.error = error;
        this.failure = failure;
        this.image = image;
        this.phase = phase;
        this.platform = platform;
        this.startedAt = startedAt;
    }

    /**
     * 
     */
    @JsonProperty("artifacts")
    public List<Artifact> getArtifacts() {
        return artifacts;
    }

    /**
     * 
     */
    @JsonProperty("artifacts")
    public void setArtifacts(List<Artifact> artifacts) {
        this.artifacts = artifacts;
    }

    /**
     * 
     */
    @JsonProperty("baseImage")
    public String getBaseImage() {
        return baseImage;
    }

    /**
     * 
     */
    @JsonProperty("baseImage")
    public void setBaseImage(String baseImage) {
        this.baseImage = baseImage;
    }

    /**
     * 
     */
    @JsonProperty("conditions")
    public List<Condition> getConditions() {
        return conditions;
    }

    /**
     * 
     */
    @JsonProperty("conditions")
    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    /**
     * 
     */
    @JsonProperty("digest")
    public String getDigest() {
        return digest;
    }

    /**
     * 
     */
    @JsonProperty("digest")
    public void setDigest(String digest) {
        this.digest = digest;
    }

    /**
     * 
     */
    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }

    /**
     * 
     */
    @JsonProperty("duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * 
     */
    @JsonProperty("error")
    public String getError() {
        return error;
    }

    /**
     * 
     */
    @JsonProperty("error")
    public void setError(String error) {
        this.error = error;
    }

    /**
     * 
     */
    @JsonProperty("failure")
    public Failure getFailure() {
        return failure;
    }

    /**
     * 
     */
    @JsonProperty("failure")
    public void setFailure(Failure failure) {
        this.failure = failure;
    }

    /**
     * 
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * 
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
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
    @JsonProperty("platform")
    public String getPlatform() {
        return platform;
    }

    /**
     * 
     */
    @JsonProperty("platform")
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * 
     */
    @JsonProperty("startedAt")
    public String getStartedAt() {
        return startedAt;
    }

    /**
     * 
     */
    @JsonProperty("startedAt")
    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
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
