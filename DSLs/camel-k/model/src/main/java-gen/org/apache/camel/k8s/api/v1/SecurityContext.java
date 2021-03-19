
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
    "allowPrivilegeEscalation",
    "capabilities",
    "privileged",
    "procMount",
    "readOnlyRootFilesystem",
    "runAsGroup",
    "runAsNonRoot",
    "runAsUser",
    "seLinuxOptions",
    "windowsOptions"
})
public class SecurityContext implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("allowPrivilegeEscalation")
    @JsonPropertyDescription("")
    private Boolean allowPrivilegeEscalation;
    /**
     * 
     */
    @JsonProperty("capabilities")
    @JsonPropertyDescription("")
    private Capabilities capabilities;
    /**
     * 
     */
    @JsonProperty("privileged")
    @JsonPropertyDescription("")
    private Boolean privileged;
    /**
     * 
     */
    @JsonProperty("procMount")
    @JsonPropertyDescription("")
    private String procMount;
    /**
     * 
     */
    @JsonProperty("readOnlyRootFilesystem")
    @JsonPropertyDescription("")
    private Boolean readOnlyRootFilesystem;
    /**
     * 
     */
    @JsonProperty("runAsGroup")
    @JsonPropertyDescription("")
    private Integer runAsGroup;
    /**
     * 
     */
    @JsonProperty("runAsNonRoot")
    @JsonPropertyDescription("")
    private Boolean runAsNonRoot;
    /**
     * 
     */
    @JsonProperty("runAsUser")
    @JsonPropertyDescription("")
    private Integer runAsUser;
    /**
     * 
     */
    @JsonProperty("seLinuxOptions")
    @JsonPropertyDescription("")
    private SeLinuxOptions seLinuxOptions;
    /**
     * 
     */
    @JsonProperty("windowsOptions")
    @JsonPropertyDescription("")
    private WindowsOptions windowsOptions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SecurityContext() {
    }

    /**
     * 
     * @param privileged
     * @param runAsUser
     * @param capabilities
     * @param seLinuxOptions
     * @param windowsOptions
     * @param procMount
     * @param allowPrivilegeEscalation
     * @param runAsGroup
     * @param runAsNonRoot
     * @param readOnlyRootFilesystem
     */
    public SecurityContext(Boolean allowPrivilegeEscalation, Capabilities capabilities, Boolean privileged, String procMount, Boolean readOnlyRootFilesystem, Integer runAsGroup, Boolean runAsNonRoot, Integer runAsUser, SeLinuxOptions seLinuxOptions, WindowsOptions windowsOptions) {
        super();
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
        this.capabilities = capabilities;
        this.privileged = privileged;
        this.procMount = procMount;
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
        this.runAsGroup = runAsGroup;
        this.runAsNonRoot = runAsNonRoot;
        this.runAsUser = runAsUser;
        this.seLinuxOptions = seLinuxOptions;
        this.windowsOptions = windowsOptions;
    }

    /**
     * 
     */
    @JsonProperty("allowPrivilegeEscalation")
    public Boolean getAllowPrivilegeEscalation() {
        return allowPrivilegeEscalation;
    }

    /**
     * 
     */
    @JsonProperty("allowPrivilegeEscalation")
    public void setAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
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
    @JsonProperty("privileged")
    public Boolean getPrivileged() {
        return privileged;
    }

    /**
     * 
     */
    @JsonProperty("privileged")
    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    /**
     * 
     */
    @JsonProperty("procMount")
    public String getProcMount() {
        return procMount;
    }

    /**
     * 
     */
    @JsonProperty("procMount")
    public void setProcMount(String procMount) {
        this.procMount = procMount;
    }

    /**
     * 
     */
    @JsonProperty("readOnlyRootFilesystem")
    public Boolean getReadOnlyRootFilesystem() {
        return readOnlyRootFilesystem;
    }

    /**
     * 
     */
    @JsonProperty("readOnlyRootFilesystem")
    public void setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    }

    /**
     * 
     */
    @JsonProperty("runAsGroup")
    public Integer getRunAsGroup() {
        return runAsGroup;
    }

    /**
     * 
     */
    @JsonProperty("runAsGroup")
    public void setRunAsGroup(Integer runAsGroup) {
        this.runAsGroup = runAsGroup;
    }

    /**
     * 
     */
    @JsonProperty("runAsNonRoot")
    public Boolean getRunAsNonRoot() {
        return runAsNonRoot;
    }

    /**
     * 
     */
    @JsonProperty("runAsNonRoot")
    public void setRunAsNonRoot(Boolean runAsNonRoot) {
        this.runAsNonRoot = runAsNonRoot;
    }

    /**
     * 
     */
    @JsonProperty("runAsUser")
    public Integer getRunAsUser() {
        return runAsUser;
    }

    /**
     * 
     */
    @JsonProperty("runAsUser")
    public void setRunAsUser(Integer runAsUser) {
        this.runAsUser = runAsUser;
    }

    /**
     * 
     */
    @JsonProperty("seLinuxOptions")
    public SeLinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    /**
     * 
     */
    @JsonProperty("seLinuxOptions")
    public void setSeLinuxOptions(SeLinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    /**
     * 
     */
    @JsonProperty("windowsOptions")
    public WindowsOptions getWindowsOptions() {
        return windowsOptions;
    }

    /**
     * 
     */
    @JsonProperty("windowsOptions")
    public void setWindowsOptions(WindowsOptions windowsOptions) {
        this.windowsOptions = windowsOptions;
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
