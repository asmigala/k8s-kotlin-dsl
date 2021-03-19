// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Preference as syndesis_Preference
import com.fkorotkov.kubernetes.syndesis.PreferredDuringSchedulingIgnoredDuringExecution as syndesis_PreferredDuringSchedulingIgnoredDuringExecution


fun  syndesis_PreferredDuringSchedulingIgnoredDuringExecution.`preference`(block: syndesis_Preference.() -> Unit = {}) {
  if(this.`preference` == null) {
    this.`preference` = syndesis_Preference()
  }

  this.`preference`.block()
}

