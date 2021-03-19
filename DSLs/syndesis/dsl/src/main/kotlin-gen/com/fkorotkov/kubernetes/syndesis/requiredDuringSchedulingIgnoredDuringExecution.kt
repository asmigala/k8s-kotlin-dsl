// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.NodeAffinity as syndesis_NodeAffinity
import com.fkorotkov.kubernetes.syndesis.RequiredDuringSchedulingIgnoredDuringExecution as syndesis_RequiredDuringSchedulingIgnoredDuringExecution


fun  syndesis_NodeAffinity.`requiredDuringSchedulingIgnoredDuringExecution`(block: syndesis_RequiredDuringSchedulingIgnoredDuringExecution.() -> Unit = {}) {
  if(this.`requiredDuringSchedulingIgnoredDuringExecution` == null) {
    this.`requiredDuringSchedulingIgnoredDuringExecution` = syndesis_RequiredDuringSchedulingIgnoredDuringExecution()
  }

  this.`requiredDuringSchedulingIgnoredDuringExecution`.block()
}

