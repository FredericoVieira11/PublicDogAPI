package com.example.publicdogapi.di

import com.example.publicdogapi.data.domain.repository.BreedsRepository
import com.example.publicdogapi.data.repository.BreedsRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindBreedsRepository(
        breedsRepositoryImpl: BreedsRepositoryImpl
    ): BreedsRepository
}