
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
    "datasetName",
    "datasetUUID"
})
public class Flocker implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("datasetName")
    @JsonPropertyDescription("")
    private String datasetName;
    /**
     * 
     */
    @JsonProperty("datasetUUID")
    @JsonPropertyDescription("")
    private String datasetUUID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Flocker() {
    }

    /**
     * 
     * @param datasetName
     * @param datasetUUID
     */
    public Flocker(String datasetName, String datasetUUID) {
        super();
        this.datasetName = datasetName;
        this.datasetUUID = datasetUUID;
    }

    /**
     * 
     */
    @JsonProperty("datasetName")
    public String getDatasetName() {
        return datasetName;
    }

    /**
     * 
     */
    @JsonProperty("datasetName")
    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * 
     */
    @JsonProperty("datasetUUID")
    public String getDatasetUUID() {
        return datasetUUID;
    }

    /**
     * 
     */
    @JsonProperty("datasetUUID")
    public void setDatasetUUID(String datasetUUID) {
        this.datasetUUID = datasetUUID;
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
