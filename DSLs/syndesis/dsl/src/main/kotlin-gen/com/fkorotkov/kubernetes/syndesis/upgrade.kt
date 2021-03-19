// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Components as syndesis_Components
import com.fkorotkov.kubernetes.syndesis.Upgrade as syndesis_Upgrade


fun  syndesis_Components.`upgrade`(block: syndesis_Upgrade.() -> Unit = {}) {
  if(this.`upgrade` == null) {
    this.`upgrade` = syndesis_Upgrade()
  }

  this.`upgrade`.block()
}

