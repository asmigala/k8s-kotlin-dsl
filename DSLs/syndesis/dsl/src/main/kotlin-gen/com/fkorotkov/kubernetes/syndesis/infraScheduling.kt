// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.InfraScheduling as syndesis_InfraScheduling
import com.fkorotkov.kubernetes.syndesis.Spec as syndesis_Spec


fun  syndesis_Spec.`infraScheduling`(block: syndesis_InfraScheduling.() -> Unit = {}) {
  if(this.`infraScheduling` == null) {
    this.`infraScheduling` = syndesis_InfraScheduling()
  }

  this.`infraScheduling`.block()
}

