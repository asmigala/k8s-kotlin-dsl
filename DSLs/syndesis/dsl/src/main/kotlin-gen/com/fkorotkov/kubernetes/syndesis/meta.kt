// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Components as syndesis_Components
import com.fkorotkov.kubernetes.syndesis.Meta as syndesis_Meta


fun  syndesis_Components.`meta`(block: syndesis_Meta.() -> Unit = {}) {
  if(this.`meta` == null) {
    this.`meta` = syndesis_Meta()
  }

  this.`meta`.block()
}

