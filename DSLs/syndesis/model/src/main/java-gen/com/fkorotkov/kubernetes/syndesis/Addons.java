
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
    "jaeger",
    "knative",
    "ops",
    "publicApi",
    "todo"
})
public class Addons implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("jaeger")
    @JsonPropertyDescription("")
    private Jaeger jaeger;
    /**
     * 
     */
    @JsonProperty("knative")
    @JsonPropertyDescription("")
    private Knative knative;
    /**
     * 
     */
    @JsonProperty("ops")
    @JsonPropertyDescription("")
    private Ops ops;
    /**
     * 
     */
    @JsonProperty("publicApi")
    @JsonPropertyDescription("")
    private PublicApi publicApi;
    /**
     * 
     */
    @JsonProperty("todo")
    @JsonPropertyDescription("")
    private Todo todo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Addons() {
    }

    /**
     * 
     * @param todo
     * @param ops
     * @param publicApi
     * @param jaeger
     * @param knative
     */
    public Addons(Jaeger jaeger, Knative knative, Ops ops, PublicApi publicApi, Todo todo) {
        super();
        this.jaeger = jaeger;
        this.knative = knative;
        this.ops = ops;
        this.publicApi = publicApi;
        this.todo = todo;
    }

    /**
     * 
     */
    @JsonProperty("jaeger")
    public Jaeger getJaeger() {
        return jaeger;
    }

    /**
     * 
     */
    @JsonProperty("jaeger")
    public void setJaeger(Jaeger jaeger) {
        this.jaeger = jaeger;
    }

    /**
     * 
     */
    @JsonProperty("knative")
    public Knative getKnative() {
        return knative;
    }

    /**
     * 
     */
    @JsonProperty("knative")
    public void setKnative(Knative knative) {
        this.knative = knative;
    }

    /**
     * 
     */
    @JsonProperty("ops")
    public Ops getOps() {
        return ops;
    }

    /**
     * 
     */
    @JsonProperty("ops")
    public void setOps(Ops ops) {
        this.ops = ops;
    }

    /**
     * 
     */
    @JsonProperty("publicApi")
    public PublicApi getPublicApi() {
        return publicApi;
    }

    /**
     * 
     */
    @JsonProperty("publicApi")
    public void setPublicApi(PublicApi publicApi) {
        this.publicApi = publicApi;
    }

    /**
     * 
     */
    @JsonProperty("todo")
    public Todo getTodo() {
        return todo;
    }

    /**
     * 
     */
    @JsonProperty("todo")
    public void setTodo(Todo todo) {
        this.todo = todo;
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
