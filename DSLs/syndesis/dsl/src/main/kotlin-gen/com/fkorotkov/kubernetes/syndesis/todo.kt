// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Addons as syndesis_Addons
import com.fkorotkov.kubernetes.syndesis.Todo as syndesis_Todo


fun  syndesis_Addons.`todo`(block: syndesis_Todo.() -> Unit = {}) {
  if(this.`todo` == null) {
    this.`todo` = syndesis_Todo()
  }

  this.`todo`.block()
}

