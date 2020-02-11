package com.luizleiteoliveira.abtest

import com.luizleiteoliveira.abtest.entity.Feature
import org.springframework.data.repository.CrudRepository

interface FeatureRepository : CrudRepository<Feature, Long>