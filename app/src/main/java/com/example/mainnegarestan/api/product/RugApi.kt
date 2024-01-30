package com.example.mainnegarestan.api.product

import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.product.Rug
import retrofit2.http.GET

interface RugApi {


    @GET("rug.php")
    suspend fun getRug(): ServiceResponse<Rug>
}