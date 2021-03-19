// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Components as syndesis_Components
import com.fkorotkov.kubernetes.syndesis.Server as syndesis_Server


fun  syndesis_Components.`server`(block: syndesis_Server.() -> Unit = {}) {
  if(this.`server` == null) {
    this.`server` = syndesis_Server()
  }

  this.`server`.block()
}

