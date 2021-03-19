// GENERATED
package com.fkorotkov.kubernetes.syndesis

import com.fkorotkov.kubernetes.syndesis.ConnectionPool as syndesis_ConnectionPool
import com.fkorotkov.kubernetes.syndesis.Server as syndesis_Server


fun  syndesis_Server.`connectionPool`(block: syndesis_ConnectionPool.() -> Unit = {}) {
  if(this.`connectionPool` == null) {
    this.`connectionPool` = syndesis_ConnectionPool()
  }

  this.`connectionPool`.block()
}

