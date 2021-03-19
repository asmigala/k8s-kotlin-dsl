// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Components as syndesis_Components
import com.fkorotkov.kubernetes.syndesis.Oauth as syndesis_Oauth


fun  syndesis_Components.`oauth`(block: syndesis_Oauth.() -> Unit = {}) {
  if(this.`oauth` == null) {
    this.`oauth` = syndesis_Oauth()
  }

  this.`oauth`.block()
}

