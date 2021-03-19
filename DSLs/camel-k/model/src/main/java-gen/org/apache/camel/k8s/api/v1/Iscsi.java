
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
    "chapAuthDiscovery",
    "chapAuthSession",
    "fsType",
    "initiatorName",
    "iqn",
    "iscsiInterface",
    "lun",
    "portals",
    "readOnly",
    "secretRef",
    "targetPortal"
})
public class Iscsi implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("chapAuthDiscovery")
    @JsonPropertyDescription("")
    private Boolean chapAuthDiscovery;
    /**
     * 
     */
    @JsonProperty("chapAuthSession")
    @JsonPropertyDescription("")
    private Boolean chapAuthSession;
    /**
     * 
     */
    @JsonProperty("fsType")
    @JsonPropertyDescription("")
    private String fsType;
    /**
     * 
     */
    @JsonProperty("initiatorName")
    @JsonPropertyDescription("")
    private String initiatorName;
    /**
     * 
     */
    @JsonProperty("iqn")
    @JsonPropertyDescription("")
    private String iqn;
    /**
     * 
     */
    @JsonProperty("iscsiInterface")
    @JsonPropertyDescription("")
    private String iscsiInterface;
    /**
     * 
     */
    @JsonProperty("lun")
    @JsonPropertyDescription("")
    private Integer lun;
    /**
     * 
     */
    @JsonProperty("portals")
    @JsonPropertyDescription("")
    private List<String> portals = new ArrayList<String>();
    /**
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("")
    private Boolean readOnly;
    /**
     * 
     */
    @JsonProperty("secretRef")
    @JsonPropertyDescription("")
    private SecretRef secretRef;
    /**
     * 
     */
    @JsonProperty("targetPortal")
    @JsonPropertyDescription("")
    private String targetPortal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Iscsi() {
    }

    /**
     * 
     * @param chapAuthSession
     * @param iscsiInterface
     * @param lun
     * @param chapAuthDiscovery
     * @param iqn
     * @param portals
     * @param secretRef
     * @param initiatorName
     * @param readOnly
     * @param fsType
     * @param targetPortal
     */
    public Iscsi(Boolean chapAuthDiscovery, Boolean chapAuthSession, String fsType, String initiatorName, String iqn, String iscsiInterface, Integer lun, List<String> portals, Boolean readOnly, SecretRef secretRef, String targetPortal) {
        super();
        this.chapAuthDiscovery = chapAuthDiscovery;
        this.chapAuthSession = chapAuthSession;
        this.fsType = fsType;
        this.initiatorName = initiatorName;
        this.iqn = iqn;
        this.iscsiInterface = iscsiInterface;
        this.lun = lun;
        this.portals = portals;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.targetPortal = targetPortal;
    }

    /**
     * 
     */
    @JsonProperty("chapAuthDiscovery")
    public Boolean getChapAuthDiscovery() {
        return chapAuthDiscovery;
    }

    /**
     * 
     */
    @JsonProperty("chapAuthDiscovery")
    public void setChapAuthDiscovery(Boolean chapAuthDiscovery) {
        this.chapAuthDiscovery = chapAuthDiscovery;
    }

    /**
     * 
     */
    @JsonProperty("chapAuthSession")
    public Boolean getChapAuthSession() {
        return chapAuthSession;
    }

    /**
     * 
     */
    @JsonProperty("chapAuthSession")
    public void setChapAuthSession(Boolean chapAuthSession) {
        this.chapAuthSession = chapAuthSession;
    }

    /**
     * 
     */
    @JsonProperty("fsType")
    public String getFsType() {
        return fsType;
    }

    /**
     * 
     */
    @JsonProperty("fsType")
    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    /**
     * 
     */
    @JsonProperty("initiatorName")
    public String getInitiatorName() {
        return initiatorName;
    }

    /**
     * 
     */
    @JsonProperty("initiatorName")
    public void setInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
    }

    /**
     * 
     */
    @JsonProperty("iqn")
    public String getIqn() {
        return iqn;
    }

    /**
     * 
     */
    @JsonProperty("iqn")
    public void setIqn(String iqn) {
        this.iqn = iqn;
    }

    /**
     * 
     */
    @JsonProperty("iscsiInterface")
    public String getIscsiInterface() {
        return iscsiInterface;
    }

    /**
     * 
     */
    @JsonProperty("iscsiInterface")
    public void setIscsiInterface(String iscsiInterface) {
        this.iscsiInterface = iscsiInterface;
    }

    /**
     * 
     */
    @JsonProperty("lun")
    public Integer getLun() {
        return lun;
    }

    /**
     * 
     */
    @JsonProperty("lun")
    public void setLun(Integer lun) {
        this.lun = lun;
    }

    /**
     * 
     */
    @JsonProperty("portals")
    public List<String> getPortals() {
        return portals;
    }

    /**
     * 
     */
    @JsonProperty("portals")
    public void setPortals(List<String> portals) {
        this.portals = portals;
    }

    /**
     * 
     */
    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * 
     */
    @JsonProperty("readOnly")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * 
     */
    @JsonProperty("secretRef")
    public SecretRef getSecretRef() {
        return secretRef;
    }

    /**
     * 
     */
    @JsonProperty("secretRef")
    public void setSecretRef(SecretRef secretRef) {
        this.secretRef = secretRef;
    }

    /**
     * 
     */
    @JsonProperty("targetPortal")
    public String getTargetPortal() {
        return targetPortal;
    }

    /**
     * 
     */
    @JsonProperty("targetPortal")
    public void setTargetPortal(String targetPortal) {
        this.targetPortal = targetPortal;
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
