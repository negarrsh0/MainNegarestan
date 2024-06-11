package com.example.mainnegarestan.api.user

import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.product.Product
import com.example.mainnegarestan.model.user.User
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface UserApi {

    @POST("login.php")
    suspend fun login(
        @Query("phone") username: String,
        @Query("password") password: String):ServiceResponse<User>


    @FormUrlEncoded
    @POST("register.php")
    suspend fun register(@Field("phone") username: String ,@Field("password") password: String,@Field("email") email:String): ServiceResponse<User>


    @GET("getCarById.php/{id}")
    suspend fun getProductsByUserId(@Query("user_id") id: Long): ServiceResponse<Product>

}