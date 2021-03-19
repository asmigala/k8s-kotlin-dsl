// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.Resources as syndesis_Resources
import com.fkorotkov.kubernetes.syndesis.VolumeLabels as syndesis_VolumeLabels


fun  syndesis_Resources.`volumeLabels`(block: syndesis_VolumeLabels.() -> Unit = {}) {
  if(this.`volumeLabels` == null) {
    this.`volumeLabels` = syndesis_VolumeLabels()
  }

  this.`volumeLabels`.block()
}

