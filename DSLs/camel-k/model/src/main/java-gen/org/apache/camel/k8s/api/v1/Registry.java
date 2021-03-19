
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
    "address",
    "ca",
    "insecure",
    "organization",
    "secret"
})
public class Registry implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("")
    private String address;
    /**
     * 
     */
    @JsonProperty("ca")
    @JsonPropertyDescription("")
    private String ca;
    /**
     * 
     */
    @JsonProperty("insecure")
    @JsonPropertyDescription("")
    private Boolean insecure;
    /**
     * 
     */
    @JsonProperty("organization")
    @JsonPropertyDescription("")
    private String organization;
    /**
     * 
     */
    @JsonProperty("secret")
    @JsonPropertyDescription("")
    private String secret;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Registry() {
    }

    /**
     * 
     * @param address
     * @param organization
     * @param insecure
     * @param secret
     * @param ca
     */
    public Registry(String address, String ca, Boolean insecure, String organization, String secret) {
        super();
        this.address = address;
        this.ca = ca;
        this.insecure = insecure;
        this.organization = organization;
        this.secret = secret;
    }

    /**
     * 
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * 
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     */
    @JsonProperty("ca")
    public String getCa() {
        return ca;
    }

    /**
     * 
     */
    @JsonProperty("ca")
    public void setCa(String ca) {
        this.ca = ca;
    }

    /**
     * 
     */
    @JsonProperty("insecure")
    public Boolean getInsecure() {
        return insecure;
    }

    /**
     * 
     */
    @JsonProperty("insecure")
    public void setInsecure(Boolean insecure) {
        this.insecure = insecure;
    }

    /**
     * 
     */
    @JsonProperty("organization")
    public String getOrganization() {
        return organization;
    }

    /**
     * 
     */
    @JsonProperty("organization")
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * 
     */
    @JsonProperty("secret")
    public String getSecret() {
        return secret;
    }

    /**
     * 
     */
    @JsonProperty("secret")
    public void setSecret(String secret) {
        this.secret = secret;
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
