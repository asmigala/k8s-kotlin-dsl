// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Addons as syndesis_Addons
import com.fkorotkov.kubernetes.syndesis.PublicApi as syndesis_PublicApi


fun  syndesis_Addons.`publicApi`(block: syndesis_PublicApi.() -> Unit = {}) {
  if(this.`publicApi` == null) {
    this.`publicApi` = syndesis_PublicApi()
  }

  this.`publicApi`.block()
}

