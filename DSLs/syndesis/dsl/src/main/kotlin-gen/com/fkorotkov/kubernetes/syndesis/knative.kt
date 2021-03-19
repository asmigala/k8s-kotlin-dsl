// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Addons as syndesis_Addons
import com.fkorotkov.kubernetes.syndesis.Knative as syndesis_Knative


fun  syndesis_Addons.`knative`(block: syndesis_Knative.() -> Unit = {}) {
  if(this.`knative` == null) {
    this.`knative` = syndesis_Knative()
  }

  this.`knative`.block()
}

