
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
    "localRepository",
    "settings",
    "timeout"
})
public class Maven implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("localRepository")
    @JsonPropertyDescription("")
    private String localRepository;
    /**
     * 
     */
    @JsonProperty("settings")
    @JsonPropertyDescription("")
    private Settings settings;
    /**
     * 
     */
    @JsonProperty("timeout")
    @JsonPropertyDescription("")
    private String timeout;
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
     * @param settings
     * @param timeout
     * @param localRepository
     */
    public Maven(String localRepository, Settings settings, String timeout) {
        super();
        this.localRepository = localRepository;
        this.settings = settings;
        this.timeout = timeout;
    }

    /**
     * 
     */
    @JsonProperty("localRepository")
    public String getLocalRepository() {
        return localRepository;
    }

    /**
     * 
     */
    @JsonProperty("localRepository")
    public void setLocalRepository(String localRepository) {
        this.localRepository = localRepository;
    }

    /**
     * 
     */
    @JsonProperty("settings")
    public Settings getSettings() {
        return settings;
    }

    /**
     * 
     */
    @JsonProperty("settings")
    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    /**
     * 
     */
    @JsonProperty("timeout")
    public String getTimeout() {
        return timeout;
    }

    /**
     * 
     */
    @JsonProperty("timeout")
    public void setTimeout(String timeout) {
        this.timeout = timeout;
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
