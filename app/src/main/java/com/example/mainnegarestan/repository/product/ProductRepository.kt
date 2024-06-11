package com.example.mainnegarestan.repository.product

import com.example.mainnegarestan.api.product.ProductApi
import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.product.Product
import okhttp3.MultipartBody
import okhttp3.RequestBody
import javax.inject.Inject

class ProductRepository @Inject constructor(var api: ProductApi) {

    suspend fun getProducts(): ServiceResponse<Product> {
        try {
            return api.getProduct()
        } catch (e: Exception) {
            return ServiceResponse(status = "EXCEPTION", message = e.message!!)
        }
    }
    suspend fun getProductById(id: Long) : ServiceResponse<Product> {
            return api.getProductById(id)
    }

    suspend fun uploadCarpet(
        title: RequestBody?,
        category: RequestBody?,
        code: RequestBody?,
        weight: RequestBody?,
        dimension: RequestBody?,
        size: RequestBody?,
        color: RequestBody?,
        shape: RequestBody?,
        quantity: RequestBody?,
        visitCount: RequestBody,
        addDate: RequestBody?,
        property: RequestBody?,
        description: RequestBody?,
        price: RequestBody?,
        quality: RequestBody?,
        density: RequestBody?,
        densityInHeight: RequestBody?,
        densityInWidth: RequestBody?,
        khabType: RequestBody?,
        poodType: RequestBody?,
        tarType: RequestBody?,
        tissueLocation: RequestBody?,
        tissueType: RequestBody?,
        numcolor: RequestBody?,
        image: MultipartBody.Part
    ): ServiceResponse<Product> {
        return api.uploadCarpet(
            title!!, category!! ,code!!, weight!!, dimension!!, size!!, color!!, shape!!, quantity!!, visitCount,
            addDate!!, property!!, description!!, price!!, quality!!, density!!, densityInHeight!!, densityInWidth!!,
            khabType!!, poodType!!, tarType!!, tissueLocation!!, tissueType!!,
            numcolor!!,image
        )
    }
    suspend fun UploadCarpetPanel(
        title: RequestBody?,
        category: RequestBody?,
        code: RequestBody?,
        weight: RequestBody?,
        dimension: RequestBody?,
        size: RequestBody?,
        color: RequestBody?,
        shape: RequestBody?,
        quantity: RequestBody?,
        visitCount: RequestBody,
        addDate: RequestBody?,
        property: RequestBody?,
        description: RequestBody?,
        price: RequestBody?,
        quality: RequestBody?,
        density: RequestBody?,
        densityInHeight: RequestBody?,
        densityInWidth: RequestBody?,
        khabType: RequestBody?,
        poodType: RequestBody?,
        tarType: RequestBody?,
        tissueLocation: RequestBody?,
        tissuDensityIn7cm: RequestBody?,
        tissueType: RequestBody?,
        dimentionFrame: RequestBody?,
        frameType: RequestBody?,
        porzType: RequestBody?,
        image: MultipartBody.Part
        ):ServiceResponse<Product>{
        return api.uploadCarpetPanel(
            title!!,category!!,code!!,weight!!,dimension!!,size!!,color!!,shape!!,
            quantity!!,visitCount,addDate!!,property!!,description!!,price!!,
            quality!!,density!!,densityInHeight!!,densityInWidth!!,khabType!!,
            poodType!!,tarType!!,tissueLocation!!,tissuDensityIn7cm!!,
            tissueType!!,dimentionFrame!!,frameType!!,porzType!!,image)
    }

    suspend fun uploadCollage(
        title: RequestBody?,
        category: RequestBody?,
        code: RequestBody?,
        weight: RequestBody?,
        dimension: RequestBody?,
        size: RequestBody?,
        color: RequestBody?,
        shape: RequestBody?,
        quantity: RequestBody?,
        visitCount: RequestBody,
        addDate: RequestBody?,
        property: RequestBody?,
        description: RequestBody?,
        price: RequestBody?,
        quality: RequestBody?,
        density: RequestBody?,
        khabType: RequestBody?,
        poodType: RequestBody?,
        tarType: RequestBody?,
        tissueLocation: RequestBody?,
        tissueType: RequestBody?,
        numcolor: RequestBody?,
        image: MultipartBody.Part
    ):ServiceResponse<Product>{
        return api.uploadCollage(
            title!!,category!!,code!!,weight!!,dimension!!,size!!,color!!,shape!!,quantity!!,
            visitCount,addDate!!,property!!,description!!,price!!,quality!!,density!!,khabType!!,poodType!!,
            tarType!!,tissueLocation!!,tissueType!!,numcolor!!,image
        )
    }

    suspend fun uploadMoq(
        title: RequestBody?,
        category: RequestBody?,
        code: RequestBody?,
        weight: RequestBody?,
        dimension: RequestBody?,
        color: RequestBody?,
        shape: RequestBody?,
        quantity: RequestBody?,
        visitCount: RequestBody,
        addDate: RequestBody?,
        property: RequestBody?,
        description: RequestBody?,
        price: RequestBody?,
        quality: RequestBody?,
        threadType:RequestBody?,
        layernum:RequestBody?,
        thickness:RequestBody?,
        rangType:RequestBody?,
        tissueType:RequestBody?,
        image: MultipartBody.Part
    ):ServiceResponse<Product>{
        return api.uploadMoq(
            title!!,category!!,code!!,weight!!,dimension!!,color!!,shape!!,quantity!!,visitCount
        ,addDate!!,property!!,description!!,price!!,quality!!,threadType!!,
            layernum!!,thickness!!,rangType!!,tissueType!!,image
        )
    }

    suspend fun uploadRug(
        title: RequestBody?,
        category: RequestBody?,
        code: RequestBody?,
        weight: RequestBody?,
        dimension: RequestBody?,
        size: RequestBody?,
        color: RequestBody?,
        shape: RequestBody?,
        quantity: RequestBody?,
        visitCount: RequestBody,
        addDate: RequestBody?,
        property: RequestBody?,
        description: RequestBody?,
        price: RequestBody?,
        quality: RequestBody?,
        poodType: RequestBody?,
        tarType: RequestBody?,
        tissueLocation: RequestBody?,
        tissueType: RequestBody?,
        image: MultipartBody.Part
    ):ServiceResponse<Product>{
        return api.uploadRug(
            title!!,category!!,code!!,weight!!,dimension!!,size!!,color!!,shape!!,quantity!!,visitCount,addDate!!,
            property!!,description!!,price!!,quality!!,poodType!!,tarType!!,tissueLocation!!,
            tissueType!!,image
        )
    }
}