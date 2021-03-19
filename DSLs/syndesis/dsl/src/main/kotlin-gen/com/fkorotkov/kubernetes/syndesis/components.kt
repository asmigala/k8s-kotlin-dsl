// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Components as syndesis_Components
import com.fkorotkov.kubernetes.syndesis.Spec as syndesis_Spec


fun  syndesis_Spec.`components`(block: syndesis_Components.() -> Unit = {}) {
  if(this.`components` == null) {
    this.`components` = syndesis_Components()
  }

  this.`components`.block()
}

