
package org.apache.camel.k8s.api.types.v1;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.camel.k8s.api.v1.Artifact;
import org.apache.camel.k8s.api.v1.Condition;
import org.apache.camel.k8s.api.v1.Configuration;
import org.apache.camel.k8s.api.v1.Failure;
import org.apache.camel.k8s.api.v1.IntegrationKit;
import org.apache.camel.k8s.api.v1.IntegrationKitList;
import org.apache.camel.k8s.api.v1.Recovery;
import org.apache.camel.k8s.api.v1.Spec;
import org.apache.camel.k8s.api.v1.Status;
import org.apache.camel.k8s.api.v1.Traits;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "artifact",
    "condition",
    "configuration",
    "failure",
    "integrationKit",
    "integrationKitList",
    "recovery",
    "spec",
    "status",
    "traits"
})
public class Integrationkit {

    /**
     * 
     */
    @JsonProperty("artifact")
    @JsonPropertyDescription("")
    private Artifact artifact;
    /**
     * 
     */
    @JsonProperty("condition")
    @JsonPropertyDescription("")
    private Condition condition;
    /**
     * 
     */
    @JsonProperty("configuration")
    @JsonPropertyDescription("")
    private Configuration configuration;
    /**
     * 
     */
    @JsonProperty("failure")
    @JsonPropertyDescription("")
    private Failure failure;
    /**
     * 
     */
    @JsonProperty("integrationKit")
    @JsonPropertyDescription("")
    private IntegrationKit integrationKit;
    /**
     * 
     */
    @JsonProperty("integrationKitList")
    @JsonPropertyDescription("")
    private IntegrationKitList integrationKitList;
    /**
     * 
     */
    @JsonProperty("recovery")
    @JsonPropertyDescription("")
    private Recovery recovery;
    /**
     * 
     */
    @JsonProperty("spec")
    @JsonPropertyDescription("")
    private Spec spec;
    /**
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("")
    private Status status;
    /**
     * 
     */
    @JsonProperty("traits")
    @JsonPropertyDescription("")
    private Traits traits;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Integrationkit() {
    }

    /**
     * 
     * @param artifact
     * @param condition
     * @param traits
     * @param configuration
     * @param failure
     * @param integrationKit
     * @param integrationKitList
     * @param recovery
     * @param spec
     * @param status
     */
    public Integrationkit(Artifact artifact, Condition condition, Configuration configuration, Failure failure, IntegrationKit integrationKit, IntegrationKitList integrationKitList, Recovery recovery, Spec spec, Status status, Traits traits) {
        super();
        this.artifact = artifact;
        this.condition = condition;
        this.configuration = configuration;
        this.failure = failure;
        this.integrationKit = integrationKit;
        this.integrationKitList = integrationKitList;
        this.recovery = recovery;
        this.spec = spec;
        this.status = status;
        this.traits = traits;
    }

    /**
     * 
     */
    @JsonProperty("artifact")
    public Artifact getArtifact() {
        return artifact;
    }

    /**
     * 
     */
    @JsonProperty("artifact")
    public void setArtifact(Artifact artifact) {
        this.artifact = artifact;
    }

    /**
     * 
     */
    @JsonProperty("condition")
    public Condition getCondition() {
        return condition;
    }

    /**
     * 
     */
    @JsonProperty("condition")
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    /**
     * 
     */
    @JsonProperty("configuration")
    public Configuration getConfiguration() {
        return configuration;
    }

    /**
     * 
     */
    @JsonProperty("configuration")
    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
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
    @JsonProperty("integrationKit")
    public IntegrationKit getIntegrationKit() {
        return integrationKit;
    }

    /**
     * 
     */
    @JsonProperty("integrationKit")
    public void setIntegrationKit(IntegrationKit integrationKit) {
        this.integrationKit = integrationKit;
    }

    /**
     * 
     */
    @JsonProperty("integrationKitList")
    public IntegrationKitList getIntegrationKitList() {
        return integrationKitList;
    }

    /**
     * 
     */
    @JsonProperty("integrationKitList")
    public void setIntegrationKitList(IntegrationKitList integrationKitList) {
        this.integrationKitList = integrationKitList;
    }

    /**
     * 
     */
    @JsonProperty("recovery")
    public Recovery getRecovery() {
        return recovery;
    }

    /**
     * 
     */
    @JsonProperty("recovery")
    public void setRecovery(Recovery recovery) {
        this.recovery = recovery;
    }

    /**
     * 
     */
    @JsonProperty("spec")
    public Spec getSpec() {
        return spec;
    }

    /**
     * 
     */
    @JsonProperty("spec")
    public void setSpec(Spec spec) {
        this.spec = spec;
    }

    /**
     * 
     */
    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    /**
     * 
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * 
     */
    @JsonProperty("traits")
    public Traits getTraits() {
        return traits;
    }

    /**
     * 
     */
    @JsonProperty("traits")
    public void setTraits(Traits traits) {
        this.traits = traits;
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
