
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
    "configMapKeyRef",
    "secretKeyRef"
})
public class Settings implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("configMapKeyRef")
    @JsonPropertyDescription("")
    private ConfigMapKeyRef configMapKeyRef;
    /**
     * 
     */
    @JsonProperty("secretKeyRef")
    @JsonPropertyDescription("")
    private SecretKeyRef secretKeyRef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Settings() {
    }

    /**
     * 
     * @param secretKeyRef
     * @param configMapKeyRef
     */
    public Settings(ConfigMapKeyRef configMapKeyRef, SecretKeyRef secretKeyRef) {
        super();
        this.configMapKeyRef = configMapKeyRef;
        this.secretKeyRef = secretKeyRef;
    }

    /**
     * 
     */
    @JsonProperty("configMapKeyRef")
    public ConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    /**
     * 
     */
    @JsonProperty("configMapKeyRef")
    public void setConfigMapKeyRef(ConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    /**
     * 
     */
    @JsonProperty("secretKeyRef")
    public SecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    /**
     * 
     */
    @JsonProperty("secretKeyRef")
    public void setSecretKeyRef(SecretKeyRef secretKeyRef) {
        this.secretKeyRef = secretKeyRef;
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
