
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
import io.fabric8.kubernetes.api.model.KubernetesResource;


/**
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "integration",
    "sink",
    "source"
})
public class Spec implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("integration")
    @JsonPropertyDescription("")
    private Integration integration;
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
     * @param sink
     * @param integration
     * @param source
     */
    public Spec(Integration integration, Sink sink, Source source) {
        super();
        this.integration = integration;
        this.sink = sink;
        this.source = source;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
