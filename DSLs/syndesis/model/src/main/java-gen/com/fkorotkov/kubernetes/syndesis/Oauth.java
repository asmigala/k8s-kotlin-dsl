
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
    "credentialsSecret",
    "cryptoCommsSecret",
    "disableSarCheck",
    "sarNamespace"
})
public class Oauth implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("credentialsSecret")
    @JsonPropertyDescription("")
    private String credentialsSecret;
    /**
     * 
     */
    @JsonProperty("cryptoCommsSecret")
    @JsonPropertyDescription("")
    private String cryptoCommsSecret;
    /**
     * 
     */
    @JsonProperty("disableSarCheck")
    @JsonPropertyDescription("")
    private Boolean disableSarCheck;
    /**
     * 
     */
    @JsonProperty("sarNamespace")
    @JsonPropertyDescription("")
    private String sarNamespace;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Oauth() {
    }

    /**
     * 
     * @param disableSarCheck
     * @param credentialsSecret
     * @param sarNamespace
     * @param cryptoCommsSecret
     */
    public Oauth(String credentialsSecret, String cryptoCommsSecret, Boolean disableSarCheck, String sarNamespace) {
        super();
        this.credentialsSecret = credentialsSecret;
        this.cryptoCommsSecret = cryptoCommsSecret;
        this.disableSarCheck = disableSarCheck;
        this.sarNamespace = sarNamespace;
    }

    /**
     * 
     */
    @JsonProperty("credentialsSecret")
    public String getCredentialsSecret() {
        return credentialsSecret;
    }

    /**
     * 
     */
    @JsonProperty("credentialsSecret")
    public void setCredentialsSecret(String credentialsSecret) {
        this.credentialsSecret = credentialsSecret;
    }

    /**
     * 
     */
    @JsonProperty("cryptoCommsSecret")
    public String getCryptoCommsSecret() {
        return cryptoCommsSecret;
    }

    /**
     * 
     */
    @JsonProperty("cryptoCommsSecret")
    public void setCryptoCommsSecret(String cryptoCommsSecret) {
        this.cryptoCommsSecret = cryptoCommsSecret;
    }

    /**
     * 
     */
    @JsonProperty("disableSarCheck")
    public Boolean getDisableSarCheck() {
        return disableSarCheck;
    }

    /**
     * 
     */
    @JsonProperty("disableSarCheck")
    public void setDisableSarCheck(Boolean disableSarCheck) {
        this.disableSarCheck = disableSarCheck;
    }

    /**
     * 
     */
    @JsonProperty("sarNamespace")
    public String getSarNamespace() {
        return sarNamespace;
    }

    /**
     * 
     */
    @JsonProperty("sarNamespace")
    public void setSarNamespace(String sarNamespace) {
        this.sarNamespace = sarNamespace;
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
