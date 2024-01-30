package com.example.mainnegarestan.api.product

import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.product.Collage
import com.example.mainnegarestan.model.product.Moquette
import retrofit2.http.GET

interface MoquetteApi {

    @GET("Moquetee.php")
    suspend fun getMoquetee(): ServiceResponse<Moquette>

}