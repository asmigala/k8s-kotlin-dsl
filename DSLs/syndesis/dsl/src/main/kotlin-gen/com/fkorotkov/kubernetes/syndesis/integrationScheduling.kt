// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.IntegrationScheduling as syndesis_IntegrationScheduling
import com.fkorotkov.kubernetes.syndesis.Spec as syndesis_Spec


fun  syndesis_Spec.`integrationScheduling`(block: syndesis_IntegrationScheduling.() -> Unit = {}) {
  if(this.`integrationScheduling` == null) {
    this.`integrationScheduling` = syndesis_IntegrationScheduling()
  }

  this.`integrationScheduling`.block()
}

