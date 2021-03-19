// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Affinity as syndesis_Affinity
import com.fkorotkov.kubernetes.syndesis.PodAffinity as syndesis_PodAffinity


fun  syndesis_Affinity.`podAffinity`(block: syndesis_PodAffinity.() -> Unit = {}) {
  if(this.`podAffinity` == null) {
    this.`podAffinity` = syndesis_PodAffinity()
  }

  this.`podAffinity`.block()
}

