package com.github.zemke.tippspiel2.service

import com.github.zemke.tippspiel2.persistence.model.Fixture
import com.github.zemke.tippspiel2.persistence.repository.FixtureRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class FixtureService(
        @Autowired private var fixtureRepository: FixtureRepository
) {

    fun saveMany(fixtures: List<Fixture>): MutableList<Fixture> {
        return fixtureRepository.save(fixtures)
    }
}