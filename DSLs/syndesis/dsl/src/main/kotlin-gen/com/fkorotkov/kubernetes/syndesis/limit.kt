// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Limit as syndesis_Limit
import com.fkorotkov.kubernetes.syndesis.Resources as syndesis_Resources


fun  syndesis_Resources.`limit`(block: syndesis_Limit.() -> Unit = {}) {
  if(this.`limit` == null) {
    this.`limit` = syndesis_Limit()
  }

  this.`limit`.block()
}

