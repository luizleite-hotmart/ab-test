package com.luizleiteoliveira.abtest.rest

import com.luizleiteoliveira.abtest.FeatureRepository
import com.luizleiteoliveira.abtest.entity.Feature
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/features")
class FeatureController(private val featureRepository: FeatureRepository) {

    @GetMapping
    fun getFeatures(): List<Feature> {
        return featureRepository.findAll().toList()
    }

    @PostMapping
    fun createFeature(@RequestBody feature: Feature): Long {
        featureRepository.save(feature)
        return feature.id
    }

    @PutMapping
    fun updateFeature(@RequestBody feature: Feature): Long {
        featureRepository.save(feature)
        return feature.id
    }

    @GetMapping("/{featureId}")
    fun checkUserAbleToUseFeature(@RequestParam("ucode") ucode: String, @PathVariable featureId: Long): Boolean {
        val feature = featureRepository.findById(featureId).get()
        return feature.userAbleUseFeature(ucode)
    }
}