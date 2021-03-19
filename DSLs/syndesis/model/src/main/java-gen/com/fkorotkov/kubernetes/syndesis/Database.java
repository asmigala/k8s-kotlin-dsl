
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
    "externalDbURL",
    "name",
    "resources",
    "url",
    "user"
})
public class Database implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("externalDbURL")
    @JsonPropertyDescription("")
    private String externalDbURL;
    /**
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("")
    private String name;
    /**
     * 
     */
    @JsonProperty("resources")
    @JsonPropertyDescription("")
    private Resources resources;
    /**
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("")
    private String url;
    /**
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("")
    private String user;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Database() {
    }

    /**
     * 
     * @param externalDbURL
     * @param name
     * @param resources
     * @param user
     * @param url
     */
    public Database(String externalDbURL, String name, Resources resources, String url, String user) {
        super();
        this.externalDbURL = externalDbURL;
        this.name = name;
        this.resources = resources;
        this.url = url;
        this.user = user;
    }

    /**
     * 
     */
    @JsonProperty("externalDbURL")
    public String getExternalDbURL() {
        return externalDbURL;
    }

    /**
     * 
     */
    @JsonProperty("externalDbURL")
    public void setExternalDbURL(String externalDbURL) {
        this.externalDbURL = externalDbURL;
    }

    /**
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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

    /**
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
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
