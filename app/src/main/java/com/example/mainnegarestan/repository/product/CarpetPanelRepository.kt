package com.example.mainnegarestan.repository.product

import com.example.mainnegarestan.api.product.CarpetPanelApi
import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.product.CarpetPanel
import javax.inject.Inject

class CarpetPanelRepository @Inject constructor(var api: CarpetPanelApi) {

    suspend fun getCarpetPanel(): ServiceResponse<CarpetPanel>{
        try {
            return api.getCarpetPanel()
        }catch (e: Exception){
            return ServiceResponse(status = "EXCEPTION", message = e.message!!)
        }
    }
}