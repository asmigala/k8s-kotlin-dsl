
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
    "awsElasticBlockStore",
    "azureDisk",
    "azureFile",
    "cephfs",
    "cinder",
    "configMap",
    "csi",
    "downwardAPI",
    "emptyDir",
    "fc",
    "flexVolume",
    "flocker",
    "gcePersistentDisk",
    "gitRepo",
    "glusterfs",
    "hostPath",
    "iscsi",
    "name",
    "nfs",
    "persistentVolumeClaim",
    "photonPersistentDisk",
    "portworxVolume",
    "projected",
    "quobyte",
    "rbd",
    "scaleIO",
    "secret",
    "storageos",
    "vsphereVolume"
})
public class Volume implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("awsElasticBlockStore")
    @JsonPropertyDescription("")
    private AwsElasticBlockStore awsElasticBlockStore;
    /**
     * 
     */
    @JsonProperty("azureDisk")
    @JsonPropertyDescription("")
    private AzureDisk azureDisk;
    /**
     * 
     */
    @JsonProperty("azureFile")
    @JsonPropertyDescription("")
    private AzureFile azureFile;
    /**
     * 
     */
    @JsonProperty("cephfs")
    @JsonPropertyDescription("")
    private Cephfs cephfs;
    /**
     * 
     */
    @JsonProperty("cinder")
    @JsonPropertyDescription("")
    private Cinder cinder;
    /**
     * 
     */
    @JsonProperty("configMap")
    @JsonPropertyDescription("")
    private ConfigMap configMap;
    /**
     * 
     */
    @JsonProperty("csi")
    @JsonPropertyDescription("")
    private Csi csi;
    /**
     * 
     */
    @JsonProperty("downwardAPI")
    @JsonPropertyDescription("")
    private DownwardAPI downwardAPI;
    /**
     * 
     */
    @JsonProperty("emptyDir")
    @JsonPropertyDescription("")
    private EmptyDir emptyDir;
    /**
     * 
     */
    @JsonProperty("fc")
    @JsonPropertyDescription("")
    private Fc fc;
    /**
     * 
     */
    @JsonProperty("flexVolume")
    @JsonPropertyDescription("")
    private FlexVolume flexVolume;
    /**
     * 
     */
    @JsonProperty("flocker")
    @JsonPropertyDescription("")
    private Flocker flocker;
    /**
     * 
     */
    @JsonProperty("gcePersistentDisk")
    @JsonPropertyDescription("")
    private GcePersistentDisk gcePersistentDisk;
    /**
     * 
     */
    @JsonProperty("gitRepo")
    @JsonPropertyDescription("")
    private GitRepo gitRepo;
    /**
     * 
     */
    @JsonProperty("glusterfs")
    @JsonPropertyDescription("")
    private Glusterfs glusterfs;
    /**
     * 
     */
    @JsonProperty("hostPath")
    @JsonPropertyDescription("")
    private HostPath hostPath;
    /**
     * 
     */
    @JsonProperty("iscsi")
    @JsonPropertyDescription("")
    private Iscsi iscsi;
    /**
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("")
    private String name;
    /**
     * 
     */
    @JsonProperty("nfs")
    @JsonPropertyDescription("")
    private Nfs nfs;
    /**
     * 
     */
    @JsonProperty("persistentVolumeClaim")
    @JsonPropertyDescription("")
    private PersistentVolumeClaim persistentVolumeClaim;
    /**
     * 
     */
    @JsonProperty("photonPersistentDisk")
    @JsonPropertyDescription("")
    private PhotonPersistentDisk photonPersistentDisk;
    /**
     * 
     */
    @JsonProperty("portworxVolume")
    @JsonPropertyDescription("")
    private PortworxVolume portworxVolume;
    /**
     * 
     */
    @JsonProperty("projected")
    @JsonPropertyDescription("")
    private Projected projected;
    /**
     * 
     */
    @JsonProperty("quobyte")
    @JsonPropertyDescription("")
    private Quobyte quobyte;
    /**
     * 
     */
    @JsonProperty("rbd")
    @JsonPropertyDescription("")
    private Rbd rbd;
    /**
     * 
     */
    @JsonProperty("scaleIO")
    @JsonPropertyDescription("")
    private ScaleIO scaleIO;
    /**
     * 
     */
    @JsonProperty("secret")
    @JsonPropertyDescription("")
    private Secret secret;
    /**
     * 
     */
    @JsonProperty("storageos")
    @JsonPropertyDescription("")
    private Storageos storageos;
    /**
     * 
     */
    @JsonProperty("vsphereVolume")
    @JsonPropertyDescription("")
    private VsphereVolume vsphereVolume;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Volume() {
    }

    /**
     * 
     * @param quobyte
     * @param azureFile
     * @param flexVolume
     * @param secret
     * @param projected
     * @param cephfs
     * @param scaleIO
     * @param emptyDir
     * @param glusterfs
     * @param gcePersistentDisk
     * @param photonPersistentDisk
     * @param azureDisk
     * @param cinder
     * @param downwardAPI
     * @param awsElasticBlockStore
     * @param flocker
     * @param iscsi
     * @param rbd
     * @param configMap
     * @param storageos
     * @param csi
     * @param name
     * @param nfs
     * @param persistentVolumeClaim
     * @param gitRepo
     * @param portworxVolume
     * @param vsphereVolume
     * @param fc
     * @param hostPath
     */
    public Volume(AwsElasticBlockStore awsElasticBlockStore, AzureDisk azureDisk, AzureFile azureFile, Cephfs cephfs, Cinder cinder, ConfigMap configMap, Csi csi, DownwardAPI downwardAPI, EmptyDir emptyDir, Fc fc, FlexVolume flexVolume, Flocker flocker, GcePersistentDisk gcePersistentDisk, GitRepo gitRepo, Glusterfs glusterfs, HostPath hostPath, Iscsi iscsi, String name, Nfs nfs, PersistentVolumeClaim persistentVolumeClaim, PhotonPersistentDisk photonPersistentDisk, PortworxVolume portworxVolume, Projected projected, Quobyte quobyte, Rbd rbd, ScaleIO scaleIO, Secret secret, Storageos storageos, VsphereVolume vsphereVolume) {
        super();
        this.awsElasticBlockStore = awsElasticBlockStore;
        this.azureDisk = azureDisk;
        this.azureFile = azureFile;
        this.cephfs = cephfs;
        this.cinder = cinder;
        this.configMap = configMap;
        this.csi = csi;
        this.downwardAPI = downwardAPI;
        this.emptyDir = emptyDir;
        this.fc = fc;
        this.flexVolume = flexVolume;
        this.flocker = flocker;
        this.gcePersistentDisk = gcePersistentDisk;
        this.gitRepo = gitRepo;
        this.glusterfs = glusterfs;
        this.hostPath = hostPath;
        this.iscsi = iscsi;
        this.name = name;
        this.nfs = nfs;
        this.persistentVolumeClaim = persistentVolumeClaim;
        this.photonPersistentDisk = photonPersistentDisk;
        this.portworxVolume = portworxVolume;
        this.projected = projected;
        this.quobyte = quobyte;
        this.rbd = rbd;
        this.scaleIO = scaleIO;
        this.secret = secret;
        this.storageos = storageos;
        this.vsphereVolume = vsphereVolume;
    }

    /**
     * 
     */
    @JsonProperty("awsElasticBlockStore")
    public AwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    /**
     * 
     */
    @JsonProperty("awsElasticBlockStore")
    public void setAwsElasticBlockStore(AwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    /**
     * 
     */
    @JsonProperty("azureDisk")
    public AzureDisk getAzureDisk() {
        return azureDisk;
    }

    /**
     * 
     */
    @JsonProperty("azureDisk")
    public void setAzureDisk(AzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    /**
     * 
     */
    @JsonProperty("azureFile")
    public AzureFile getAzureFile() {
        return azureFile;
    }

    /**
     * 
     */
    @JsonProperty("azureFile")
    public void setAzureFile(AzureFile azureFile) {
        this.azureFile = azureFile;
    }

    /**
     * 
     */
    @JsonProperty("cephfs")
    public Cephfs getCephfs() {
        return cephfs;
    }

    /**
     * 
     */
    @JsonProperty("cephfs")
    public void setCephfs(Cephfs cephfs) {
        this.cephfs = cephfs;
    }

    /**
     * 
     */
    @JsonProperty("cinder")
    public Cinder getCinder() {
        return cinder;
    }

    /**
     * 
     */
    @JsonProperty("cinder")
    public void setCinder(Cinder cinder) {
        this.cinder = cinder;
    }

    /**
     * 
     */
    @JsonProperty("configMap")
    public ConfigMap getConfigMap() {
        return configMap;
    }

    /**
     * 
     */
    @JsonProperty("configMap")
    public void setConfigMap(ConfigMap configMap) {
        this.configMap = configMap;
    }

    /**
     * 
     */
    @JsonProperty("csi")
    public Csi getCsi() {
        return csi;
    }

    /**
     * 
     */
    @JsonProperty("csi")
    public void setCsi(Csi csi) {
        this.csi = csi;
    }

    /**
     * 
     */
    @JsonProperty("downwardAPI")
    public DownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    /**
     * 
     */
    @JsonProperty("downwardAPI")
    public void setDownwardAPI(DownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    /**
     * 
     */
    @JsonProperty("emptyDir")
    public EmptyDir getEmptyDir() {
        return emptyDir;
    }

    /**
     * 
     */
    @JsonProperty("emptyDir")
    public void setEmptyDir(EmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    /**
     * 
     */
    @JsonProperty("fc")
    public Fc getFc() {
        return fc;
    }

    /**
     * 
     */
    @JsonProperty("fc")
    public void setFc(Fc fc) {
        this.fc = fc;
    }

    /**
     * 
     */
    @JsonProperty("flexVolume")
    public FlexVolume getFlexVolume() {
        return flexVolume;
    }

    /**
     * 
     */
    @JsonProperty("flexVolume")
    public void setFlexVolume(FlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    /**
     * 
     */
    @JsonProperty("flocker")
    public Flocker getFlocker() {
        return flocker;
    }

    /**
     * 
     */
    @JsonProperty("flocker")
    public void setFlocker(Flocker flocker) {
        this.flocker = flocker;
    }

    /**
     * 
     */
    @JsonProperty("gcePersistentDisk")
    public GcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    /**
     * 
     */
    @JsonProperty("gcePersistentDisk")
    public void setGcePersistentDisk(GcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    /**
     * 
     */
    @JsonProperty("gitRepo")
    public GitRepo getGitRepo() {
        return gitRepo;
    }

    /**
     * 
     */
    @JsonProperty("gitRepo")
    public void setGitRepo(GitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    /**
     * 
     */
    @JsonProperty("glusterfs")
    public Glusterfs getGlusterfs() {
        return glusterfs;
    }

    /**
     * 
     */
    @JsonProperty("glusterfs")
    public void setGlusterfs(Glusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    /**
     * 
     */
    @JsonProperty("hostPath")
    public HostPath getHostPath() {
        return hostPath;
    }

    /**
     * 
     */
    @JsonProperty("hostPath")
    public void setHostPath(HostPath hostPath) {
        this.hostPath = hostPath;
    }

    /**
     * 
     */
    @JsonProperty("iscsi")
    public Iscsi getIscsi() {
        return iscsi;
    }

    /**
     * 
     */
    @JsonProperty("iscsi")
    public void setIscsi(Iscsi iscsi) {
        this.iscsi = iscsi;
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
    @JsonProperty("nfs")
    public Nfs getNfs() {
        return nfs;
    }

    /**
     * 
     */
    @JsonProperty("nfs")
    public void setNfs(Nfs nfs) {
        this.nfs = nfs;
    }

    /**
     * 
     */
    @JsonProperty("persistentVolumeClaim")
    public PersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    /**
     * 
     */
    @JsonProperty("persistentVolumeClaim")
    public void setPersistentVolumeClaim(PersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    /**
     * 
     */
    @JsonProperty("photonPersistentDisk")
    public PhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    /**
     * 
     */
    @JsonProperty("photonPersistentDisk")
    public void setPhotonPersistentDisk(PhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    /**
     * 
     */
    @JsonProperty("portworxVolume")
    public PortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    /**
     * 
     */
    @JsonProperty("portworxVolume")
    public void setPortworxVolume(PortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    /**
     * 
     */
    @JsonProperty("projected")
    public Projected getProjected() {
        return projected;
    }

    /**
     * 
     */
    @JsonProperty("projected")
    public void setProjected(Projected projected) {
        this.projected = projected;
    }

    /**
     * 
     */
    @JsonProperty("quobyte")
    public Quobyte getQuobyte() {
        return quobyte;
    }

    /**
     * 
     */
    @JsonProperty("quobyte")
    public void setQuobyte(Quobyte quobyte) {
        this.quobyte = quobyte;
    }

    /**
     * 
     */
    @JsonProperty("rbd")
    public Rbd getRbd() {
        return rbd;
    }

    /**
     * 
     */
    @JsonProperty("rbd")
    public void setRbd(Rbd rbd) {
        this.rbd = rbd;
    }

    /**
     * 
     */
    @JsonProperty("scaleIO")
    public ScaleIO getScaleIO() {
        return scaleIO;
    }

    /**
     * 
     */
    @JsonProperty("scaleIO")
    public void setScaleIO(ScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    /**
     * 
     */
    @JsonProperty("secret")
    public Secret getSecret() {
        return secret;
    }

    /**
     * 
     */
    @JsonProperty("secret")
    public void setSecret(Secret secret) {
        this.secret = secret;
    }

    /**
     * 
     */
    @JsonProperty("storageos")
    public Storageos getStorageos() {
        return storageos;
    }

    /**
     * 
     */
    @JsonProperty("storageos")
    public void setStorageos(Storageos storageos) {
        this.storageos = storageos;
    }

    /**
     * 
     */
    @JsonProperty("vsphereVolume")
    public VsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    /**
     * 
     */
    @JsonProperty("vsphereVolume")
    public void setVsphereVolume(VsphereVolume vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
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
