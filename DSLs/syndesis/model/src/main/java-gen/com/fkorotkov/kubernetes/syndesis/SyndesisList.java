
package com.fkorotkov.kubernetes.syndesis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.KubernetesResourceList;
import io.fabric8.kubernetes.api.model.ListMeta;


/**
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "items",
    "kind",
    "metadata"
})
public class SyndesisList implements KubernetesResource, KubernetesResourceList<Syndesis>
{

    /**
     * 
     */
    @JsonProperty("apiVersion")
    @JsonPropertyDescription("")
    private String apiVersion = "syndesis.io/v1beta2";
    /**
     * 
     */
    @JsonProperty("items")
    @JsonPropertyDescription("")
    private List<com.fkorotkov.kubernetes.syndesis.Syndesis> items = new ArrayList<com.fkorotkov.kubernetes.syndesis.Syndesis>();
    /**
     * 
     */
    @JsonProperty("kind")
    @JsonPropertyDescription("")
    private String kind = "SyndesisList";
    /**
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("")
    private ListMeta metadata;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SyndesisList() {
    }

    /**
     * 
     * @param metadata
     * @param apiVersion
     * @param kind
     * @param items
     */
    public SyndesisList(String apiVersion, List<com.fkorotkov.kubernetes.syndesis.Syndesis> items, String kind, ListMeta metadata) {
        super();
        this.apiVersion = apiVersion;
        this.items = items;
        this.kind = kind;
        this.metadata = metadata;
    }

    /**
     * 
     */
    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * 
     */
    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * 
     */
    @JsonProperty("items")
    public List<com.fkorotkov.kubernetes.syndesis.Syndesis> getItems() {
        return items;
    }

    /**
     * 
     */
    @JsonProperty("items")
    public void setItems(List<com.fkorotkov.kubernetes.syndesis.Syndesis> items) {
        this.items = items;
    }

    /**
     * 
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * 
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 
     */
    @JsonProperty("metadata")
    public ListMeta getMetadata() {
        return metadata;
    }

    /**
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(ListMeta metadata) {
        this.metadata = metadata;
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
