package com.luizleiteoliveira.abtest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AbtestApplication

fun main(args: Array<String>) {
	runApplication<AbtestApplication>(*args)
}
