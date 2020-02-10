package com.luizleiteoliveira.abtest.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Feature(var name: String = "",
                   var description: String = "",
                   var percentage: Double = 0.0) {

    @Id
    @GeneratedValue
    var id: Long = 0
}
