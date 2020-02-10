package com.luizleiteoliveira.abtest.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Feature(var name: String = "",
                   var description: String = "",
                   var percentage: Int = 0) {
    fun userAbleUseFeature(ucode: String): Boolean {
        var ucodeNumber = ucode.hashCode()
        var result = (777 * ucodeNumber * this.id) % 100
        return result < this.percentage
    }

    @Id
    @GeneratedValue
    var id: Long = 0
}
