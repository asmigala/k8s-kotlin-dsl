// GENERATE
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Addons as syndesis_Addons
import com.fkorotkov.kubernetes.syndesis.Affinity as syndesis_Affinity
import com.fkorotkov.kubernetes.syndesis.Backup as syndesis_Backup
import com.fkorotkov.kubernetes.syndesis.Components as syndesis_Components
import com.fkorotkov.kubernetes.syndesis.ConnectionPool as syndesis_ConnectionPool
import com.fkorotkov.kubernetes.syndesis.Database as syndesis_Database
import com.fkorotkov.kubernetes.syndesis.Features as syndesis_Features
import com.fkorotkov.kubernetes.syndesis.Grafana as syndesis_Grafana
import com.fkorotkov.kubernetes.syndesis.InfraScheduling as syndesis_InfraScheduling
import com.fkorotkov.kubernetes.syndesis.IntegrationScheduling as syndesis_IntegrationScheduling
import com.fkorotkov.kubernetes.syndesis.Jaeger as syndesis_Jaeger
import com.fkorotkov.kubernetes.syndesis.Knative as syndesis_Knative
import com.fkorotkov.kubernetes.syndesis.Limit as syndesis_Limit
import com.fkorotkov.kubernetes.syndesis.MatchExpression as syndesis_MatchExpression
import com.fkorotkov.kubernetes.syndesis.MatchField as syndesis_MatchField
import com.fkorotkov.kubernetes.syndesis.Maven as syndesis_Maven
import com.fkorotkov.kubernetes.syndesis.Meta as syndesis_Meta
import com.fkorotkov.kubernetes.syndesis.NodeAffinity as syndesis_NodeAffinity
import com.fkorotkov.kubernetes.syndesis.NodeSelectorTerm as syndesis_NodeSelectorTerm
import com.fkorotkov.kubernetes.syndesis.Oauth as syndesis_Oauth
import com.fkorotkov.kubernetes.syndesis.Ops as syndesis_Ops
import com.fkorotkov.kubernetes.syndesis.PodAffinity as syndesis_PodAffinity
import com.fkorotkov.kubernetes.syndesis.PodAntiAffinity as syndesis_PodAntiAffinity
import com.fkorotkov.kubernetes.syndesis.Preference as syndesis_Preference
import com.fkorotkov.kubernetes.syndesis.PreferredDuringSchedulingIgnoredDuringExecution as syndesis_PreferredDuringSchedulingIgnoredDuringExecution
import com.fkorotkov.kubernetes.syndesis.Prometheus as syndesis_Prometheus
import com.fkorotkov.kubernetes.syndesis.PublicApi as syndesis_PublicApi
import com.fkorotkov.kubernetes.syndesis.Repositories as syndesis_Repositories
import com.fkorotkov.kubernetes.syndesis.Request as syndesis_Request
import com.fkorotkov.kubernetes.syndesis.RequiredDuringSchedulingIgnoredDuringExecution as syndesis_RequiredDuringSchedulingIgnoredDuringExecution
import com.fkorotkov.kubernetes.syndesis.Resources as syndesis_Resources
import com.fkorotkov.kubernetes.syndesis.Server as syndesis_Server
import com.fkorotkov.kubernetes.syndesis.Spec as syndesis_Spec
import com.fkorotkov.kubernetes.syndesis.Status as syndesis_Status
import com.fkorotkov.kubernetes.syndesis.Syndesis as syndesis_Syndesis
import com.fkorotkov.kubernetes.syndesis.SyndesisList as syndesis_SyndesisList
import com.fkorotkov.kubernetes.syndesis.Todo as syndesis_Todo
import com.fkorotkov.kubernetes.syndesis.Toleration as syndesis_Toleration
import com.fkorotkov.kubernetes.syndesis.Upgrade as syndesis_Upgrade
import com.fkorotkov.kubernetes.syndesis.VolumeLabels as syndesis_VolumeLabels


fun newLimit(block : syndesis_Limit.() -> Unit = {}): syndesis_Limit {
  val instance = syndesis_Limit()
  instance.block()
  return instance
}


fun newComponents(block : syndesis_Components.() -> Unit = {}): syndesis_Components {
  val instance = syndesis_Components()
  instance.block()
  return instance
}


fun newResources(block : syndesis_Resources.() -> Unit = {}): syndesis_Resources {
  val instance = syndesis_Resources()
  instance.block()
  return instance
}


fun newPrometheus(block : syndesis_Prometheus.() -> Unit = {}): syndesis_Prometheus {
  val instance = syndesis_Prometheus()
  instance.block()
  return instance
}


fun newUpgrade(block : syndesis_Upgrade.() -> Unit = {}): syndesis_Upgrade {
  val instance = syndesis_Upgrade()
  instance.block()
  return instance
}


fun newServer(block : syndesis_Server.() -> Unit = {}): syndesis_Server {
  val instance = syndesis_Server()
  instance.block()
  return instance
}


fun newRequiredDuringSchedulingIgnoredDuringExecution(block : syndesis_RequiredDuringSchedulingIgnoredDuringExecution.() -> Unit = {}): syndesis_RequiredDuringSchedulingIgnoredDuringExecution {
  val instance = syndesis_RequiredDuringSchedulingIgnoredDuringExecution()
  instance.block()
  return instance
}


fun newConnectionPool(block : syndesis_ConnectionPool.() -> Unit = {}): syndesis_ConnectionPool {
  val instance = syndesis_ConnectionPool()
  instance.block()
  return instance
}


fun newToleration(block : syndesis_Toleration.() -> Unit = {}): syndesis_Toleration {
  val instance = syndesis_Toleration()
  instance.block()
  return instance
}


fun newVolumeLabels(block : syndesis_VolumeLabels.() -> Unit = {}): syndesis_VolumeLabels {
  val instance = syndesis_VolumeLabels()
  instance.block()
  return instance
}


fun newMatchExpression(block : syndesis_MatchExpression.() -> Unit = {}): syndesis_MatchExpression {
  val instance = syndesis_MatchExpression()
  instance.block()
  return instance
}


fun newIntegrationScheduling(block : syndesis_IntegrationScheduling.() -> Unit = {}): syndesis_IntegrationScheduling {
  val instance = syndesis_IntegrationScheduling()
  instance.block()
  return instance
}


fun newPodAntiAffinity(block : syndesis_PodAntiAffinity.() -> Unit = {}): syndesis_PodAntiAffinity {
  val instance = syndesis_PodAntiAffinity()
  instance.block()
  return instance
}


fun newMaven(block : syndesis_Maven.() -> Unit = {}): syndesis_Maven {
  val instance = syndesis_Maven()
  instance.block()
  return instance
}


fun newJaeger(block : syndesis_Jaeger.() -> Unit = {}): syndesis_Jaeger {
  val instance = syndesis_Jaeger()
  instance.block()
  return instance
}


fun newGrafana(block : syndesis_Grafana.() -> Unit = {}): syndesis_Grafana {
  val instance = syndesis_Grafana()
  instance.block()
  return instance
}


fun newDatabase(block : syndesis_Database.() -> Unit = {}): syndesis_Database {
  val instance = syndesis_Database()
  instance.block()
  return instance
}


fun newOauth(block : syndesis_Oauth.() -> Unit = {}): syndesis_Oauth {
  val instance = syndesis_Oauth()
  instance.block()
  return instance
}


fun newPublicApi(block : syndesis_PublicApi.() -> Unit = {}): syndesis_PublicApi {
  val instance = syndesis_PublicApi()
  instance.block()
  return instance
}


fun newTodo(block : syndesis_Todo.() -> Unit = {}): syndesis_Todo {
  val instance = syndesis_Todo()
  instance.block()
  return instance
}


fun newSyndesisList(block : syndesis_SyndesisList.() -> Unit = {}): syndesis_SyndesisList {
  val instance = syndesis_SyndesisList()
  instance.block()
  return instance
}


fun newRequest(block : syndesis_Request.() -> Unit = {}): syndesis_Request {
  val instance = syndesis_Request()
  instance.block()
  return instance
}


fun newAddons(block : syndesis_Addons.() -> Unit = {}): syndesis_Addons {
  val instance = syndesis_Addons()
  instance.block()
  return instance
}


fun newAffinity(block : syndesis_Affinity.() -> Unit = {}): syndesis_Affinity {
  val instance = syndesis_Affinity()
  instance.block()
  return instance
}


fun newRepositories(block : syndesis_Repositories.() -> Unit = {}): syndesis_Repositories {
  val instance = syndesis_Repositories()
  instance.block()
  return instance
}


fun newPreferredDuringSchedulingIgnoredDuringExecution(block : syndesis_PreferredDuringSchedulingIgnoredDuringExecution.() -> Unit = {}): syndesis_PreferredDuringSchedulingIgnoredDuringExecution {
  val instance = syndesis_PreferredDuringSchedulingIgnoredDuringExecution()
  instance.block()
  return instance
}


fun newNodeSelectorTerm(block : syndesis_NodeSelectorTerm.() -> Unit = {}): syndesis_NodeSelectorTerm {
  val instance = syndesis_NodeSelectorTerm()
  instance.block()
  return instance
}


fun newKnative(block : syndesis_Knative.() -> Unit = {}): syndesis_Knative {
  val instance = syndesis_Knative()
  instance.block()
  return instance
}


fun newSpec(block : syndesis_Spec.() -> Unit = {}): syndesis_Spec {
  val instance = syndesis_Spec()
  instance.block()
  return instance
}


fun newStatus(block : syndesis_Status.() -> Unit = {}): syndesis_Status {
  val instance = syndesis_Status()
  instance.block()
  return instance
}


fun newInfraScheduling(block : syndesis_InfraScheduling.() -> Unit = {}): syndesis_InfraScheduling {
  val instance = syndesis_InfraScheduling()
  instance.block()
  return instance
}


fun newPreference(block : syndesis_Preference.() -> Unit = {}): syndesis_Preference {
  val instance = syndesis_Preference()
  instance.block()
  return instance
}


fun newMatchField(block : syndesis_MatchField.() -> Unit = {}): syndesis_MatchField {
  val instance = syndesis_MatchField()
  instance.block()
  return instance
}


fun newMeta(block : syndesis_Meta.() -> Unit = {}): syndesis_Meta {
  val instance = syndesis_Meta()
  instance.block()
  return instance
}


fun newFeatures(block : syndesis_Features.() -> Unit = {}): syndesis_Features {
  val instance = syndesis_Features()
  instance.block()
  return instance
}


fun newOps(block : syndesis_Ops.() -> Unit = {}): syndesis_Ops {
  val instance = syndesis_Ops()
  instance.block()
  return instance
}


fun newPodAffinity(block : syndesis_PodAffinity.() -> Unit = {}): syndesis_PodAffinity {
  val instance = syndesis_PodAffinity()
  instance.block()
  return instance
}


fun newSyndesis(block : syndesis_Syndesis.() -> Unit = {}): syndesis_Syndesis {
  val instance = syndesis_Syndesis()
  instance.block()
  return instance
}


fun newNodeAffinity(block : syndesis_NodeAffinity.() -> Unit = {}): syndesis_NodeAffinity {
  val instance = syndesis_NodeAffinity()
  instance.block()
  return instance
}


fun newBackup(block : syndesis_Backup.() -> Unit = {}): syndesis_Backup {
  val instance = syndesis_Backup()
  instance.block()
  return instance
}

