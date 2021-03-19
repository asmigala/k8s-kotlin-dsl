
package org.apache.camel.k8s.api.v1;

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
    "preference",
    "weight"
})
public class PreferredDuringSchedulingIgnoredDuringExecution implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("")
    private Preference preference;
    /**
     * 
     */
    @JsonProperty("weight")
    @JsonPropertyDescription("")
    private Integer weight;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PreferredDuringSchedulingIgnoredDuringExecution() {
    }

    /**
     * 
     * @param preference
     * @param weight
     */
    public PreferredDuringSchedulingIgnoredDuringExecution(Preference preference, Integer weight) {
        super();
        this.preference = preference;
        this.weight = weight;
    }

    /**
     * 
     */
    @JsonProperty("preference")
    public Preference getPreference() {
        return preference;
    }

    /**
     * 
     */
    @JsonProperty("preference")
    public void setPreference(Preference preference) {
        this.preference = preference;
    }

    /**
     * 
     */
    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    /**
     * 
     */
    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
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
