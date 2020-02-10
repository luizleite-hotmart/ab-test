package com.luizleiteoliveira.abtest.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FeatureController {

    @GetMapping("/features")
    fun getFeatures() = "teste"
}