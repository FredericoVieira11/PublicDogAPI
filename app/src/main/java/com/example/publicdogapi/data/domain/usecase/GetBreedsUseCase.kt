package com.example.publicdogapi.data.domain.usecase

import com.example.publicdogapi.data.domain.model.Breed
import com.example.publicdogapi.data.domain.repository.BreedsRepository
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class GetBreedsUseCase @Inject constructor(
    private val repository: BreedsRepository
) {

    fun execute(): Single<List<Breed>> {
        return repository.getBreeds()
    }
}