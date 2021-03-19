
package org.apache.camel.k8s.api.v1;

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


/**
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "affinity",
    "args",
    "builtImage",
    "command",
    "env",
    "image",
    "name",
    "securityContext",
    "volumeMounts",
    "volumes",
    "workingDir"
})
public class Image implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("affinity")
    @JsonPropertyDescription("")
    private Affinity affinity;
    /**
     * 
     */
    @JsonProperty("args")
    @JsonPropertyDescription("")
    private List<String> args = new ArrayList<String>();
    /**
     * 
     */
    @JsonProperty("builtImage")
    @JsonPropertyDescription("")
    private String builtImage;
    /**
     * 
     */
    @JsonProperty("command")
    @JsonPropertyDescription("")
    private List<String> command = new ArrayList<String>();
    /**
     * 
     */
    @JsonProperty("env")
    @JsonPropertyDescription("")
    private List<Env> env = new ArrayList<Env>();
    /**
     * 
     */
    @JsonProperty("image")
    @JsonPropertyDescription("")
    private String image;
    /**
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("")
    private String name;
    /**
     * 
     */
    @JsonProperty("securityContext")
    @JsonPropertyDescription("")
    private SecurityContext securityContext;
    /**
     * 
     */
    @JsonProperty("volumeMounts")
    @JsonPropertyDescription("")
    private List<VolumeMount> volumeMounts = new ArrayList<VolumeMount>();
    /**
     * 
     */
    @JsonProperty("volumes")
    @JsonPropertyDescription("")
    private List<Volume> volumes = new ArrayList<Volume>();
    /**
     * 
     */
    @JsonProperty("workingDir")
    @JsonPropertyDescription("")
    private String workingDir;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Image() {
    }

    /**
     * 
     * @param args
     * @param image
     * @param builtImage
     * @param workingDir
     * @param name
     * @param volumes
     * @param securityContext
     * @param env
     * @param command
     * @param affinity
     * @param volumeMounts
     */
    public Image(Affinity affinity, List<String> args, String builtImage, List<String> command, List<Env> env, String image, String name, SecurityContext securityContext, List<VolumeMount> volumeMounts, List<Volume> volumes, String workingDir) {
        super();
        this.affinity = affinity;
        this.args = args;
        this.builtImage = builtImage;
        this.command = command;
        this.env = env;
        this.image = image;
        this.name = name;
        this.securityContext = securityContext;
        this.volumeMounts = volumeMounts;
        this.volumes = volumes;
        this.workingDir = workingDir;
    }

    /**
     * 
     */
    @JsonProperty("affinity")
    public Affinity getAffinity() {
        return affinity;
    }

    /**
     * 
     */
    @JsonProperty("affinity")
    public void setAffinity(Affinity affinity) {
        this.affinity = affinity;
    }

    /**
     * 
     */
    @JsonProperty("args")
    public List<String> getArgs() {
        return args;
    }

    /**
     * 
     */
    @JsonProperty("args")
    public void setArgs(List<String> args) {
        this.args = args;
    }

    /**
     * 
     */
    @JsonProperty("builtImage")
    public String getBuiltImage() {
        return builtImage;
    }

    /**
     * 
     */
    @JsonProperty("builtImage")
    public void setBuiltImage(String builtImage) {
        this.builtImage = builtImage;
    }

    /**
     * 
     */
    @JsonProperty("command")
    public List<String> getCommand() {
        return command;
    }

    /**
     * 
     */
    @JsonProperty("command")
    public void setCommand(List<String> command) {
        this.command = command;
    }

    /**
     * 
     */
    @JsonProperty("env")
    public List<Env> getEnv() {
        return env;
    }

    /**
     * 
     */
    @JsonProperty("env")
    public void setEnv(List<Env> env) {
        this.env = env;
    }

    /**
     * 
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * 
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     */
    @JsonProperty("securityContext")
    public SecurityContext getSecurityContext() {
        return securityContext;
    }

    /**
     * 
     */
    @JsonProperty("securityContext")
    public void setSecurityContext(SecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    /**
     * 
     */
    @JsonProperty("volumeMounts")
    public List<VolumeMount> getVolumeMounts() {
        return volumeMounts;
    }

    /**
     * 
     */
    @JsonProperty("volumeMounts")
    public void setVolumeMounts(List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    /**
     * 
     */
    @JsonProperty("volumes")
    public List<Volume> getVolumes() {
        return volumes;
    }

    /**
     * 
     */
    @JsonProperty("volumes")
    public void setVolumes(List<Volume> volumes) {
        this.volumes = volumes;
    }

    /**
     * 
     */
    @JsonProperty("workingDir")
    public String getWorkingDir() {
        return workingDir;
    }

    /**
     * 
     */
    @JsonProperty("workingDir")
    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
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
