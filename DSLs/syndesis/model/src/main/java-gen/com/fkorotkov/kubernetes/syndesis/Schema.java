
package com.fkorotkov.kubernetes.syndesis;

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
    "addons",
    "affinity",
    "backup",
    "components",
    "connectionPool",
    "database",
    "features",
    "grafana",
    "infraScheduling",
    "integrationScheduling",
    "jaeger",
    "knative",
    "limit",
    "matchExpression",
    "matchField",
    "maven",
    "meta",
    "nodeAffinity",
    "nodeSelectorTerm",
    "oauth",
    "ops",
    "podAffinity",
    "podAntiAffinity",
    "preference",
    "preferredDuringSchedulingIgnoredDuringExecution",
    "prometheus",
    "publicApi",
    "repositories",
    "request",
    "requiredDuringSchedulingIgnoredDuringExecution",
    "resources",
    "server",
    "spec",
    "status",
    "syndesis",
    "syndesisList",
    "todo",
    "toleration",
    "upgrade",
    "volumeLabels"
})
public class Schema {

    /**
     * 
     */
    @JsonProperty("addons")
    @JsonPropertyDescription("")
    private Addons addons;
    /**
     * 
     */
    @JsonProperty("affinity")
    @JsonPropertyDescription("")
    private Affinity affinity;
    /**
     * 
     */
    @JsonProperty("backup")
    @JsonPropertyDescription("")
    private Backup backup;
    /**
     * 
     */
    @JsonProperty("components")
    @JsonPropertyDescription("")
    private Components components;
    /**
     * 
     */
    @JsonProperty("connectionPool")
    @JsonPropertyDescription("")
    private ConnectionPool connectionPool;
    /**
     * 
     */
    @JsonProperty("database")
    @JsonPropertyDescription("")
    private Database database;
    /**
     * 
     */
    @JsonProperty("features")
    @JsonPropertyDescription("")
    private Features features;
    /**
     * 
     */
    @JsonProperty("grafana")
    @JsonPropertyDescription("")
    private Grafana grafana;
    /**
     * 
     */
    @JsonProperty("infraScheduling")
    @JsonPropertyDescription("")
    private InfraScheduling infraScheduling;
    /**
     * 
     */
    @JsonProperty("integrationScheduling")
    @JsonPropertyDescription("")
    private IntegrationScheduling integrationScheduling;
    /**
     * 
     */
    @JsonProperty("jaeger")
    @JsonPropertyDescription("")
    private Jaeger jaeger;
    /**
     * 
     */
    @JsonProperty("knative")
    @JsonPropertyDescription("")
    private Knative knative;
    /**
     * 
     */
    @JsonProperty("limit")
    @JsonPropertyDescription("")
    private Limit limit;
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
    @JsonProperty("nodeAffinity")
    @JsonPropertyDescription("")
    private NodeAffinity nodeAffinity;
    /**
     * 
     */
    @JsonProperty("nodeSelectorTerm")
    @JsonPropertyDescription("")
    private NodeSelectorTerm nodeSelectorTerm;
    /**
     * 
     */
    @JsonProperty("oauth")
    @JsonPropertyDescription("")
    private Oauth oauth;
    /**
     * 
     */
    @JsonProperty("ops")
    @JsonPropertyDescription("")
    private Ops ops;
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
    @JsonProperty("prometheus")
    @JsonPropertyDescription("")
    private Prometheus prometheus;
    /**
     * 
     */
    @JsonProperty("publicApi")
    @JsonPropertyDescription("")
    private PublicApi publicApi;
    /**
     * 
     */
    @JsonProperty("repositories")
    @JsonPropertyDescription("")
    private Repositories repositories;
    /**
     * 
     */
    @JsonProperty("request")
    @JsonPropertyDescription("")
    private Request request;
    /**
     * 
     */
    @JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
    @JsonPropertyDescription("")
    private RequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution;
    /**
     * 
     */
    @JsonProperty("resources")
    @JsonPropertyDescription("")
    private Resources resources;
    /**
     * 
     */
    @JsonProperty("server")
    @JsonPropertyDescription("")
    private Server server;
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
    @JsonProperty("syndesis")
    @JsonPropertyDescription("")
    private Syndesis syndesis;
    /**
     * 
     */
    @JsonProperty("syndesisList")
    @JsonPropertyDescription("")
    private SyndesisList syndesisList;
    /**
     * 
     */
    @JsonProperty("todo")
    @JsonPropertyDescription("")
    private Todo todo;
    /**
     * 
     */
    @JsonProperty("toleration")
    @JsonPropertyDescription("")
    private Toleration toleration;
    /**
     * 
     */
    @JsonProperty("upgrade")
    @JsonPropertyDescription("")
    private Upgrade upgrade;
    /**
     * 
     */
    @JsonProperty("volumeLabels")
    @JsonPropertyDescription("")
    private VolumeLabels volumeLabels;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Schema() {
    }

    /**
     * 
     * @param matchExpression
     * @param request
     * @param server
     * @param volumeLabels
     * @param backup
     * @param components
     * @param addons
     * @param publicApi
     * @param podAntiAffinity
     * @param spec
     * @param features
     * @param database
     * @param repositories
     * @param limit
     * @param prometheus
     * @param oauth
     * @param requiredDuringSchedulingIgnoredDuringExecution
     * @param podAffinity
     * @param upgrade
     * @param infraScheduling
     * @param maven
     * @param preference
     * @param integrationScheduling
     * @param connectionPool
     * @param resources
     * @param nodeAffinity
     * @param syndesisList
     * @param toleration
     * @param syndesis
     * @param jaeger
     * @param todo
     * @param ops
     * @param grafana
     * @param meta
     * @param matchField
     * @param affinity
     * @param knative
     * @param nodeSelectorTerm
     * @param preferredDuringSchedulingIgnoredDuringExecution
     * @param status
     */
    public Schema(Addons addons, Affinity affinity, Backup backup, Components components, ConnectionPool connectionPool, Database database, Features features, Grafana grafana, InfraScheduling infraScheduling, IntegrationScheduling integrationScheduling, Jaeger jaeger, Knative knative, Limit limit, MatchExpression matchExpression, MatchField matchField, Maven maven, Meta meta, NodeAffinity nodeAffinity, NodeSelectorTerm nodeSelectorTerm, Oauth oauth, Ops ops, PodAffinity podAffinity, PodAntiAffinity podAntiAffinity, Preference preference, PreferredDuringSchedulingIgnoredDuringExecution preferredDuringSchedulingIgnoredDuringExecution, Prometheus prometheus, PublicApi publicApi, Repositories repositories, Request request, RequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution, Resources resources, Server server, Spec spec, Status status, Syndesis syndesis, SyndesisList syndesisList, Todo todo, Toleration toleration, Upgrade upgrade, VolumeLabels volumeLabels) {
        super();
        this.addons = addons;
        this.affinity = affinity;
        this.backup = backup;
        this.components = components;
        this.connectionPool = connectionPool;
        this.database = database;
        this.features = features;
        this.grafana = grafana;
        this.infraScheduling = infraScheduling;
        this.integrationScheduling = integrationScheduling;
        this.jaeger = jaeger;
        this.knative = knative;
        this.limit = limit;
        this.matchExpression = matchExpression;
        this.matchField = matchField;
        this.maven = maven;
        this.meta = meta;
        this.nodeAffinity = nodeAffinity;
        this.nodeSelectorTerm = nodeSelectorTerm;
        this.oauth = oauth;
        this.ops = ops;
        this.podAffinity = podAffinity;
        this.podAntiAffinity = podAntiAffinity;
        this.preference = preference;
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        this.prometheus = prometheus;
        this.publicApi = publicApi;
        this.repositories = repositories;
        this.request = request;
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
        this.resources = resources;
        this.server = server;
        this.spec = spec;
        this.status = status;
        this.syndesis = syndesis;
        this.syndesisList = syndesisList;
        this.todo = todo;
        this.toleration = toleration;
        this.upgrade = upgrade;
        this.volumeLabels = volumeLabels;
    }

    /**
     * 
     */
    @JsonProperty("addons")
    public Addons getAddons() {
        return addons;
    }

    /**
     * 
     */
    @JsonProperty("addons")
    public void setAddons(Addons addons) {
        this.addons = addons;
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
    @JsonProperty("backup")
    public Backup getBackup() {
        return backup;
    }

    /**
     * 
     */
    @JsonProperty("backup")
    public void setBackup(Backup backup) {
        this.backup = backup;
    }

    /**
     * 
     */
    @JsonProperty("components")
    public Components getComponents() {
        return components;
    }

    /**
     * 
     */
    @JsonProperty("components")
    public void setComponents(Components components) {
        this.components = components;
    }

    /**
     * 
     */
    @JsonProperty("connectionPool")
    public ConnectionPool getConnectionPool() {
        return connectionPool;
    }

    /**
     * 
     */
    @JsonProperty("connectionPool")
    public void setConnectionPool(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    /**
     * 
     */
    @JsonProperty("database")
    public Database getDatabase() {
        return database;
    }

    /**
     * 
     */
    @JsonProperty("database")
    public void setDatabase(Database database) {
        this.database = database;
    }

    /**
     * 
     */
    @JsonProperty("features")
    public Features getFeatures() {
        return features;
    }

    /**
     * 
     */
    @JsonProperty("features")
    public void setFeatures(Features features) {
        this.features = features;
    }

    /**
     * 
     */
    @JsonProperty("grafana")
    public Grafana getGrafana() {
        return grafana;
    }

    /**
     * 
     */
    @JsonProperty("grafana")
    public void setGrafana(Grafana grafana) {
        this.grafana = grafana;
    }

    /**
     * 
     */
    @JsonProperty("infraScheduling")
    public InfraScheduling getInfraScheduling() {
        return infraScheduling;
    }

    /**
     * 
     */
    @JsonProperty("infraScheduling")
    public void setInfraScheduling(InfraScheduling infraScheduling) {
        this.infraScheduling = infraScheduling;
    }

    /**
     * 
     */
    @JsonProperty("integrationScheduling")
    public IntegrationScheduling getIntegrationScheduling() {
        return integrationScheduling;
    }

    /**
     * 
     */
    @JsonProperty("integrationScheduling")
    public void setIntegrationScheduling(IntegrationScheduling integrationScheduling) {
        this.integrationScheduling = integrationScheduling;
    }

    /**
     * 
     */
    @JsonProperty("jaeger")
    public Jaeger getJaeger() {
        return jaeger;
    }

    /**
     * 
     */
    @JsonProperty("jaeger")
    public void setJaeger(Jaeger jaeger) {
        this.jaeger = jaeger;
    }

    /**
     * 
     */
    @JsonProperty("knative")
    public Knative getKnative() {
        return knative;
    }

    /**
     * 
     */
    @JsonProperty("knative")
    public void setKnative(Knative knative) {
        this.knative = knative;
    }

    /**
     * 
     */
    @JsonProperty("limit")
    public Limit getLimit() {
        return limit;
    }

    /**
     * 
     */
    @JsonProperty("limit")
    public void setLimit(Limit limit) {
        this.limit = limit;
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
    @JsonProperty("oauth")
    public Oauth getOauth() {
        return oauth;
    }

    /**
     * 
     */
    @JsonProperty("oauth")
    public void setOauth(Oauth oauth) {
        this.oauth = oauth;
    }

    /**
     * 
     */
    @JsonProperty("ops")
    public Ops getOps() {
        return ops;
    }

    /**
     * 
     */
    @JsonProperty("ops")
    public void setOps(Ops ops) {
        this.ops = ops;
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
    @JsonProperty("prometheus")
    public Prometheus getPrometheus() {
        return prometheus;
    }

    /**
     * 
     */
    @JsonProperty("prometheus")
    public void setPrometheus(Prometheus prometheus) {
        this.prometheus = prometheus;
    }

    /**
     * 
     */
    @JsonProperty("publicApi")
    public PublicApi getPublicApi() {
        return publicApi;
    }

    /**
     * 
     */
    @JsonProperty("publicApi")
    public void setPublicApi(PublicApi publicApi) {
        this.publicApi = publicApi;
    }

    /**
     * 
     */
    @JsonProperty("repositories")
    public Repositories getRepositories() {
        return repositories;
    }

    /**
     * 
     */
    @JsonProperty("repositories")
    public void setRepositories(Repositories repositories) {
        this.repositories = repositories;
    }

    /**
     * 
     */
    @JsonProperty("request")
    public Request getRequest() {
        return request;
    }

    /**
     * 
     */
    @JsonProperty("request")
    public void setRequest(Request request) {
        this.request = request;
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
    @JsonProperty("resources")
    public Resources getResources() {
        return resources;
    }

    /**
     * 
     */
    @JsonProperty("resources")
    public void setResources(Resources resources) {
        this.resources = resources;
    }

    /**
     * 
     */
    @JsonProperty("server")
    public Server getServer() {
        return server;
    }

    /**
     * 
     */
    @JsonProperty("server")
    public void setServer(Server server) {
        this.server = server;
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
    @JsonProperty("syndesis")
    public Syndesis getSyndesis() {
        return syndesis;
    }

    /**
     * 
     */
    @JsonProperty("syndesis")
    public void setSyndesis(Syndesis syndesis) {
        this.syndesis = syndesis;
    }

    /**
     * 
     */
    @JsonProperty("syndesisList")
    public SyndesisList getSyndesisList() {
        return syndesisList;
    }

    /**
     * 
     */
    @JsonProperty("syndesisList")
    public void setSyndesisList(SyndesisList syndesisList) {
        this.syndesisList = syndesisList;
    }

    /**
     * 
     */
    @JsonProperty("todo")
    public Todo getTodo() {
        return todo;
    }

    /**
     * 
     */
    @JsonProperty("todo")
    public void setTodo(Todo todo) {
        this.todo = todo;
    }

    /**
     * 
     */
    @JsonProperty("toleration")
    public Toleration getToleration() {
        return toleration;
    }

    /**
     * 
     */
    @JsonProperty("toleration")
    public void setToleration(Toleration toleration) {
        this.toleration = toleration;
    }

    /**
     * 
     */
    @JsonProperty("upgrade")
    public Upgrade getUpgrade() {
        return upgrade;
    }

    /**
     * 
     */
    @JsonProperty("upgrade")
    public void setUpgrade(Upgrade upgrade) {
        this.upgrade = upgrade;
    }

    /**
     * 
     */
    @JsonProperty("volumeLabels")
    public VolumeLabels getVolumeLabels() {
        return volumeLabels;
    }

    /**
     * 
     */
    @JsonProperty("volumeLabels")
    public void setVolumeLabels(VolumeLabels volumeLabels) {
        this.volumeLabels = volumeLabels;
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
