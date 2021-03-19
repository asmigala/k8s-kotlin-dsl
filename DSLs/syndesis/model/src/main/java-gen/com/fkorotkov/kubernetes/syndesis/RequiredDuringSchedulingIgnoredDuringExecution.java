
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
    "nodeSelectorTerms"
})
public class RequiredDuringSchedulingIgnoredDuringExecution implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("nodeSelectorTerms")
    @JsonPropertyDescription("")
    private List<NodeSelectorTerm> nodeSelectorTerms = new ArrayList<NodeSelectorTerm>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequiredDuringSchedulingIgnoredDuringExecution() {
    }

    /**
     * 
     * @param nodeSelectorTerms
     */
    public RequiredDuringSchedulingIgnoredDuringExecution(List<NodeSelectorTerm> nodeSelectorTerms) {
        super();
        this.nodeSelectorTerms = nodeSelectorTerms;
    }

    /**
     * 
     */
    @JsonProperty("nodeSelectorTerms")
    public List<NodeSelectorTerm> getNodeSelectorTerms() {
        return nodeSelectorTerms;
    }

    /**
     * 
     */
    @JsonProperty("nodeSelectorTerms")
    public void setNodeSelectorTerms(List<NodeSelectorTerm> nodeSelectorTerms) {
        this.nodeSelectorTerms = nodeSelectorTerms;
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
