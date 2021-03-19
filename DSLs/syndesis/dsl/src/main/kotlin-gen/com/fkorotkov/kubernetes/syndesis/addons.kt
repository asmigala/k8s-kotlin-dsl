// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Addons as syndesis_Addons
import com.fkorotkov.kubernetes.syndesis.Spec as syndesis_Spec


fun  syndesis_Spec.`addons`(block: syndesis_Addons.() -> Unit = {}) {
  if(this.`addons` == null) {
    this.`addons` = syndesis_Addons()
  }

  this.`addons`.block()
}

