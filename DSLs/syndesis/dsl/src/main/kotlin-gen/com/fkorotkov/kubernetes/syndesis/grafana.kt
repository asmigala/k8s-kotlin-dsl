// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Components as syndesis_Components
import com.fkorotkov.kubernetes.syndesis.Grafana as syndesis_Grafana


fun  syndesis_Components.`grafana`(block: syndesis_Grafana.() -> Unit = {}) {
  if(this.`grafana` == null) {
    this.`grafana` = syndesis_Grafana()
  }

  this.`grafana`.block()
}

