package com.example.publicdogapi.data.domain.error

sealed class AppError : Throwable() {
    data object NetworkError : AppError()
    data object TimeoutError : AppError()
    data object NotFoundError : AppError()
    data object UnknownError : AppError()
}