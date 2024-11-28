package com.example.publicdogapi.data.domain.error

import retrofit2.HttpException
import java.io.IOException
import java.net.SocketTimeoutException

object ErrorMapper {
    fun map(throwable: Throwable): AppError {
        return when (throwable) {
            is IOException -> AppError.NetworkError
            is SocketTimeoutException -> AppError.TimeoutError
            is HttpException -> {
                when (throwable.code()) {
                    404 -> AppError.NotFoundError
                    else -> AppError.UnknownError
                }
            }
            else -> AppError.UnknownError
        }
    }
}