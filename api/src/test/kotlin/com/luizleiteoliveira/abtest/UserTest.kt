package com.luizleiteoliveira.abtest

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class UserTest {

    @Test
    fun `create test for user`() {
        val user = User("ucode", "name")
        Assertions.assertEquals("ucode", user.ucode)
        Assertions.assertEquals("name", user.name)
    }
}