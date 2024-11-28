package com.example.publicdogapi.data.api

import com.example.publicdogapi.data.model.BreedDto
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface DogApiService {

    @GET("v2/breeds")
    fun getBreeds(): Single<List<BreedDto>>
}