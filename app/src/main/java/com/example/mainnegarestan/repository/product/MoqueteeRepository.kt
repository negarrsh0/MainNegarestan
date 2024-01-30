package com.example.mainnegarestan.repository.product

import com.example.mainnegarestan.api.product.MoquetteApi
import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.product.Carpet
import com.example.mainnegarestan.model.product.Moquette
import retrofit2.http.GET
import javax.inject.Inject

class MoqueteeRepository @Inject constructor(var api: MoquetteApi) {

    suspend fun getMoquette(): ServiceResponse<Moquette>{
        try {
            return api.getMoquetee()
        }catch (e: Exception){
            return ServiceResponse(status = "EXCEPTION", message = e.message!!)
        }
    }

}