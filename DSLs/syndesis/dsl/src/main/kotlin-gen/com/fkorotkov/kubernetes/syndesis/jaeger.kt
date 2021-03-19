// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Addons as syndesis_Addons
import com.fkorotkov.kubernetes.syndesis.Jaeger as syndesis_Jaeger


fun  syndesis_Addons.`jaeger`(block: syndesis_Jaeger.() -> Unit = {}) {
  if(this.`jaeger` == null) {
    this.`jaeger` = syndesis_Jaeger()
  }

  this.`jaeger`.block()
}

