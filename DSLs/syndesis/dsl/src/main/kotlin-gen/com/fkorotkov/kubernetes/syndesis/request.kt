// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Request as syndesis_Request
import com.fkorotkov.kubernetes.syndesis.Resources as syndesis_Resources


fun  syndesis_Resources.`request`(block: syndesis_Request.() -> Unit = {}) {
  if(this.`request` == null) {
    this.`request` = syndesis_Request()
  }

  this.`request`.block()
}

