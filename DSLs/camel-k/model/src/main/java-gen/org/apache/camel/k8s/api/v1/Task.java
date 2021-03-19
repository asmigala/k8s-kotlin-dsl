
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
    "builder",
    "image"
})
public class Task implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("builder")
    @JsonPropertyDescription("")
    private Builder builder;
    /**
     * 
     */
    @JsonProperty("image")
    @JsonPropertyDescription("")
    private Image image;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Task() {
    }

    /**
     * 
     * @param image
     * @param builder
     */
    public Task(Builder builder, Image image) {
        super();
        this.builder = builder;
        this.image = image;
    }

    /**
     * 
     */
    @JsonProperty("builder")
    public Builder getBuilder() {
        return builder;
    }

    /**
     * 
     */
    @JsonProperty("builder")
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    /**
     * 
     */
    @JsonProperty("image")
    public Image getImage() {
        return image;
    }

    /**
     * 
     */
    @JsonProperty("image")
    public void setImage(Image image) {
        this.image = image;
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
