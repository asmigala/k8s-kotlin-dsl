// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Affinity as syndesis_Affinity
import com.fkorotkov.kubernetes.syndesis.PodAntiAffinity as syndesis_PodAntiAffinity


fun  syndesis_Affinity.`podAntiAffinity`(block: syndesis_PodAntiAffinity.() -> Unit = {}) {
  if(this.`podAntiAffinity` == null) {
    this.`podAntiAffinity` = syndesis_PodAntiAffinity()
  }

  this.`podAntiAffinity`.block()
}

