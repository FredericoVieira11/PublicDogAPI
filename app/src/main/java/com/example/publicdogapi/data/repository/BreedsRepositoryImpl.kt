package com.example.publicdogapi.data.repository

import com.example.publicdogapi.data.api.DogApiService
import com.example.publicdogapi.data.domain.error.ErrorMapper
import com.example.publicdogapi.data.domain.model.Breed
import com.example.publicdogapi.data.domain.repository.BreedsRepository
import com.example.publicdogapi.data.model.BreedDto
import com.example.publicdogapi.data.model.toDomain
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class BreedsRepositoryImpl @Inject constructor(
    private val apiService: DogApiService
) : BreedsRepository {

    override fun getBreeds(): Single<List<Breed>> {
        return apiService.getBreeds()
            .map { breedDto -> breedDto.map(BreedDto::toDomain) }
            .onErrorResumeNext { throwable ->
                Single.error(ErrorMapper.map(throwable))
            }
    }
}