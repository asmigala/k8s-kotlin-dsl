
package org.apache.camel.k8s.api.types.v1;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.camel.k8s.api.v1.Affinity;
import org.apache.camel.k8s.api.v1.Artifact;
import org.apache.camel.k8s.api.v1.AwsElasticBlockStore;
import org.apache.camel.k8s.api.v1.AzureDisk;
import org.apache.camel.k8s.api.v1.AzureFile;
import org.apache.camel.k8s.api.v1.BuildList;
import org.apache.camel.k8s.api.v1.Builder;
import org.apache.camel.k8s.api.v1.Capabilities;
import org.apache.camel.k8s.api.v1.Cephfs;
import org.apache.camel.k8s.api.v1.Cinder;
import org.apache.camel.k8s.api.v1.Condition;
import org.apache.camel.k8s.api.v1.ConfigMap;
import org.apache.camel.k8s.api.v1.ConfigMapKeyRef;
import org.apache.camel.k8s.api.v1.Csi;
import org.apache.camel.k8s.api.v1.Dependencie;
import org.apache.camel.k8s.api.v1.Divisor;
import org.apache.camel.k8s.api.v1.DownwardAPI;
import org.apache.camel.k8s.api.v1.EmptyDir;
import org.apache.camel.k8s.api.v1.Env;
import org.apache.camel.k8s.api.v1.Failure;
import org.apache.camel.k8s.api.v1.Fc;
import org.apache.camel.k8s.api.v1.FieldRef;
import org.apache.camel.k8s.api.v1.FlexVolume;
import org.apache.camel.k8s.api.v1.Flocker;
import org.apache.camel.k8s.api.v1.GcePersistentDisk;
import org.apache.camel.k8s.api.v1.GitRepo;
import org.apache.camel.k8s.api.v1.Glusterfs;
import org.apache.camel.k8s.api.v1.HostPath;
import org.apache.camel.k8s.api.v1.Image;
import org.apache.camel.k8s.api.v1.Iscsi;
import org.apache.camel.k8s.api.v1.Item;
import org.apache.camel.k8s.api.v1.MatchExpression;
import org.apache.camel.k8s.api.v1.MatchField;
import org.apache.camel.k8s.api.v1.Maven;
import org.apache.camel.k8s.api.v1.Meta;
import org.apache.camel.k8s.api.v1.Nfs;
import org.apache.camel.k8s.api.v1.NodeAffinity;
import org.apache.camel.k8s.api.v1.NodePublishSecretRef;
import org.apache.camel.k8s.api.v1.NodeSelectorTerm;
import org.apache.camel.k8s.api.v1.Options;
import org.apache.camel.k8s.api.v1.PersistentVolumeClaim;
import org.apache.camel.k8s.api.v1.PhotonPersistentDisk;
import org.apache.camel.k8s.api.v1.PodAffinity;
import org.apache.camel.k8s.api.v1.PodAntiAffinity;
import org.apache.camel.k8s.api.v1.PortworxVolume;
import org.apache.camel.k8s.api.v1.Preference;
import org.apache.camel.k8s.api.v1.PreferredDuringSchedulingIgnoredDuringExecution;
import org.apache.camel.k8s.api.v1.Projected;
import org.apache.camel.k8s.api.v1.Properties;
import org.apache.camel.k8s.api.v1.Quobyte;
import org.apache.camel.k8s.api.v1.Rbd;
import org.apache.camel.k8s.api.v1.Recovery;
import org.apache.camel.k8s.api.v1.RequiredDuringSchedulingIgnoredDuringExecution;
import org.apache.camel.k8s.api.v1.Resource;
import org.apache.camel.k8s.api.v1.ResourceFieldRef;
import org.apache.camel.k8s.api.v1.Runtime;
import org.apache.camel.k8s.api.v1.ScaleIO;
import org.apache.camel.k8s.api.v1.SeLinuxOptions;
import org.apache.camel.k8s.api.v1.Secret;
import org.apache.camel.k8s.api.v1.SecretKeyRef;
import org.apache.camel.k8s.api.v1.SecretRef;
import org.apache.camel.k8s.api.v1.SecurityContext;
import org.apache.camel.k8s.api.v1.Settings;
import org.apache.camel.k8s.api.v1.SizeLimit;
import org.apache.camel.k8s.api.v1.Source;
import org.apache.camel.k8s.api.v1.Spec;
import org.apache.camel.k8s.api.v1.Status;
import org.apache.camel.k8s.api.v1.Storageos;
import org.apache.camel.k8s.api.v1.Task;
import org.apache.camel.k8s.api.v1.ValueFrom;
import org.apache.camel.k8s.api.v1.Volume;
import org.apache.camel.k8s.api.v1.VolumeAttributes;
import org.apache.camel.k8s.api.v1.VolumeMount;
import org.apache.camel.k8s.api.v1.VsphereVolume;
import org.apache.camel.k8s.api.v1.WindowsOptions;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "affinity",
    "artifact",
    "awsElasticBlockStore",
    "azureDisk",
    "azureFile",
    "build",
    "buildList",
    "builder",
    "capabilities",
    "cephfs",
    "cinder",
    "condition",
    "configMap",
    "configMapKeyRef",
    "csi",
    "dependencie",
    "divisor",
    "downwardAPI",
    "emptyDir",
    "env",
    "failure",
    "fc",
    "fieldRef",
    "flexVolume",
    "flocker",
    "gcePersistentDisk",
    "gitRepo",
    "glusterfs",
    "hostPath",
    "image",
    "iscsi",
    "item",
    "matchExpression",
    "matchField",
    "maven",
    "meta",
    "nfs",
    "nodeAffinity",
    "nodePublishSecretRef",
    "nodeSelectorTerm",
    "options",
    "persistentVolumeClaim",
    "photonPersistentDisk",
    "podAffinity",
    "podAntiAffinity",
    "portworxVolume",
    "preference",
    "preferredDuringSchedulingIgnoredDuringExecution",
    "projected",
    "properties",
    "quobyte",
    "rbd",
    "recovery",
    "requiredDuringSchedulingIgnoredDuringExecution",
    "resource",
    "resourceFieldRef",
    "runtime",
    "scaleIO",
    "seLinuxOptions",
    "secret",
    "secretKeyRef",
    "secretRef",
    "securityContext",
    "settings",
    "sizeLimit",
    "source",
    "spec",
    "status",
    "storageos",
    "task",
    "valueFrom",
    "volume",
    "volumeAttributes",
    "volumeMount",
    "vsphereVolume",
    "windowsOptions"
})
public class Build {

    /**
     * 
     */
    @JsonProperty("affinity")
    @JsonPropertyDescription("")
    private Affinity affinity;
    /**
     * 
     */
    @JsonProperty("artifact")
    @JsonPropertyDescription("")
    private Artifact artifact;
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
    @JsonProperty("build")
    @JsonPropertyDescription("")
    private org.apache.camel.k8s.api.v1.Build build;
    /**
     * 
     */
    @JsonProperty("buildList")
    @JsonPropertyDescription("")
    private BuildList buildList;
    /**
     * 
     */
    @JsonProperty("builder")
    @JsonPropertyDescription("")
    private Builder builder;
    /**
     * 
     */
    @JsonProperty("capabilities")
    @JsonPropertyDescription("")
    private Capabilities capabilities;
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
    @JsonProperty("condition")
    @JsonPropertyDescription("")
    private Condition condition;
    /**
     * 
     */
    @JsonProperty("configMap")
    @JsonPropertyDescription("")
    private ConfigMap configMap;
    /**
     * 
     */
    @JsonProperty("configMapKeyRef")
    @JsonPropertyDescription("")
    private ConfigMapKeyRef configMapKeyRef;
    /**
     * 
     */
    @JsonProperty("csi")
    @JsonPropertyDescription("")
    private Csi csi;
    /**
     * 
     */
    @JsonProperty("dependencie")
    @JsonPropertyDescription("")
    private Dependencie dependencie;
    /**
     * 
     */
    @JsonProperty("divisor")
    @JsonPropertyDescription("")
    private Divisor divisor;
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
    @JsonProperty("env")
    @JsonPropertyDescription("")
    private Env env;
    /**
     * 
     */
    @JsonProperty("failure")
    @JsonPropertyDescription("")
    private Failure failure;
    /**
     * 
     */
    @JsonProperty("fc")
    @JsonPropertyDescription("")
    private Fc fc;
    /**
     * 
     */
    @JsonProperty("fieldRef")
    @JsonPropertyDescription("")
    private FieldRef fieldRef;
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
    @JsonProperty("image")
    @JsonPropertyDescription("")
    private Image image;
    /**
     * 
     */
    @JsonProperty("iscsi")
    @JsonPropertyDescription("")
    private Iscsi iscsi;
    /**
     * 
     */
    @JsonProperty("item")
    @JsonPropertyDescription("")
    private Item item;
    /**
     * 
     */
    @JsonProperty("matchExpression")
    @JsonPropertyDescription("")
    private MatchExpression matchExpression;
    /**
     * 
     */
    @JsonProperty("matchField")
    @JsonPropertyDescription("")
    private MatchField matchField;
    /**
     * 
     */
    @JsonProperty("maven")
    @JsonPropertyDescription("")
    private Maven maven;
    /**
     * 
     */
    @JsonProperty("meta")
    @JsonPropertyDescription("")
    private Meta meta;
    /**
     * 
     */
    @JsonProperty("nfs")
    @JsonPropertyDescription("")
    private Nfs nfs;
    /**
     * 
     */
    @JsonProperty("nodeAffinity")
    @JsonPropertyDescription("")
    private NodeAffinity nodeAffinity;
    /**
     * 
     */
    @JsonProperty("nodePublishSecretRef")
    @JsonPropertyDescription("")
    private NodePublishSecretRef nodePublishSecretRef;
    /**
     * 
     */
    @JsonProperty("nodeSelectorTerm")
    @JsonPropertyDescription("")
    private NodeSelectorTerm nodeSelectorTerm;
    /**
     * 
     */
    @JsonProperty("options")
    @JsonPropertyDescription("")
    private Options options;
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
    @JsonProperty("podAffinity")
    @JsonPropertyDescription("")
    private PodAffinity podAffinity;
    /**
     * 
     */
    @JsonProperty("podAntiAffinity")
    @JsonPropertyDescription("")
    private PodAntiAffinity podAntiAffinity;
    /**
     * 
     */
    @JsonProperty("portworxVolume")
    @JsonPropertyDescription("")
    private PortworxVolume portworxVolume;
    /**
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("")
    private Preference preference;
    /**
     * 
     */
    @JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
    @JsonPropertyDescription("")
    private PreferredDuringSchedulingIgnoredDuringExecution preferredDuringSchedulingIgnoredDuringExecution;
    /**
     * 
     */
    @JsonProperty("projected")
    @JsonPropertyDescription("")
    private Projected projected;
    /**
     * 
     */
    @JsonProperty("properties")
    @JsonPropertyDescription("")
    private Properties properties;
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
    @JsonProperty("recovery")
    @JsonPropertyDescription("")
    private Recovery recovery;
    /**
     * 
     */
    @JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
    @JsonPropertyDescription("")
    private RequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution;
    /**
     * 
     */
    @JsonProperty("resource")
    @JsonPropertyDescription("")
    private Resource resource;
    /**
     * 
     */
    @JsonProperty("resourceFieldRef")
    @JsonPropertyDescription("")
    private ResourceFieldRef resourceFieldRef;
    /**
     * 
     */
    @JsonProperty("runtime")
    @JsonPropertyDescription("")
    private Runtime runtime;
    /**
     * 
     */
    @JsonProperty("scaleIO")
    @JsonPropertyDescription("")
    private ScaleIO scaleIO;
    /**
     * 
     */
    @JsonProperty("seLinuxOptions")
    @JsonPropertyDescription("")
    private SeLinuxOptions seLinuxOptions;
    /**
     * 
     */
    @JsonProperty("secret")
    @JsonPropertyDescription("")
    private Secret secret;
    /**
     * 
     */
    @JsonProperty("secretKeyRef")
    @JsonPropertyDescription("")
    private SecretKeyRef secretKeyRef;
    /**
     * 
     */
    @JsonProperty("secretRef")
    @JsonPropertyDescription("")
    private SecretRef secretRef;
    /**
     * 
     */
    @JsonProperty("securityContext")
    @JsonPropertyDescription("")
    private SecurityContext securityContext;
    /**
     * 
     */
    @JsonProperty("settings")
    @JsonPropertyDescription("")
    private Settings settings;
    /**
     * 
     */
    @JsonProperty("sizeLimit")
    @JsonPropertyDescription("")
    private SizeLimit sizeLimit;
    /**
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("")
    private Source source;
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
    /**
     * 
     */
    @JsonProperty("storageos")
    @JsonPropertyDescription("")
    private Storageos storageos;
    /**
     * 
     */
    @JsonProperty("task")
    @JsonPropertyDescription("")
    private Task task;
    /**
     * 
     */
    @JsonProperty("valueFrom")
    @JsonPropertyDescription("")
    private ValueFrom valueFrom;
    /**
     * 
     */
    @JsonProperty("volume")
    @JsonPropertyDescription("")
    private Volume volume;
    /**
     * 
     */
    @JsonProperty("volumeAttributes")
    @JsonPropertyDescription("")
    private VolumeAttributes volumeAttributes;
    /**
     * 
     */
    @JsonProperty("volumeMount")
    @JsonPropertyDescription("")
    private VolumeMount volumeMount;
    /**
     * 
     */
    @JsonProperty("vsphereVolume")
    @JsonPropertyDescription("")
    private VsphereVolume vsphereVolume;
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
    public Build() {
    }

    /**
     * 
     * @param matchExpression
     * @param seLinuxOptions
     * @param azureFile
     * @param flexVolume
     * @param resourceFieldRef
     * @param securityContext
     * @param source
     * @param podAntiAffinity
     * @param spec
     * @param artifact
     * @param cephfs
     * @param windowsOptions
     * @param scaleIO
     * @param emptyDir
     * @param options
     * @param fieldRef
     * @param podAffinity
     * @param gcePersistentDisk
     * @param image
     * @param settings
     * @param item
     * @param cinder
     * @param downwardAPI
     * @param resource
     * @param awsElasticBlockStore
     * @param maven
     * @param preference
     * @param secretRef
     * @param runtime
     * @param flocker
     * @param volume
     * @param sizeLimit
     * @param condition
     * @param task
     * @param rbd
     * @param configMap
     * @param failure
     * @param meta
     * @param storageos
     * @param nfs
     * @param gitRepo
     * @param portworxVolume
     * @param fc
     * @param volumeAttributes
     * @param affinity
     * @param nodeSelectorTerm
     * @param preferredDuringSchedulingIgnoredDuringExecution
     * @param status
     * @param quobyte
     * @param volumeMount
     * @param recovery
     * @param secret
     * @param secretKeyRef
     * @param projected
     * @param divisor
     * @param nodePublishSecretRef
     * @param buildList
     * @param builder
     * @param configMapKeyRef
     * @param glusterfs
     * @param requiredDuringSchedulingIgnoredDuringExecution
     * @param dependencie
     * @param photonPersistentDisk
     * @param azureDisk
     * @param capabilities
     * @param nodeAffinity
     * @param env
     * @param valueFrom
     * @param iscsi
     * @param build
     * @param csi
     * @param persistentVolumeClaim
     * @param vsphereVolume
     * @param matchField
     * @param hostPath
     * @param properties
     */
    public Build(Affinity affinity, Artifact artifact, AwsElasticBlockStore awsElasticBlockStore, AzureDisk azureDisk, AzureFile azureFile, org.apache.camel.k8s.api.v1.Build build, BuildList buildList, Builder builder, Capabilities capabilities, Cephfs cephfs, Cinder cinder, Condition condition, ConfigMap configMap, ConfigMapKeyRef configMapKeyRef, Csi csi, Dependencie dependencie, Divisor divisor, DownwardAPI downwardAPI, EmptyDir emptyDir, Env env, Failure failure, Fc fc, FieldRef fieldRef, FlexVolume flexVolume, Flocker flocker, GcePersistentDisk gcePersistentDisk, GitRepo gitRepo, Glusterfs glusterfs, HostPath hostPath, Image image, Iscsi iscsi, Item item, MatchExpression matchExpression, MatchField matchField, Maven maven, Meta meta, Nfs nfs, NodeAffinity nodeAffinity, NodePublishSecretRef nodePublishSecretRef, NodeSelectorTerm nodeSelectorTerm, Options options, PersistentVolumeClaim persistentVolumeClaim, PhotonPersistentDisk photonPersistentDisk, PodAffinity podAffinity, PodAntiAffinity podAntiAffinity, PortworxVolume portworxVolume, Preference preference, PreferredDuringSchedulingIgnoredDuringExecution preferredDuringSchedulingIgnoredDuringExecution, Projected projected, Properties properties, Quobyte quobyte, Rbd rbd, Recovery recovery, RequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution, Resource resource, ResourceFieldRef resourceFieldRef, Runtime runtime, ScaleIO scaleIO, SeLinuxOptions seLinuxOptions, Secret secret, SecretKeyRef secretKeyRef, SecretRef secretRef, SecurityContext securityContext, Settings settings, SizeLimit sizeLimit, Source source, Spec spec, Status status, Storageos storageos, Task task, ValueFrom valueFrom, Volume volume, VolumeAttributes volumeAttributes, VolumeMount volumeMount, VsphereVolume vsphereVolume, WindowsOptions windowsOptions) {
        super();
        this.affinity = affinity;
        this.artifact = artifact;
        this.awsElasticBlockStore = awsElasticBlockStore;
        this.azureDisk = azureDisk;
        this.azureFile = azureFile;
        this.build = build;
        this.buildList = buildList;
        this.builder = builder;
        this.capabilities = capabilities;
        this.cephfs = cephfs;
        this.cinder = cinder;
        this.condition = condition;
        this.configMap = configMap;
        this.configMapKeyRef = configMapKeyRef;
        this.csi = csi;
        this.dependencie = dependencie;
        this.divisor = divisor;
        this.downwardAPI = downwardAPI;
        this.emptyDir = emptyDir;
        this.env = env;
        this.failure = failure;
        this.fc = fc;
        this.fieldRef = fieldRef;
        this.flexVolume = flexVolume;
        this.flocker = flocker;
        this.gcePersistentDisk = gcePersistentDisk;
        this.gitRepo = gitRepo;
        this.glusterfs = glusterfs;
        this.hostPath = hostPath;
        this.image = image;
        this.iscsi = iscsi;
        this.item = item;
        this.matchExpression = matchExpression;
        this.matchField = matchField;
        this.maven = maven;
        this.meta = meta;
        this.nfs = nfs;
        this.nodeAffinity = nodeAffinity;
        this.nodePublishSecretRef = nodePublishSecretRef;
        this.nodeSelectorTerm = nodeSelectorTerm;
        this.options = options;
        this.persistentVolumeClaim = persistentVolumeClaim;
        this.photonPersistentDisk = photonPersistentDisk;
        this.podAffinity = podAffinity;
        this.podAntiAffinity = podAntiAffinity;
        this.portworxVolume = portworxVolume;
        this.preference = preference;
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        this.projected = projected;
        this.properties = properties;
        this.quobyte = quobyte;
        this.rbd = rbd;
        this.recovery = recovery;
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
        this.resource = resource;
        this.resourceFieldRef = resourceFieldRef;
        this.runtime = runtime;
        this.scaleIO = scaleIO;
        this.seLinuxOptions = seLinuxOptions;
        this.secret = secret;
        this.secretKeyRef = secretKeyRef;
        this.secretRef = secretRef;
        this.securityContext = securityContext;
        this.settings = settings;
        this.sizeLimit = sizeLimit;
        this.source = source;
        this.spec = spec;
        this.status = status;
        this.storageos = storageos;
        this.task = task;
        this.valueFrom = valueFrom;
        this.volume = volume;
        this.volumeAttributes = volumeAttributes;
        this.volumeMount = volumeMount;
        this.vsphereVolume = vsphereVolume;
        this.windowsOptions = windowsOptions;
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
    @JsonProperty("artifact")
    public Artifact getArtifact() {
        return artifact;
    }

    /**
     * 
     */
    @JsonProperty("artifact")
    public void setArtifact(Artifact artifact) {
        this.artifact = artifact;
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
    @JsonProperty("build")
    public org.apache.camel.k8s.api.v1.Build getBuild() {
        return build;
    }

    /**
     * 
     */
    @JsonProperty("build")
    public void setBuild(org.apache.camel.k8s.api.v1.Build build) {
        this.build = build;
    }

    /**
     * 
     */
    @JsonProperty("buildList")
    public BuildList getBuildList() {
        return buildList;
    }

    /**
     * 
     */
    @JsonProperty("buildList")
    public void setBuildList(BuildList buildList) {
        this.buildList = buildList;
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
    @JsonProperty("condition")
    public Condition getCondition() {
        return condition;
    }

    /**
     * 
     */
    @JsonProperty("condition")
    public void setCondition(Condition condition) {
        this.condition = condition;
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
    @JsonProperty("configMapKeyRef")
    public ConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    /**
     * 
     */
    @JsonProperty("configMapKeyRef")
    public void setConfigMapKeyRef(ConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
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
    @JsonProperty("divisor")
    public Divisor getDivisor() {
        return divisor;
    }

    /**
     * 
     */
    @JsonProperty("divisor")
    public void setDivisor(Divisor divisor) {
        this.divisor = divisor;
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
    @JsonProperty("env")
    public Env getEnv() {
        return env;
    }

    /**
     * 
     */
    @JsonProperty("env")
    public void setEnv(Env env) {
        this.env = env;
    }

    /**
     * 
     */
    @JsonProperty("failure")
    public Failure getFailure() {
        return failure;
    }

    /**
     * 
     */
    @JsonProperty("failure")
    public void setFailure(Failure failure) {
        this.failure = failure;
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
    @JsonProperty("fieldRef")
    public FieldRef getFieldRef() {
        return fieldRef;
    }

    /**
     * 
     */
    @JsonProperty("fieldRef")
    public void setFieldRef(FieldRef fieldRef) {
        this.fieldRef = fieldRef;
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
    @JsonProperty("item")
    public Item getItem() {
        return item;
    }

    /**
     * 
     */
    @JsonProperty("item")
    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * 
     */
    @JsonProperty("matchExpression")
    public MatchExpression getMatchExpression() {
        return matchExpression;
    }

    /**
     * 
     */
    @JsonProperty("matchExpression")
    public void setMatchExpression(MatchExpression matchExpression) {
        this.matchExpression = matchExpression;
    }

    /**
     * 
     */
    @JsonProperty("matchField")
    public MatchField getMatchField() {
        return matchField;
    }

    /**
     * 
     */
    @JsonProperty("matchField")
    public void setMatchField(MatchField matchField) {
        this.matchField = matchField;
    }

    /**
     * 
     */
    @JsonProperty("maven")
    public Maven getMaven() {
        return maven;
    }

    /**
     * 
     */
    @JsonProperty("maven")
    public void setMaven(Maven maven) {
        this.maven = maven;
    }

    /**
     * 
     */
    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    /**
     * 
     */
    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
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
    @JsonProperty("nodeAffinity")
    public NodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    /**
     * 
     */
    @JsonProperty("nodeAffinity")
    public void setNodeAffinity(NodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    /**
     * 
     */
    @JsonProperty("nodePublishSecretRef")
    public NodePublishSecretRef getNodePublishSecretRef() {
        return nodePublishSecretRef;
    }

    /**
     * 
     */
    @JsonProperty("nodePublishSecretRef")
    public void setNodePublishSecretRef(NodePublishSecretRef nodePublishSecretRef) {
        this.nodePublishSecretRef = nodePublishSecretRef;
    }

    /**
     * 
     */
    @JsonProperty("nodeSelectorTerm")
    public NodeSelectorTerm getNodeSelectorTerm() {
        return nodeSelectorTerm;
    }

    /**
     * 
     */
    @JsonProperty("nodeSelectorTerm")
    public void setNodeSelectorTerm(NodeSelectorTerm nodeSelectorTerm) {
        this.nodeSelectorTerm = nodeSelectorTerm;
    }

    /**
     * 
     */
    @JsonProperty("options")
    public Options getOptions() {
        return options;
    }

    /**
     * 
     */
    @JsonProperty("options")
    public void setOptions(Options options) {
        this.options = options;
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
    @JsonProperty("podAffinity")
    public PodAffinity getPodAffinity() {
        return podAffinity;
    }

    /**
     * 
     */
    @JsonProperty("podAffinity")
    public void setPodAffinity(PodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    /**
     * 
     */
    @JsonProperty("podAntiAffinity")
    public PodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    /**
     * 
     */
    @JsonProperty("podAntiAffinity")
    public void setPodAntiAffinity(PodAntiAffinity podAntiAffinity) {
        this.podAntiAffinity = podAntiAffinity;
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
    @JsonProperty("preference")
    public Preference getPreference() {
        return preference;
    }

    /**
     * 
     */
    @JsonProperty("preference")
    public void setPreference(Preference preference) {
        this.preference = preference;
    }

    /**
     * 
     */
    @JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
    public PreferredDuringSchedulingIgnoredDuringExecution getPreferredDuringSchedulingIgnoredDuringExecution() {
        return preferredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * 
     */
    @JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
    public void setPreferredDuringSchedulingIgnoredDuringExecution(PreferredDuringSchedulingIgnoredDuringExecution preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
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
    @JsonProperty("recovery")
    public Recovery getRecovery() {
        return recovery;
    }

    /**
     * 
     */
    @JsonProperty("recovery")
    public void setRecovery(Recovery recovery) {
        this.recovery = recovery;
    }

    /**
     * 
     */
    @JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
    public RequiredDuringSchedulingIgnoredDuringExecution getRequiredDuringSchedulingIgnoredDuringExecution() {
        return requiredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * 
     */
    @JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
    public void setRequiredDuringSchedulingIgnoredDuringExecution(RequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution) {
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * 
     */
    @JsonProperty("resource")
    public Resource getResource() {
        return resource;
    }

    /**
     * 
     */
    @JsonProperty("resource")
    public void setResource(Resource resource) {
        this.resource = resource;
    }

    /**
     * 
     */
    @JsonProperty("resourceFieldRef")
    public ResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    /**
     * 
     */
    @JsonProperty("resourceFieldRef")
    public void setResourceFieldRef(ResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
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
    @JsonProperty("secretKeyRef")
    public SecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    /**
     * 
     */
    @JsonProperty("secretKeyRef")
    public void setSecretKeyRef(SecretKeyRef secretKeyRef) {
        this.secretKeyRef = secretKeyRef;
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
    @JsonProperty("settings")
    public Settings getSettings() {
        return settings;
    }

    /**
     * 
     */
    @JsonProperty("settings")
    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    /**
     * 
     */
    @JsonProperty("sizeLimit")
    public SizeLimit getSizeLimit() {
        return sizeLimit;
    }

    /**
     * 
     */
    @JsonProperty("sizeLimit")
    public void setSizeLimit(SizeLimit sizeLimit) {
        this.sizeLimit = sizeLimit;
    }

    /**
     * 
     */
    @JsonProperty("source")
    public Source getSource() {
        return source;
    }

    /**
     * 
     */
    @JsonProperty("source")
    public void setSource(Source source) {
        this.source = source;
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
    @JsonProperty("task")
    public Task getTask() {
        return task;
    }

    /**
     * 
     */
    @JsonProperty("task")
    public void setTask(Task task) {
        this.task = task;
    }

    /**
     * 
     */
    @JsonProperty("valueFrom")
    public ValueFrom getValueFrom() {
        return valueFrom;
    }

    /**
     * 
     */
    @JsonProperty("valueFrom")
    public void setValueFrom(ValueFrom valueFrom) {
        this.valueFrom = valueFrom;
    }

    /**
     * 
     */
    @JsonProperty("volume")
    public Volume getVolume() {
        return volume;
    }

    /**
     * 
     */
    @JsonProperty("volume")
    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    /**
     * 
     */
    @JsonProperty("volumeAttributes")
    public VolumeAttributes getVolumeAttributes() {
        return volumeAttributes;
    }

    /**
     * 
     */
    @JsonProperty("volumeAttributes")
    public void setVolumeAttributes(VolumeAttributes volumeAttributes) {
        this.volumeAttributes = volumeAttributes;
    }

    /**
     * 
     */
    @JsonProperty("volumeMount")
    public VolumeMount getVolumeMount() {
        return volumeMount;
    }

    /**
     * 
     */
    @JsonProperty("volumeMount")
    public void setVolumeMount(VolumeMount volumeMount) {
        this.volumeMount = volumeMount;
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
