
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
import io.fabric8.kubernetes.api.model.KubernetesResource;


/**
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "database",
    "grafana",
    "meta",
    "oauth",
    "prometheus",
    "server",
    "upgrade"
})
public class Components implements KubernetesResource
{

    /**
     * 
     */
    @JsonProperty("database")
    @JsonPropertyDescription("")
    private Database database;
    /**
     * 
     */
    @JsonProperty("grafana")
    @JsonPropertyDescription("")
    private Grafana grafana;
    /**
     * 
     */
    @JsonProperty("meta")
    @JsonPropertyDescription("")
    private Meta meta;
    /**
     * 
     */
    @JsonProperty("oauth")
    @JsonPropertyDescription("")
    private Oauth oauth;
    /**
     * 
     */
    @JsonProperty("prometheus")
    @JsonPropertyDescription("")
    private Prometheus prometheus;
    /**
     * 
     */
    @JsonProperty("server")
    @JsonPropertyDescription("")
    private Server server;
    /**
     * 
     */
    @JsonProperty("upgrade")
    @JsonPropertyDescription("")
    private Upgrade upgrade;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Components() {
    }

    /**
     * 
     * @param server
     * @param database
     * @param upgrade
     * @param grafana
     * @param meta
     * @param prometheus
     * @param oauth
     */
    public Components(Database database, Grafana grafana, Meta meta, Oauth oauth, Prometheus prometheus, Server server, Upgrade upgrade) {
        super();
        this.database = database;
        this.grafana = grafana;
        this.meta = meta;
        this.oauth = oauth;
        this.prometheus = prometheus;
        this.server = server;
        this.upgrade = upgrade;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
