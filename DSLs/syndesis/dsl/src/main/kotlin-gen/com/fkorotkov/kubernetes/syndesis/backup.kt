// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Backup as syndesis_Backup
import com.fkorotkov.kubernetes.syndesis.Spec as syndesis_Spec
import com.fkorotkov.kubernetes.syndesis.Status as syndesis_Status


fun  syndesis_Spec.`backup`(block: syndesis_Backup.() -> Unit = {}) {
  if(this.`backup` == null) {
    this.`backup` = syndesis_Backup()
  }

  this.`backup`.block()
}


fun  syndesis_Status.`backup`(block: syndesis_Backup.() -> Unit = {}) {
  if(this.`backup` == null) {
    this.`backup` = syndesis_Backup()
  }

  this.`backup`.block()
}

