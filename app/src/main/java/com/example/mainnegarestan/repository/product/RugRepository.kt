package com.example.mainnegarestan.repository.product

import com.example.mainnegarestan.api.product.RugApi
import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.product.Product
import com.example.mainnegarestan.model.product.Rug
import javax.inject.Inject

class RugRepository @Inject constructor(var api: RugApi) {

    suspend fun getRug(): ServiceResponse<Product>{
        try {
            return api.getRug()
        }catch (e: Exception){
            return ServiceResponse(status = "EXCEPTION", message = e.message!!)
        }
    }
}