
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
    "effect",
    "key",
    "operator",
    "tolerationSeconds",
    "value"
})
public class Toleration implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("effect")
    @JsonPropertyDescription("")
    private String effect;
    /**
     * 
     */
    @JsonProperty("key")
    @JsonPropertyDescription("")
    private String key;
    /**
     * 
     */
    @JsonProperty("operator")
    @JsonPropertyDescription("")
    private String operator;
    /**
     * 
     */
    @JsonProperty("tolerationSeconds")
    @JsonPropertyDescription("")
    private Integer tolerationSeconds;
    /**
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("")
    private String value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Toleration() {
    }

    /**
     * 
     * @param effect
     * @param tolerationSeconds
     * @param value
     * @param key
     * @param operator
     */
    public Toleration(String effect, String key, String operator, Integer tolerationSeconds, String value) {
        super();
        this.effect = effect;
        this.key = key;
        this.operator = operator;
        this.tolerationSeconds = tolerationSeconds;
        this.value = value;
    }

    /**
     * 
     */
    @JsonProperty("effect")
    public String getEffect() {
        return effect;
    }

    /**
     * 
     */
    @JsonProperty("effect")
    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     * 
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * 
     */
    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 
     */
    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    /**
     * 
     */
    @JsonProperty("operator")
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * 
     */
    @JsonProperty("tolerationSeconds")
    public Integer getTolerationSeconds() {
        return tolerationSeconds;
    }

    /**
     * 
     */
    @JsonProperty("tolerationSeconds")
    public void setTolerationSeconds(Integer tolerationSeconds) {
        this.tolerationSeconds = tolerationSeconds;
    }

    /**
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
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
