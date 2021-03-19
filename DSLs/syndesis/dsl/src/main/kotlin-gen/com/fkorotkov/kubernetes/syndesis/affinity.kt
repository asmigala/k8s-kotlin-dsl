// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Affinity as syndesis_Affinity
import com.fkorotkov.kubernetes.syndesis.InfraScheduling as syndesis_InfraScheduling
import com.fkorotkov.kubernetes.syndesis.IntegrationScheduling as syndesis_IntegrationScheduling


fun  syndesis_InfraScheduling.`affinity`(block: syndesis_Affinity.() -> Unit = {}) {
  if(this.`affinity` == null) {
    this.`affinity` = syndesis_Affinity()
  }

  this.`affinity`.block()
}


fun  syndesis_IntegrationScheduling.`affinity`(block: syndesis_Affinity.() -> Unit = {}) {
  if(this.`affinity` == null) {
    this.`affinity` = syndesis_Affinity()
  }

  this.`affinity`.block()
}

