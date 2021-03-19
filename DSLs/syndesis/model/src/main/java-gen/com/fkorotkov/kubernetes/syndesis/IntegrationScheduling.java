
package com.fkorotkov.kubernetes.syndesis;

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
    "affinity",
    "tolerations"
})
public class IntegrationScheduling implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("affinity")
    @JsonPropertyDescription("")
    private Affinity affinity;
    /**
     * 
     */
    @JsonProperty("tolerations")
    @JsonPropertyDescription("")
    private List<Toleration> tolerations = new ArrayList<Toleration>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public IntegrationScheduling() {
    }

    /**
     * 
     * @param tolerations
     * @param affinity
     */
    public IntegrationScheduling(Affinity affinity, List<Toleration> tolerations) {
        super();
        this.affinity = affinity;
        this.tolerations = tolerations;
    }

    /**
     * 
     */
    @JsonProperty("affinity")
    public Affinity getAffinity() {
        return affinity;
    }

    /**
     * 
     */
    @JsonProperty("affinity")
    public void setAffinity(Affinity affinity) {
        this.affinity = affinity;
    }

    /**
     * 
     */
    @JsonProperty("tolerations")
    public List<Toleration> getTolerations() {
        return tolerations;
    }

    /**
     * 
     */
    @JsonProperty("tolerations")
    public void setTolerations(List<Toleration> tolerations) {
        this.tolerations = tolerations;
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
