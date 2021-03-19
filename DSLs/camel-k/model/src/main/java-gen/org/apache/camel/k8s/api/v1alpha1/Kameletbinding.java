
package org.apache.camel.k8s.api.v1alpha1;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "condition",
    "configuration",
    "flow",
    "integration",
    "kameletBinding",
    "kameletBindingList",
    "properties",
    "ref",
    "resource",
    "sink",
    "source",
    "spec",
    "status",
    "traits"
})
public class Kameletbinding {

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
    @JsonProperty("flow")
    @JsonPropertyDescription("")
    private Flow flow;
    /**
     * 
     */
    @JsonProperty("integration")
    @JsonPropertyDescription("")
    private Integration integration;
    /**
     * 
     */
    @JsonProperty("kameletBinding")
    @JsonPropertyDescription("")
    private KameletBinding kameletBinding;
    /**
     * 
     */
    @JsonProperty("kameletBindingList")
    @JsonPropertyDescription("")
    private KameletBindingList kameletBindingList;
    /**
     * 
     */
    @JsonProperty("properties")
    @JsonPropertyDescription("")
    private Properties properties;
    /**
     * 
     */
    @JsonProperty("ref")
    @JsonPropertyDescription("")
    private Ref ref;
    /**
     * 
     */
    @JsonProperty("resource")
    @JsonPropertyDescription("")
    private Resource resource;
    /**
     * 
     */
    @JsonProperty("sink")
    @JsonPropertyDescription("")
    private Sink sink;
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
    public Kameletbinding() {
    }

    /**
     * 
     * @param traits
     * @param configuration
     * @param resource
     * @param sink
     * @param kameletBinding
     * @param source
     * @param spec
     * @param condition
     * @param ref
     * @param integration
     * @param kameletBindingList
     * @param flow
     * @param properties
     * @param status
     */
    public Kameletbinding(Condition condition, Configuration configuration, Flow flow, Integration integration, KameletBinding kameletBinding, KameletBindingList kameletBindingList, Properties properties, Ref ref, Resource resource, Sink sink, Source source, Spec spec, Status status, Traits traits) {
        super();
        this.condition = condition;
        this.configuration = configuration;
        this.flow = flow;
        this.integration = integration;
        this.kameletBinding = kameletBinding;
        this.kameletBindingList = kameletBindingList;
        this.properties = properties;
        this.ref = ref;
        this.resource = resource;
        this.sink = sink;
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
    @JsonProperty("integration")
    public Integration getIntegration() {
        return integration;
    }

    /**
     * 
     */
    @JsonProperty("integration")
    public void setIntegration(Integration integration) {
        this.integration = integration;
    }

    /**
     * 
     */
    @JsonProperty("kameletBinding")
    public KameletBinding getKameletBinding() {
        return kameletBinding;
    }

    /**
     * 
     */
    @JsonProperty("kameletBinding")
    public void setKameletBinding(KameletBinding kameletBinding) {
        this.kameletBinding = kameletBinding;
    }

    /**
     * 
     */
    @JsonProperty("kameletBindingList")
    public KameletBindingList getKameletBindingList() {
        return kameletBindingList;
    }

    /**
     * 
     */
    @JsonProperty("kameletBindingList")
    public void setKameletBindingList(KameletBindingList kameletBindingList) {
        this.kameletBindingList = kameletBindingList;
    }

    /**
     * 
     */
    @JsonProperty("properties")
    public Properties getProperties() {
        return properties;
    }

    /**
     * 
     */
    @JsonProperty("properties")
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    /**
     * 
     */
    @JsonProperty("ref")
    public Ref getRef() {
        return ref;
    }

    /**
     * 
     */
    @JsonProperty("ref")
    public void setRef(Ref ref) {
        this.ref = ref;
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
    @JsonProperty("sink")
    public Sink getSink() {
        return sink;
    }

    /**
     * 
     */
    @JsonProperty("sink")
    public void setSink(Sink sink) {
        this.sink = sink;
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
