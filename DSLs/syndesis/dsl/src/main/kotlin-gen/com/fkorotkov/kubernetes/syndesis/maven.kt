// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Features as syndesis_Features
import com.fkorotkov.kubernetes.syndesis.Maven as syndesis_Maven


fun  syndesis_Features.`maven`(block: syndesis_Maven.() -> Unit = {}) {
  if(this.`maven` == null) {
    this.`maven` = syndesis_Maven()
  }

  this.`maven`.block()
}

