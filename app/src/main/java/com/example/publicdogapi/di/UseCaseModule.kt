package com.example.publicdogapi.di

import com.example.publicdogapi.data.domain.repository.BreedsRepository
import com.example.publicdogapi.data.domain.usecase.GetBreedsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Singleton
    @Provides
    fun provideGetBreedsUseCase(
        repository: BreedsRepository
    ): GetBreedsUseCase {
        return GetBreedsUseCase(repository)
    }
}