// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Components as syndesis_Components
import com.fkorotkov.kubernetes.syndesis.Prometheus as syndesis_Prometheus


fun  syndesis_Components.`prometheus`(block: syndesis_Prometheus.() -> Unit = {}) {
  if(this.`prometheus` == null) {
    this.`prometheus` = syndesis_Prometheus()
  }

  this.`prometheus`.block()
}

