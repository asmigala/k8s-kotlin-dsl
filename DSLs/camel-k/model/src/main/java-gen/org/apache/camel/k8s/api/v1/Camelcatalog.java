
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "artifacts",
    "camelCatalog",
    "camelCatalogList",
    "capabilities",
    "dependencie",
    "loaders",
    "runtime",
    "spec",
    "status"
})
public class Camelcatalog {

    /**
     * 
     */
    @JsonProperty("artifacts")
    @JsonPropertyDescription("")
    private Artifacts artifacts;
    /**
     * 
     */
    @JsonProperty("camelCatalog")
    @JsonPropertyDescription("")
    private CamelCatalog camelCatalog;
    /**
     * 
     */
    @JsonProperty("camelCatalogList")
    @JsonPropertyDescription("")
    private CamelCatalogList camelCatalogList;
    /**
     * 
     */
    @JsonProperty("capabilities")
    @JsonPropertyDescription("")
    private Capabilities capabilities;
    /**
     * 
     */
    @JsonProperty("dependencie")
    @JsonPropertyDescription("")
    private Dependencie dependencie;
    /**
     * 
     */
    @JsonProperty("loaders")
    @JsonPropertyDescription("")
    private Loaders loaders;
    /**
     * 
     */
    @JsonProperty("runtime")
    @JsonPropertyDescription("")
    private Runtime runtime;
    /**
     * 
     */
    @JsonProperty("spec")
    @JsonPropertyDescription("")
    private Spec spec;
    /**
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("")
    private Status status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Camelcatalog() {
    }

    /**
     * 
     * @param loaders
     * @param dependencie
     * @param capabilities
     * @param camelCatalog
     * @param runtime
     * @param camelCatalogList
     * @param spec
     * @param artifacts
     * @param status
     */
    public Camelcatalog(Artifacts artifacts, CamelCatalog camelCatalog, CamelCatalogList camelCatalogList, Capabilities capabilities, Dependencie dependencie, Loaders loaders, Runtime runtime, Spec spec, Status status) {
        super();
        this.artifacts = artifacts;
        this.camelCatalog = camelCatalog;
        this.camelCatalogList = camelCatalogList;
        this.capabilities = capabilities;
        this.dependencie = dependencie;
        this.loaders = loaders;
        this.runtime = runtime;
        this.spec = spec;
        this.status = status;
    }

    /**
     * 
     */
    @JsonProperty("artifacts")
    public Artifacts getArtifacts() {
        return artifacts;
    }

    /**
     * 
     */
    @JsonProperty("artifacts")
    public void setArtifacts(Artifacts artifacts) {
        this.artifacts = artifacts;
    }

    /**
     * 
     */
    @JsonProperty("camelCatalog")
    public CamelCatalog getCamelCatalog() {
        return camelCatalog;
    }

    /**
     * 
     */
    @JsonProperty("camelCatalog")
    public void setCamelCatalog(CamelCatalog camelCatalog) {
        this.camelCatalog = camelCatalog;
    }

    /**
     * 
     */
    @JsonProperty("camelCatalogList")
    public CamelCatalogList getCamelCatalogList() {
        return camelCatalogList;
    }

    /**
     * 
     */
    @JsonProperty("camelCatalogList")
    public void setCamelCatalogList(CamelCatalogList camelCatalogList) {
        this.camelCatalogList = camelCatalogList;
    }

    /**
     * 
     */
    @JsonProperty("capabilities")
    public Capabilities getCapabilities() {
        return capabilities;
    }

    /**
     * 
     */
    @JsonProperty("capabilities")
    public void setCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * 
     */
    @JsonProperty("dependencie")
    public Dependencie getDependencie() {
        return dependencie;
    }

    /**
     * 
     */
    @JsonProperty("dependencie")
    public void setDependencie(Dependencie dependencie) {
        this.dependencie = dependencie;
    }

    /**
     * 
     */
    @JsonProperty("loaders")
    public Loaders getLoaders() {
        return loaders;
    }

    /**
     * 
     */
    @JsonProperty("loaders")
    public void setLoaders(Loaders loaders) {
        this.loaders = loaders;
    }

    /**
     * 
     */
    @JsonProperty("runtime")
    public Runtime getRuntime() {
        return runtime;
    }

    /**
     * 
     */
    @JsonProperty("runtime")
    public void setRuntime(Runtime runtime) {
        this.runtime = runtime;
    }

    /**
     * 
     */
    @JsonProperty("spec")
    public Spec getSpec() {
        return spec;
    }

    /**
     * 
     */
    @JsonProperty("spec")
    public void setSpec(Spec spec) {
        this.spec = spec;
    }

    /**
     * 
     */
    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    /**
     * 
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
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
