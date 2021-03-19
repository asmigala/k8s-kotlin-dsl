// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Maven as syndesis_Maven
import com.fkorotkov.kubernetes.syndesis.Repositories as syndesis_Repositories


fun  syndesis_Maven.`repositories`(block: syndesis_Repositories.() -> Unit = {}) {
  if(this.`repositories` == null) {
    this.`repositories` = syndesis_Repositories()
  }

  this.`repositories`.block()
}

