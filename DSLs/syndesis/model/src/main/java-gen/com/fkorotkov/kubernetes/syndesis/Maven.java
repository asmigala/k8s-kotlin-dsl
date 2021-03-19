
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
    "additionalArguments",
    "append",
    "repositories"
})
public class Maven implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("additionalArguments")
    @JsonPropertyDescription("")
    private String additionalArguments;
    /**
     * 
     */
    @JsonProperty("append")
    @JsonPropertyDescription("")
    private Boolean append;
    /**
     * 
     */
    @JsonProperty("repositories")
    @JsonPropertyDescription("")
    private Repositories repositories;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Maven() {
    }

    /**
     * 
     * @param repositories
     * @param additionalArguments
     * @param append
     */
    public Maven(String additionalArguments, Boolean append, Repositories repositories) {
        super();
        this.additionalArguments = additionalArguments;
        this.append = append;
        this.repositories = repositories;
    }

    /**
     * 
     */
    @JsonProperty("additionalArguments")
    public String getAdditionalArguments() {
        return additionalArguments;
    }

    /**
     * 
     */
    @JsonProperty("additionalArguments")
    public void setAdditionalArguments(String additionalArguments) {
        this.additionalArguments = additionalArguments;
    }

    /**
     * 
     */
    @JsonProperty("append")
    public Boolean getAppend() {
        return append;
    }

    /**
     * 
     */
    @JsonProperty("append")
    public void setAppend(Boolean append) {
        this.append = append;
    }

    /**
     * 
     */
    @JsonProperty("repositories")
    public Repositories getRepositories() {
        return repositories;
    }

    /**
     * 
     */
    @JsonProperty("repositories")
    public void setRepositories(Repositories repositories) {
        this.repositories = repositories;
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
