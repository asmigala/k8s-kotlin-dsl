// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Spec as syndesis_Spec
import com.fkorotkov.kubernetes.syndesis.Syndesis as syndesis_Syndesis


fun  syndesis_Syndesis.`spec`(block: syndesis_Spec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = syndesis_Spec()
  }

  this.`spec`.block()
}

