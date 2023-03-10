package com.example.task.repository

import com.example.task.data.api.methods.UserApi
import com.example.task.data.api.request.LoginRequest
import com.example.task.data.api.response.LoginResponse
import retrofit2.Response

class UserRepository {

    suspend fun loginUser(loginRequest: LoginRequest): Response<LoginResponse>? {
        return  UserApi.getApi()?.loginUser(loginRequest = loginRequest)
    }
}