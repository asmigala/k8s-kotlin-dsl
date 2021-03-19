
package org.apache.camel.k8s.api.v1alpha1;

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
    "properties",
    "ref",
    "uri"
})
public class Sink implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("properties")
    @JsonPropertyDescription("")
    private Properties properties;
    /**
     * 
     */
    @JsonProperty("ref")
    @JsonPropertyDescription("")
    private Ref ref;
    /**
     * 
     */
    @JsonProperty("uri")
    @JsonPropertyDescription("")
    private String uri;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sink() {
    }

    /**
     * 
     * @param ref
     * @param uri
     * @param properties
     */
    public Sink(Properties properties, Ref ref, String uri) {
        super();
        this.properties = properties;
        this.ref = ref;
        this.uri = uri;
    }

    /**
     * 
     */
    @JsonProperty("properties")
    public Properties getProperties() {
        return properties;
    }

    /**
     * 
     */
    @JsonProperty("properties")
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    /**
     * 
     */
    @JsonProperty("ref")
    public Ref getRef() {
        return ref;
    }

    /**
     * 
     */
    @JsonProperty("ref")
    public void setRef(Ref ref) {
        this.ref = ref;
    }

    /**
     * 
     */
    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    /**
     * 
     */
    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
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
