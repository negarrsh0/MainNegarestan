package com.example.mainnegarestan.api.product

import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.product.Product
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.PartMap
import retrofit2.http.Query

interface ProductApi {

    @GET("product.php")
    suspend fun getProduct(): ServiceResponse<Product>

    @GET("getCarById.php/{id}")
    suspend fun getProductById(@Query("id") id: Long): ServiceResponse<Product>



    @Multipart
    @POST("insertadcarpet.php")
    suspend fun uploadCarpet(
        @Part("title") title: RequestBody,
        @Part("category") category: RequestBody,
        @Part("code") code: RequestBody,
        @Part("weight") weight: RequestBody,
        @Part("dimension") dimension: RequestBody,
        @Part("size") size: RequestBody,
        @Part("color") color: RequestBody,
        @Part("shape") shape: RequestBody,
        @Part("quantity") quantity: RequestBody,
        @Part("visitCount") visitCount: RequestBody,
        @Part("addDate") addDate: RequestBody,
        @Part("property") property: RequestBody,
        @Part("description") description: RequestBody,
        @Part("price") price: RequestBody,
        @Part("quality") quality: RequestBody,
        @Part("density") density: RequestBody,
        @Part("densityInHeight") densityInHeight: RequestBody,
        @Part("densityInWidth") densityInWidth: RequestBody,
        @Part("khabType") khabType: RequestBody,
        @Part("poodType") poodType: RequestBody,
        @Part("tarType") tarType: RequestBody,
        @Part("tissueLocation") tissueLocation: RequestBody,
        @Part("tissueType") tissueType: RequestBody,
        @Part("numColor") numColor: RequestBody,
        @Part image: MultipartBody.Part,
    ): ServiceResponse<Product>


    @Multipart
    @POST("insertadcp.php")
    suspend fun uploadCarpetPanel(
        @Part("title") title: RequestBody,
        @Part("category") category: RequestBody,
        @Part("code") code: RequestBody,
        @Part("weight") weight: RequestBody,
        @Part("dimension") dimension: RequestBody,
        @Part("size") size: RequestBody,
        @Part("color") color: RequestBody,
        @Part("shape") shape: RequestBody,
        @Part("quantity") quantity: RequestBody,
        @Part("visitCount") visitCount: RequestBody,
        @Part("addDate") addDate: RequestBody,
        @Part("property") property: RequestBody,
        @Part("description") description: RequestBody,
        @Part("price") price: RequestBody,
        @Part("quality") quality: RequestBody,
        @Part("density") density: RequestBody,
        @Part("densityInHeight") densityInHeight: RequestBody,
        @Part("densityInWidth") densityInWidth: RequestBody,
        @Part("khabType") khabType: RequestBody,
        @Part("poodType") poodType: RequestBody,
        @Part("tarType") tarType: RequestBody,
        @Part("tissueLocation") tissueLocation: RequestBody,
        @Part("tissuDensityIn7cm") tissuDensityIn7cm: RequestBody,
        @Part("tissueType") tissueType: RequestBody,
        @Part("dimentionFrame") dimentionFrame: RequestBody,
        @Part("frameType") frameType: RequestBody,
        @Part("porzType") porzType: RequestBody,
        @Part image: MultipartBody.Part
    ): ServiceResponse<Product>

    @Multipart
    @POST("insertadcollage.php")
    suspend fun uploadCollage(
        @Part("title") title: RequestBody,
        @Part("category") category: RequestBody,
        @Part("code") code: RequestBody,
        @Part("weight") weight: RequestBody,
        @Part("dimension") dimension: RequestBody,
        @Part("size") size: RequestBody,
        @Part("color") color: RequestBody,
        @Part("shape") shape: RequestBody,
        @Part("quantity") quantity: RequestBody,
        @Part("visitCount") visitCount: RequestBody,
        @Part("addDate") addDate: RequestBody,
        @Part("property") property: RequestBody,
        @Part("description") description: RequestBody,
        @Part("price") price: RequestBody,
        @Part("quality") quality: RequestBody,
        @Part("density") density: RequestBody,
        @Part("khabType") khabType: RequestBody,
        @Part("poodType") poodType: RequestBody,
        @Part("tarType") tarType: RequestBody,
        @Part("tissueLocation") tissueLocation: RequestBody,
        @Part("tissueType") tissueType: RequestBody,
        @Part("numColor") numColor: RequestBody,
        @Part image: MultipartBody.Part):ServiceResponse<Product>


    @Multipart
    @POST("insertadmoq.php")
    suspend fun uploadMoq(
        @Part("title") title: RequestBody,
        @Part("category") category: RequestBody,
        @Part("code") code: RequestBody,
        @Part("weight") weight: RequestBody,
        @Part("dimension") dimension: RequestBody,
        @Part("color") color: RequestBody,
        @Part("shape") shape: RequestBody,
        @Part("quantity") quantity: RequestBody,
        @Part("visitCount") visitCount: RequestBody,
        @Part("addDate") addDate: RequestBody,
        @Part("property") property: RequestBody,
        @Part("description") description: RequestBody,
        @Part("price") price: RequestBody,
        @Part("quality") quality: RequestBody,
        @Part("threadType") threadType: RequestBody,
        @Part("layernum") layernum: RequestBody,
        @Part("thickness") thickness: RequestBody,
        @Part("rangType") rangType: RequestBody,
        @Part("tissueType") tissueType: RequestBody,
        @Part image: MultipartBody.Part
    ):ServiceResponse<Product>

    @Multipart
    @POST("inseradrug.php")
    suspend fun uploadRug(
        @Part("title") title: RequestBody,
        @Part("category") category: RequestBody,
        @Part("code") code: RequestBody,
        @Part("weight") weight: RequestBody,
        @Part("dimension") dimension: RequestBody,
        @Part("size") size: RequestBody,
        @Part("color") color: RequestBody,
        @Part("shape") shape: RequestBody,
        @Part("quantity") quantity: RequestBody,
        @Part("visitCount") visitCount: RequestBody,
        @Part("addDate") addDate: RequestBody,
        @Part("property") property: RequestBody,
        @Part("description") description: RequestBody,
        @Part("price") price: RequestBody,
        @Part("quality") quality: RequestBody,
        @Part("poodType") poodType: RequestBody,
        @Part("tarType") tarType: RequestBody,
        @Part("tissueLocation") tissueLocation: RequestBody,
        @Part("tissueType") tissueType: RequestBody,
        @Part image: MultipartBody.Part
    ):ServiceResponse<Product>


}