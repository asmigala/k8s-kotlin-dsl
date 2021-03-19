
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
    "clientOnly",
    "collectorUri",
    "enabled",
    "imageAgent",
    "imageAllInOne",
    "imageOperator",
    "operatorOnly",
    "queryUri",
    "samplerParam",
    "samplerType"
})
public class Jaeger implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("clientOnly")
    @JsonPropertyDescription("")
    private Boolean clientOnly;
    /**
     * 
     */
    @JsonProperty("collectorUri")
    @JsonPropertyDescription("")
    private String collectorUri;
    /**
     * 
     */
    @JsonProperty("enabled")
    @JsonPropertyDescription("")
    private Boolean enabled;
    /**
     * 
     */
    @JsonProperty("imageAgent")
    @JsonPropertyDescription("")
    private String imageAgent;
    /**
     * 
     */
    @JsonProperty("imageAllInOne")
    @JsonPropertyDescription("")
    private String imageAllInOne;
    /**
     * 
     */
    @JsonProperty("imageOperator")
    @JsonPropertyDescription("")
    private String imageOperator;
    /**
     * 
     */
    @JsonProperty("operatorOnly")
    @JsonPropertyDescription("")
    private Boolean operatorOnly;
    /**
     * 
     */
    @JsonProperty("queryUri")
    @JsonPropertyDescription("")
    private String queryUri;
    /**
     * 
     */
    @JsonProperty("samplerParam")
    @JsonPropertyDescription("")
    private String samplerParam;
    /**
     * 
     */
    @JsonProperty("samplerType")
    @JsonPropertyDescription("")
    private String samplerType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Jaeger() {
    }

    /**
     * 
     * @param operatorOnly
     * @param queryUri
     * @param clientOnly
     * @param collectorUri
     * @param imageOperator
     * @param samplerParam
     * @param samplerType
     * @param enabled
     * @param imageAgent
     * @param imageAllInOne
     */
    public Jaeger(Boolean clientOnly, String collectorUri, Boolean enabled, String imageAgent, String imageAllInOne, String imageOperator, Boolean operatorOnly, String queryUri, String samplerParam, String samplerType) {
        super();
        this.clientOnly = clientOnly;
        this.collectorUri = collectorUri;
        this.enabled = enabled;
        this.imageAgent = imageAgent;
        this.imageAllInOne = imageAllInOne;
        this.imageOperator = imageOperator;
        this.operatorOnly = operatorOnly;
        this.queryUri = queryUri;
        this.samplerParam = samplerParam;
        this.samplerType = samplerType;
    }

    /**
     * 
     */
    @JsonProperty("clientOnly")
    public Boolean getClientOnly() {
        return clientOnly;
    }

    /**
     * 
     */
    @JsonProperty("clientOnly")
    public void setClientOnly(Boolean clientOnly) {
        this.clientOnly = clientOnly;
    }

    /**
     * 
     */
    @JsonProperty("collectorUri")
    public String getCollectorUri() {
        return collectorUri;
    }

    /**
     * 
     */
    @JsonProperty("collectorUri")
    public void setCollectorUri(String collectorUri) {
        this.collectorUri = collectorUri;
    }

    /**
     * 
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * 
     */
    @JsonProperty("imageAgent")
    public String getImageAgent() {
        return imageAgent;
    }

    /**
     * 
     */
    @JsonProperty("imageAgent")
    public void setImageAgent(String imageAgent) {
        this.imageAgent = imageAgent;
    }

    /**
     * 
     */
    @JsonProperty("imageAllInOne")
    public String getImageAllInOne() {
        return imageAllInOne;
    }

    /**
     * 
     */
    @JsonProperty("imageAllInOne")
    public void setImageAllInOne(String imageAllInOne) {
        this.imageAllInOne = imageAllInOne;
    }

    /**
     * 
     */
    @JsonProperty("imageOperator")
    public String getImageOperator() {
        return imageOperator;
    }

    /**
     * 
     */
    @JsonProperty("imageOperator")
    public void setImageOperator(String imageOperator) {
        this.imageOperator = imageOperator;
    }

    /**
     * 
     */
    @JsonProperty("operatorOnly")
    public Boolean getOperatorOnly() {
        return operatorOnly;
    }

    /**
     * 
     */
    @JsonProperty("operatorOnly")
    public void setOperatorOnly(Boolean operatorOnly) {
        this.operatorOnly = operatorOnly;
    }

    /**
     * 
     */
    @JsonProperty("queryUri")
    public String getQueryUri() {
        return queryUri;
    }

    /**
     * 
     */
    @JsonProperty("queryUri")
    public void setQueryUri(String queryUri) {
        this.queryUri = queryUri;
    }

    /**
     * 
     */
    @JsonProperty("samplerParam")
    public String getSamplerParam() {
        return samplerParam;
    }

    /**
     * 
     */
    @JsonProperty("samplerParam")
    public void setSamplerParam(String samplerParam) {
        this.samplerParam = samplerParam;
    }

    /**
     * 
     */
    @JsonProperty("samplerType")
    public String getSamplerType() {
        return samplerType;
    }

    /**
     * 
     */
    @JsonProperty("samplerType")
    public void setSamplerType(String samplerType) {
        this.samplerType = samplerType;
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
