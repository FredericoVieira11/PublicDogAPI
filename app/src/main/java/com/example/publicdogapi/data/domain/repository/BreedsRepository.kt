package com.example.publicdogapi.data.domain.repository

import com.example.publicdogapi.data.domain.model.Breed
import io.reactivex.rxjava3.core.Single

interface BreedsRepository {
    fun getBreeds(): Single<List<Breed>>
}