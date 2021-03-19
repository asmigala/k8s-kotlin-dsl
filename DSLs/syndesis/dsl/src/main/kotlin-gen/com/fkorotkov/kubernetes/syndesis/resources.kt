// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Database as syndesis_Database
import com.fkorotkov.kubernetes.syndesis.Grafana as syndesis_Grafana
import com.fkorotkov.kubernetes.syndesis.Meta as syndesis_Meta
import com.fkorotkov.kubernetes.syndesis.Prometheus as syndesis_Prometheus
import com.fkorotkov.kubernetes.syndesis.Resources as syndesis_Resources
import com.fkorotkov.kubernetes.syndesis.Server as syndesis_Server
import com.fkorotkov.kubernetes.syndesis.Upgrade as syndesis_Upgrade


fun  syndesis_Database.`resources`(block: syndesis_Resources.() -> Unit = {}) {
  if(this.`resources` == null) {
    this.`resources` = syndesis_Resources()
  }

  this.`resources`.block()
}


fun  syndesis_Grafana.`resources`(block: syndesis_Resources.() -> Unit = {}) {
  if(this.`resources` == null) {
    this.`resources` = syndesis_Resources()
  }

  this.`resources`.block()
}


fun  syndesis_Meta.`resources`(block: syndesis_Resources.() -> Unit = {}) {
  if(this.`resources` == null) {
    this.`resources` = syndesis_Resources()
  }

  this.`resources`.block()
}


fun  syndesis_Prometheus.`resources`(block: syndesis_Resources.() -> Unit = {}) {
  if(this.`resources` == null) {
    this.`resources` = syndesis_Resources()
  }

  this.`resources`.block()
}


fun  syndesis_Server.`resources`(block: syndesis_Resources.() -> Unit = {}) {
  if(this.`resources` == null) {
    this.`resources` = syndesis_Resources()
  }

  this.`resources`.block()
}


fun  syndesis_Upgrade.`resources`(block: syndesis_Resources.() -> Unit = {}) {
  if(this.`resources` == null) {
    this.`resources` = syndesis_Resources()
  }

  this.`resources`.block()
}

