// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Features as syndesis_Features
import com.fkorotkov.kubernetes.syndesis.Server as syndesis_Server


fun  syndesis_Server.`features`(block: syndesis_Features.() -> Unit = {}) {
  if(this.`features` == null) {
    this.`features` = syndesis_Features()
  }

  this.`features`.block()
}

