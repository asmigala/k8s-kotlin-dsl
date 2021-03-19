// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Affinity as syndesis_Affinity
import com.fkorotkov.kubernetes.syndesis.NodeAffinity as syndesis_NodeAffinity


fun  syndesis_Affinity.`nodeAffinity`(block: syndesis_NodeAffinity.() -> Unit = {}) {
  if(this.`nodeAffinity` == null) {
    this.`nodeAffinity` = syndesis_NodeAffinity()
  }

  this.`nodeAffinity`.block()
}

