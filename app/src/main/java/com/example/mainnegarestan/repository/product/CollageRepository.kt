package com.example.mainnegarestan.repository.product

import com.example.mainnegarestan.api.product.CollageApi
import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.product.Collage
import com.example.mainnegarestan.model.product.Product
import javax.inject.Inject

class CollageRepository @Inject constructor(var api: CollageApi) {

    suspend fun getCollage(): ServiceResponse<Product>{
        try {
            return api.getCollage()
        }catch (e: Exception){
            return ServiceResponse(status = "EXCEPTION", message = e.message!!)

        }
    }

}