package com.example.mainnegarestan.api.product

import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.product.Collage
import com.example.mainnegarestan.model.product.Product
import retrofit2.http.GET

interface CollageApi {
    @GET("collage.php")
    suspend fun getCollage(): ServiceResponse<Product>

}