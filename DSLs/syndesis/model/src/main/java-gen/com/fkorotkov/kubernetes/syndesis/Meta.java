
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
    "javaOptions",
    "resources"
})
public class Meta implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("javaOptions")
    @JsonPropertyDescription("")
    private String javaOptions;
    /**
     * 
     */
    @JsonProperty("resources")
    @JsonPropertyDescription("")
    private Resources resources;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Meta() {
    }

    /**
     * 
     * @param resources
     * @param javaOptions
     */
    public Meta(String javaOptions, Resources resources) {
        super();
        this.javaOptions = javaOptions;
        this.resources = resources;
    }

    /**
     * 
     */
    @JsonProperty("javaOptions")
    public String getJavaOptions() {
        return javaOptions;
    }

    /**
     * 
     */
    @JsonProperty("javaOptions")
    public void setJavaOptions(String javaOptions) {
        this.javaOptions = javaOptions;
    }

    /**
     * 
     */
    @JsonProperty("resources")
    public Resources getResources() {
        return resources;
    }

    /**
     * 
     */
    @JsonProperty("resources")
    public void setResources(Resources resources) {
        this.resources = resources;
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
