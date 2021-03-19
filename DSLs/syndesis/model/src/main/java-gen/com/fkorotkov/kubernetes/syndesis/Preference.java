
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
    "matchExpressions",
    "matchFields"
})
public class Preference implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("matchExpressions")
    @JsonPropertyDescription("")
    private List<MatchExpression> matchExpressions = new ArrayList<MatchExpression>();
    /**
     * 
     */
    @JsonProperty("matchFields")
    @JsonPropertyDescription("")
    private List<MatchField> matchFields = new ArrayList<MatchField>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Preference() {
    }

    /**
     * 
     * @param matchExpressions
     * @param matchFields
     */
    public Preference(List<MatchExpression> matchExpressions, List<MatchField> matchFields) {
        super();
        this.matchExpressions = matchExpressions;
        this.matchFields = matchFields;
    }

    /**
     * 
     */
    @JsonProperty("matchExpressions")
    public List<MatchExpression> getMatchExpressions() {
        return matchExpressions;
    }

    /**
     * 
     */
    @JsonProperty("matchExpressions")
    public void setMatchExpressions(List<MatchExpression> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    /**
     * 
     */
    @JsonProperty("matchFields")
    public List<MatchField> getMatchFields() {
        return matchFields;
    }

    /**
     * 
     */
    @JsonProperty("matchFields")
    public void setMatchFields(List<MatchField> matchFields) {
        this.matchFields = matchFields;
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
