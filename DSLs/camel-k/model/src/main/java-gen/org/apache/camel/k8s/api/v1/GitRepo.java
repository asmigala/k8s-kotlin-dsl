
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
    "directory",
    "repository",
    "revision"
})
public class GitRepo implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("directory")
    @JsonPropertyDescription("")
    private String directory;
    /**
     * 
     */
    @JsonProperty("repository")
    @JsonPropertyDescription("")
    private String repository;
    /**
     * 
     */
    @JsonProperty("revision")
    @JsonPropertyDescription("")
    private String revision;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public GitRepo() {
    }

    /**
     * 
     * @param repository
     * @param directory
     * @param revision
     */
    public GitRepo(String directory, String repository, String revision) {
        super();
        this.directory = directory;
        this.repository = repository;
        this.revision = revision;
    }

    /**
     * 
     */
    @JsonProperty("directory")
    public String getDirectory() {
        return directory;
    }

    /**
     * 
     */
    @JsonProperty("directory")
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    /**
     * 
     */
    @JsonProperty("repository")
    public String getRepository() {
        return repository;
    }

    /**
     * 
     */
    @JsonProperty("repository")
    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * 
     */
    @JsonProperty("revision")
    public String getRevision() {
        return revision;
    }

    /**
     * 
     */
    @JsonProperty("revision")
    public void setRevision(String revision) {
        this.revision = revision;
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
