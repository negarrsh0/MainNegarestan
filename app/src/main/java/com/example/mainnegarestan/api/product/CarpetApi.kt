package com.example.mainnegarestan.api.product

import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.product.Carpet
import com.example.mainnegarestan.model.product.Product
import retrofit2.http.GET

interface CarpetApi {

    @GET("carpet.php")
    suspend fun getCarpet(): ServiceResponse<Product>

}