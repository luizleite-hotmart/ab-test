package com.luizleiteoliveira.abtest.entity

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FeatureTest {

    @Test
    fun `create feature entity`() {
        val feature = Feature(name = "name", description = "description", percentage = 0.10)
        Assertions.assertEquals("name", feature.name)
        Assertions.assertEquals("description", feature.description)
        Assertions.assertEquals(0.10, feature.percentage)
        Assertions.assertEquals(0, feature.id)
    }

    @Test
    fun `user abble to use feature`() {
        val feature = Feature(name = "name", description = "description", percentage = 0.10)
        feature.id = 10
        val user = User("ucode")
    }
}
