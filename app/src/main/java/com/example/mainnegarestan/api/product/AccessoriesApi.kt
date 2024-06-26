package com.example.mainnegarestan.api.product

import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.product.Accessories
import com.example.mainnegarestan.model.product.Product
import retrofit2.http.GET

interface AccessoriesApi {

    @GET("accessories.php")
    suspend fun getAccessories(): ServiceResponse<Product>



}