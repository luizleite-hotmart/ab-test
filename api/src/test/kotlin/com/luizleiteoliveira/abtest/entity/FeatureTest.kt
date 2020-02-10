package com.luizleiteoliveira.abtest.entity

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FeatureTest {

    @Test
    fun `create feature entity`() {
        val feature = Feature(name = "name", description = "description", percentage = 10)
        Assertions.assertEquals("name", feature.name)
        Assertions.assertEquals("description", feature.description)
        Assertions.assertEquals(10, feature.percentage)
        Assertions.assertEquals(0, feature.id)
    }

    @Test
    fun `user not able to use feature`() {
        val feature = Feature(name = "name", description = "description", percentage = 10)
        feature.id = 10
        val user = User("ucode")
        Assertions.assertEquals(10,  feature.id) // 777 * 10 * 111111138 = 45115764 % 100 = 64
        val userAbleUseFeature = feature.userAbleUseFeature(user.ucode)
        Assertions.assertFalse(userAbleUseFeature)
    }

    @Test
    fun `user able to use feature increase the percentage`() {
        val feature = Feature(name = "name", description = "description", percentage = 65)
        feature.id = 10
        val user = User("ucode")
        Assertions.assertEquals(10,  feature.id) // 777 * 10 * 111111138 = 45115764 % 100 = 64
        val userAbleUseFeature = feature.userAbleUseFeature(user.ucode)
        Assertions.assertTrue(userAbleUseFeature)
    }

    @Test
    fun `user able to use feature`() {
        val feature = Feature(name = "name", description = "description", percentage = 21)
        feature.id = 10
        val user = User("L")
        Assertions.assertEquals(10,  feature.id) // 76 * 10 * 111111138 = 590520 % 100 = 20
        val userAbleUseFeature = feature.userAbleUseFeature(user.ucode)
        Assertions.assertTrue(userAbleUseFeature)
    }
}
