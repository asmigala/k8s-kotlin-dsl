
package org.apache.camel.k8s.api.v1;

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
    "defaultMode",
    "sources"
})
public class Projected implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("defaultMode")
    @JsonPropertyDescription("")
    private Integer defaultMode;
    /**
     * 
     */
    @JsonProperty("sources")
    @JsonPropertyDescription("")
    private List<Source> sources = new ArrayList<Source>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Projected() {
    }

    /**
     * 
     * @param sources
     * @param defaultMode
     */
    public Projected(Integer defaultMode, List<Source> sources) {
        super();
        this.defaultMode = defaultMode;
        this.sources = sources;
    }

    /**
     * 
     */
    @JsonProperty("defaultMode")
    public Integer getDefaultMode() {
        return defaultMode;
    }

    /**
     * 
     */
    @JsonProperty("defaultMode")
    public void setDefaultMode(Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    /**
     * 
     */
    @JsonProperty("sources")
    public List<Source> getSources() {
        return sources;
    }

    /**
     * 
     */
    @JsonProperty("sources")
    public void setSources(List<Source> sources) {
        this.sources = sources;
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
