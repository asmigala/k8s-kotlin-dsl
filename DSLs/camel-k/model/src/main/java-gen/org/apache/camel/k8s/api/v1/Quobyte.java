
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
    "group",
    "readOnly",
    "registry",
    "tenant",
    "user",
    "volume"
})
public class Quobyte implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("group")
    @JsonPropertyDescription("")
    private String group;
    /**
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("")
    private Boolean readOnly;
    /**
     * 
     */
    @JsonProperty("registry")
    @JsonPropertyDescription("")
    private String registry;
    /**
     * 
     */
    @JsonProperty("tenant")
    @JsonPropertyDescription("")
    private String tenant;
    /**
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("")
    private String user;
    /**
     * 
     */
    @JsonProperty("volume")
    @JsonPropertyDescription("")
    private String volume;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Quobyte() {
    }

    /**
     * 
     * @param volume
     * @param registry
     * @param readOnly
     * @param user
     * @param tenant
     * @param group
     */
    public Quobyte(String group, Boolean readOnly, String registry, String tenant, String user, String volume) {
        super();
        this.group = group;
        this.readOnly = readOnly;
        this.registry = registry;
        this.tenant = tenant;
        this.user = user;
        this.volume = volume;
    }

    /**
     * 
     */
    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    /**
     * 
     */
    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * 
     */
    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * 
     */
    @JsonProperty("readOnly")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * 
     */
    @JsonProperty("registry")
    public String getRegistry() {
        return registry;
    }

    /**
     * 
     */
    @JsonProperty("registry")
    public void setRegistry(String registry) {
        this.registry = registry;
    }

    /**
     * 
     */
    @JsonProperty("tenant")
    public String getTenant() {
        return tenant;
    }

    /**
     * 
     */
    @JsonProperty("tenant")
    public void setTenant(String tenant) {
        this.tenant = tenant;
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

    /**
     * 
     */
    @JsonProperty("volume")
    public String getVolume() {
        return volume;
    }

    /**
     * 
     */
    @JsonProperty("volume")
    public void setVolume(String volume) {
        this.volume = volume;
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
