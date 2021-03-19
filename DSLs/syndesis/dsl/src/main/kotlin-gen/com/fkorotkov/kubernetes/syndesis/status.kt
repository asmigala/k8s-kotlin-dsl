// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Status as syndesis_Status
import com.fkorotkov.kubernetes.syndesis.Syndesis as syndesis_Syndesis


fun  syndesis_Syndesis.`status`(block: syndesis_Status.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = syndesis_Status()
  }

  this.`status`.block()
}

