// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Addons as syndesis_Addons
import com.fkorotkov.kubernetes.syndesis.Ops as syndesis_Ops


fun  syndesis_Addons.`ops`(block: syndesis_Ops.() -> Unit = {}) {
  if(this.`ops` == null) {
    this.`ops` = syndesis_Ops()
  }

  this.`ops`.block()
}

