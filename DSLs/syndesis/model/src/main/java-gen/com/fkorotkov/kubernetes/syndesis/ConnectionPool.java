
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
    "connectionTimeout",
    "idleTimeout",
    "leakDetectionThreshold",
    "maxLifetime",
    "maximumPoolSize",
    "minimumIdle"
})
public class ConnectionPool implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("connectionTimeout")
    @JsonPropertyDescription("")
    private Integer connectionTimeout;
    /**
     * 
     */
    @JsonProperty("idleTimeout")
    @JsonPropertyDescription("")
    private Integer idleTimeout;
    /**
     * 
     */
    @JsonProperty("leakDetectionThreshold")
    @JsonPropertyDescription("")
    private Integer leakDetectionThreshold;
    /**
     * 
     */
    @JsonProperty("maxLifetime")
    @JsonPropertyDescription("")
    private Integer maxLifetime;
    /**
     * 
     */
    @JsonProperty("maximumPoolSize")
    @JsonPropertyDescription("")
    private Integer maximumPoolSize;
    /**
     * 
     */
    @JsonProperty("minimumIdle")
    @JsonPropertyDescription("")
    private Integer minimumIdle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ConnectionPool() {
    }

    /**
     * 
     * @param minimumIdle
     * @param idleTimeout
     * @param maximumPoolSize
     * @param connectionTimeout
     * @param leakDetectionThreshold
     * @param maxLifetime
     */
    public ConnectionPool(Integer connectionTimeout, Integer idleTimeout, Integer leakDetectionThreshold, Integer maxLifetime, Integer maximumPoolSize, Integer minimumIdle) {
        super();
        this.connectionTimeout = connectionTimeout;
        this.idleTimeout = idleTimeout;
        this.leakDetectionThreshold = leakDetectionThreshold;
        this.maxLifetime = maxLifetime;
        this.maximumPoolSize = maximumPoolSize;
        this.minimumIdle = minimumIdle;
    }

    /**
     * 
     */
    @JsonProperty("connectionTimeout")
    public Integer getConnectionTimeout() {
        return connectionTimeout;
    }

    /**
     * 
     */
    @JsonProperty("connectionTimeout")
    public void setConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    /**
     * 
     */
    @JsonProperty("idleTimeout")
    public Integer getIdleTimeout() {
        return idleTimeout;
    }

    /**
     * 
     */
    @JsonProperty("idleTimeout")
    public void setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
    }

    /**
     * 
     */
    @JsonProperty("leakDetectionThreshold")
    public Integer getLeakDetectionThreshold() {
        return leakDetectionThreshold;
    }

    /**
     * 
     */
    @JsonProperty("leakDetectionThreshold")
    public void setLeakDetectionThreshold(Integer leakDetectionThreshold) {
        this.leakDetectionThreshold = leakDetectionThreshold;
    }

    /**
     * 
     */
    @JsonProperty("maxLifetime")
    public Integer getMaxLifetime() {
        return maxLifetime;
    }

    /**
     * 
     */
    @JsonProperty("maxLifetime")
    public void setMaxLifetime(Integer maxLifetime) {
        this.maxLifetime = maxLifetime;
    }

    /**
     * 
     */
    @JsonProperty("maximumPoolSize")
    public Integer getMaximumPoolSize() {
        return maximumPoolSize;
    }

    /**
     * 
     */
    @JsonProperty("maximumPoolSize")
    public void setMaximumPoolSize(Integer maximumPoolSize) {
        this.maximumPoolSize = maximumPoolSize;
    }

    /**
     * 
     */
    @JsonProperty("minimumIdle")
    public Integer getMinimumIdle() {
        return minimumIdle;
    }

    /**
     * 
     */
    @JsonProperty("minimumIdle")
    public void setMinimumIdle(Integer minimumIdle) {
        this.minimumIdle = minimumIdle;
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
