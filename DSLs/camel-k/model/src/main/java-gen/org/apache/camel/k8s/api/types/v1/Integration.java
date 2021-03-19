
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
import org.apache.camel.k8s.api.v1.Condition;
import org.apache.camel.k8s.api.v1.Configuration;
import org.apache.camel.k8s.api.v1.Failure;
import org.apache.camel.k8s.api.v1.Flow;
import org.apache.camel.k8s.api.v1.GeneratedResource;
import org.apache.camel.k8s.api.v1.GeneratedSource;
import org.apache.camel.k8s.api.v1.IntegrationList;
import org.apache.camel.k8s.api.v1.Recovery;
import org.apache.camel.k8s.api.v1.Resource;
import org.apache.camel.k8s.api.v1.Source;
import org.apache.camel.k8s.api.v1.Spec;
import org.apache.camel.k8s.api.v1.Status;
import org.apache.camel.k8s.api.v1.Traits;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "condition",
    "configuration",
    "failure",
    "flow",
    "generatedResource",
    "generatedSource",
    "integration",
    "integrationList",
    "recovery",
    "resource",
    "source",
    "spec",
    "status",
    "traits"
})
public class Integration {

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
    @JsonProperty("flow")
    @JsonPropertyDescription("")
    private Flow flow;
    /**
     * 
     */
    @JsonProperty("generatedResource")
    @JsonPropertyDescription("")
    private GeneratedResource generatedResource;
    /**
     * 
     */
    @JsonProperty("generatedSource")
    @JsonPropertyDescription("")
    private GeneratedSource generatedSource;
    /**
     * 
     */
    @JsonProperty("integration")
    @JsonPropertyDescription("")
    private org.apache.camel.k8s.api.v1.Integration integration;
    /**
     * 
     */
    @JsonProperty("integrationList")
    @JsonPropertyDescription("")
    private IntegrationList integrationList;
    /**
     * 
     */
    @JsonProperty("recovery")
    @JsonPropertyDescription("")
    private Recovery recovery;
    /**
     * 
     */
    @JsonProperty("resource")
    @JsonPropertyDescription("")
    private Resource resource;
    /**
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("")
    private Source source;
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
    public Integration() {
    }

    /**
     * 
     * @param traits
     * @param configuration
     * @param resource
     * @param integrationList
     * @param recovery
     * @param source
     * @param generatedResource
     * @param spec
     * @param condition
     * @param failure
     * @param integration
     * @param flow
     * @param generatedSource
     * @param status
     */
    public Integration(Condition condition, Configuration configuration, Failure failure, Flow flow, GeneratedResource generatedResource, GeneratedSource generatedSource, org.apache.camel.k8s.api.v1.Integration integration, IntegrationList integrationList, Recovery recovery, Resource resource, Source source, Spec spec, Status status, Traits traits) {
        super();
        this.condition = condition;
        this.configuration = configuration;
        this.failure = failure;
        this.flow = flow;
        this.generatedResource = generatedResource;
        this.generatedSource = generatedSource;
        this.integration = integration;
        this.integrationList = integrationList;
        this.recovery = recovery;
        this.resource = resource;
        this.source = source;
        this.spec = spec;
        this.status = status;
        this.traits = traits;
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
    @JsonProperty("flow")
    public Flow getFlow() {
        return flow;
    }

    /**
     * 
     */
    @JsonProperty("flow")
    public void setFlow(Flow flow) {
        this.flow = flow;
    }

    /**
     * 
     */
    @JsonProperty("generatedResource")
    public GeneratedResource getGeneratedResource() {
        return generatedResource;
    }

    /**
     * 
     */
    @JsonProperty("generatedResource")
    public void setGeneratedResource(GeneratedResource generatedResource) {
        this.generatedResource = generatedResource;
    }

    /**
     * 
     */
    @JsonProperty("generatedSource")
    public GeneratedSource getGeneratedSource() {
        return generatedSource;
    }

    /**
     * 
     */
    @JsonProperty("generatedSource")
    public void setGeneratedSource(GeneratedSource generatedSource) {
        this.generatedSource = generatedSource;
    }

    /**
     * 
     */
    @JsonProperty("integration")
    public org.apache.camel.k8s.api.v1.Integration getIntegration() {
        return integration;
    }

    /**
     * 
     */
    @JsonProperty("integration")
    public void setIntegration(org.apache.camel.k8s.api.v1.Integration integration) {
        this.integration = integration;
    }

    /**
     * 
     */
    @JsonProperty("integrationList")
    public IntegrationList getIntegrationList() {
        return integrationList;
    }

    /**
     * 
     */
    @JsonProperty("integrationList")
    public void setIntegrationList(IntegrationList integrationList) {
        this.integrationList = integrationList;
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
    @JsonProperty("resource")
    public Resource getResource() {
        return resource;
    }

    /**
     * 
     */
    @JsonProperty("resource")
    public void setResource(Resource resource) {
        this.resource = resource;
    }

    /**
     * 
     */
    @JsonProperty("source")
    public Source getSource() {
        return source;
    }

    /**
     * 
     */
    @JsonProperty("source")
    public void setSource(Source source) {
        this.source = source;
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
