package com.example.mainnegarestan.api.product

import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.product.CarpetPanel
import com.example.mainnegarestan.model.product.Product
import retrofit2.http.GET

interface CarpetPanelApi {

    @GET("carpetpanel.php")
    suspend fun getCarpetPanel(): ServiceResponse<Product>

}