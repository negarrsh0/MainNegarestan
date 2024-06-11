package com.example.mainnegarestan.repository.user

import com.example.mainnegarestan.api.user.UserApi
import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.user.User
import java.lang.Exception
import java.lang.reflect.Executable
import javax.inject.Inject


class UserRepository @Inject constructor(var api:UserApi) {

    suspend fun login(
        user: User
    ):ServiceResponse<User>{
        return try {
           api.login(username = user.phone, password = user.password)
        }catch (e: Exception){
            ServiceResponse(status = "Exception", message = e.message)
        }
    }

    suspend fun register(user: User):ServiceResponse<User>{
        return try {
            api.register(username = user.phone, password = user.password, email = user.email)
        }catch (e:Exception){
            ServiceResponse(status = "Exeption", message = e.message)
        }

    }
}