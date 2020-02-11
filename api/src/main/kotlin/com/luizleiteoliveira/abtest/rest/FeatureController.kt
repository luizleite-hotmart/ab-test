package com.luizleiteoliveira.abtest.rest

import com.luizleiteoliveira.abtest.FeatureRepository
import com.luizleiteoliveira.abtest.entity.Feature
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.support.Repositories
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/features")
class FeatureController(private val featureRepository: FeatureRepository) {

    @GetMapping
    fun getFeatures(): List<Feature> {
        return featureRepository.findAll().toList()
    }
}