package com.example.mainnegarestan.repository.product

import com.example.mainnegarestan.api.product.AccessoriesApi
import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.product.Accessories
import javax.inject.Inject

class AccessoriesRepository @Inject constructor(var api: AccessoriesApi) {

    suspend fun getAccessories(): ServiceResponse<Accessories> {
        try {
            return api.getAccessories()
        } catch (e: Exception) {
            return ServiceResponse(status = "EXCEPTION", message = e.message!!)
        }
    }
}