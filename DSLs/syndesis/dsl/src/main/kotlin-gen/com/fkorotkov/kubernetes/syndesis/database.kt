// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Components as syndesis_Components
import com.fkorotkov.kubernetes.syndesis.Database as syndesis_Database


fun  syndesis_Components.`database`(block: syndesis_Database.() -> Unit = {}) {
  if(this.`database` == null) {
    this.`database` = syndesis_Database()
  }

  this.`database`.block()
}

