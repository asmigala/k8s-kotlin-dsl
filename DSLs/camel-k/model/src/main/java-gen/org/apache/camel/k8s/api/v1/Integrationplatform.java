
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
    "build",
    "condition",
    "configMapKeyRef",
    "configuration",
    "integrationPlatform",
    "integrationPlatformList",
    "maven",
    "properties",
    "registry",
    "resources",
    "secretKeyRef",
    "settings",
    "spec",
    "status",
    "traits"
})
public class Integrationplatform {

    /**
     * 
     */
    @JsonProperty("build")
    @JsonPropertyDescription("")
    private Build build;
    /**
     * 
     */
    @JsonProperty("condition")
    @JsonPropertyDescription("")
    private Condition condition;
    /**
     * 
     */
    @JsonProperty("configMapKeyRef")
    @JsonPropertyDescription("")
    private ConfigMapKeyRef configMapKeyRef;
    /**
     * 
     */
    @JsonProperty("configuration")
    @JsonPropertyDescription("")
    private Configuration configuration;
    /**
     * 
     */
    @JsonProperty("integrationPlatform")
    @JsonPropertyDescription("")
    private IntegrationPlatform integrationPlatform;
    /**
     * 
     */
    @JsonProperty("integrationPlatformList")
    @JsonPropertyDescription("")
    private IntegrationPlatformList integrationPlatformList;
    /**
     * 
     */
    @JsonProperty("maven")
    @JsonPropertyDescription("")
    private Maven maven;
    /**
     * 
     */
    @JsonProperty("properties")
    @JsonPropertyDescription("")
    private Properties properties;
    /**
     * 
     */
    @JsonProperty("registry")
    @JsonPropertyDescription("")
    private Registry registry;
    /**
     * 
     */
    @JsonProperty("resources")
    @JsonPropertyDescription("")
    private Resources resources;
    /**
     * 
     */
    @JsonProperty("secretKeyRef")
    @JsonPropertyDescription("")
    private SecretKeyRef secretKeyRef;
    /**
     * 
     */
    @JsonProperty("settings")
    @JsonPropertyDescription("")
    private Settings settings;
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
    @JsonProperty("traits")
    @JsonPropertyDescription("")
    private Traits traits;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Integrationplatform() {
    }

    /**
     * 
     * @param registry
     * @param settings
     * @param traits
     * @param configuration
     * @param maven
     * @param resources
     * @param integrationPlatform
     * @param spec
     * @param secretKeyRef
     * @param condition
     * @param build
     * @param integrationPlatformList
     * @param configMapKeyRef
     * @param properties
     * @param status
     */
    public Integrationplatform(Build build, Condition condition, ConfigMapKeyRef configMapKeyRef, Configuration configuration, IntegrationPlatform integrationPlatform, IntegrationPlatformList integrationPlatformList, Maven maven, Properties properties, Registry registry, Resources resources, SecretKeyRef secretKeyRef, Settings settings, Spec spec, Status status, Traits traits) {
        super();
        this.build = build;
        this.condition = condition;
        this.configMapKeyRef = configMapKeyRef;
        this.configuration = configuration;
        this.integrationPlatform = integrationPlatform;
        this.integrationPlatformList = integrationPlatformList;
        this.maven = maven;
        this.properties = properties;
        this.registry = registry;
        this.resources = resources;
        this.secretKeyRef = secretKeyRef;
        this.settings = settings;
        this.spec = spec;
        this.status = status;
        this.traits = traits;
    }

    /**
     * 
     */
    @JsonProperty("build")
    public Build getBuild() {
        return build;
    }

    /**
     * 
     */
    @JsonProperty("build")
    public void setBuild(Build build) {
        this.build = build;
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
    @JsonProperty("configuration")
    public Configuration getConfiguration() {
        return configuration;
    }

    /**
     * 
     */
    @JsonProperty("configuration")
    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    /**
     * 
     */
    @JsonProperty("integrationPlatform")
    public IntegrationPlatform getIntegrationPlatform() {
        return integrationPlatform;
    }

    /**
     * 
     */
    @JsonProperty("integrationPlatform")
    public void setIntegrationPlatform(IntegrationPlatform integrationPlatform) {
        this.integrationPlatform = integrationPlatform;
    }

    /**
     * 
     */
    @JsonProperty("integrationPlatformList")
    public IntegrationPlatformList getIntegrationPlatformList() {
        return integrationPlatformList;
    }

    /**
     * 
     */
    @JsonProperty("integrationPlatformList")
    public void setIntegrationPlatformList(IntegrationPlatformList integrationPlatformList) {
        this.integrationPlatformList = integrationPlatformList;
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
    @JsonProperty("registry")
    public Registry getRegistry() {
        return registry;
    }

    /**
     * 
     */
    @JsonProperty("registry")
    public void setRegistry(Registry registry) {
        this.registry = registry;
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
    @JsonProperty("traits")
    public Traits getTraits() {
        return traits;
    }

    /**
     * 
     */
    @JsonProperty("traits")
    public void setTraits(Traits traits) {
        this.traits = traits;
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
