package com.example.publicdogapi.data.model

import com.example.publicdogapi.data.domain.model.Breed

data class BreedDto(
    val id: Int,
    val name: String,
    val temperament: String?,
    val origin: String?,
    val weight: Weight
)

data class Weight(
    val imperial: String,
    val metric: String
)

fun BreedDto.toDomain(): Breed {
    return Breed(
        id = this.id,
        name = this.name,
        temperament = this.temperament ?: "Unknown",
        origin = this.origin ?: "Unknown"
    )
}