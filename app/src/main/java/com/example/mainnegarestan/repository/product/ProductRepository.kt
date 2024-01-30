package com.example.mainnegarestan.repository.product

import com.example.mainnegarestan.api.product.ProdectApi
import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.product.CarpetPanel
import com.example.mainnegarestan.model.product.Product
import javax.inject.Inject

class ProductRepository @Inject constructor(var api: ProdectApi) {

    suspend fun getCarpetPanel(): ServiceResponse<Product> {
        try {
            return api.getProduct()
        }catch (e: Exception){
            return ServiceResponse(status = "EXCEPTION", message = e.message!!)
        }
    }
}