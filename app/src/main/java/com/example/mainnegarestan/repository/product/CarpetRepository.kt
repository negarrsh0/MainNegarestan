package com.example.mainnegarestan.repository.product

import com.example.mainnegarestan.api.product.CarpetApi
import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.product.Carpet
import javax.inject.Inject

class CarpetRepository @Inject constructor(var api: CarpetApi){

    suspend fun getCarpet(): ServiceResponse<Carpet>{
        try {
            return api.getCarpet()
        }catch (e: Exception){
            return ServiceResponse(status = "EXCEPTION", message = e.message!!)
        }
    }

}