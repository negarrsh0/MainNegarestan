package com.example.mainnegarestan.viewmodel.product

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.product.Product
import com.example.mainnegarestan.repository.product.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import okhttp3.MultipartBody
import okhttp3.RequestBody
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor(var repository: ProductRepository) : ViewModel() {

    var dataList = mutableStateOf<List<Product>>(listOf())
    var isLoading = mutableStateOf(true)
    var data = mutableStateOf<Product?>(null)

    init {
        getProduct { response ->
            isLoading.value = false
            if (response.status == "ok") {
                dataList.value = response.data!!
            }
        }
    }

    fun getProduct(onSuccess: (response: ServiceResponse<Product>) -> Unit) {
        viewModelScope.launch {
            var data = repository.getProducts()
            onSuccess(data)
        }
    }

    fun getProductById(id: Long, onResponse: (response: ServiceResponse<Product>) -> Unit) {
        viewModelScope.launch {
            var response = repository.getProductById(id)
            onResponse(response)
        }
    }

    fun uploadCarpet(
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
        image: MultipartBody.Part,
        onResponse: (response: ServiceResponse<Product>) -> Unit
    ){
        viewModelScope.launch {
            var response = repository.uploadCarpet(
                title!!, category!! ,code!!, weight!!, dimension!!, size!!, color!!, shape!!, quantity!!, visitCount,
                addDate!!, property!!, description!!, price!!, quality!!, density!!, densityInHeight!!, densityInWidth!!,
                khabType!!, poodType!!, tarType!!, tissueLocation!!, tissueType!!,
                numcolor!!,image
            )
            onResponse(response)
        }
    }
    fun uploadCarpetPanel(
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
        tissuDensityIn7cm :RequestBody?,
        tissueType: RequestBody?,
        dimentionFrame: RequestBody?,
        frameType: RequestBody?,
        porzType: RequestBody?,
        image: MultipartBody.Part,
        onResponse: (response: ServiceResponse<Product>) -> Unit
    ){
        viewModelScope.launch {
            var response = repository.UploadCarpetPanel(
                title, category, code, weight, dimension, size, color,
                shape, quantity, visitCount, addDate, property, description,
                price, quality, density, densityInHeight, densityInWidth,
                khabType, poodType, tarType, tissueLocation, tissuDensityIn7cm,
                tissueType, dimentionFrame, frameType, porzType, image
            )
            onResponse(response)
        }
    }

    fun uploadCollage(
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
        image: MultipartBody.Part,
        onResponse: (response: ServiceResponse<Product>) -> Unit
    ){
        viewModelScope.launch {

            var response = repository.uploadCollage(title, category, code,
                weight, dimension, size, color, shape, quantity, visitCount, addDate,
                property, description, price, quality,
                density, khabType, poodType, tarType, tissueLocation, tissueType, numcolor,
                image)
            onResponse(response)
        }
    }

    fun uploadMoq(
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
        image: MultipartBody.Part,
        onResponse: (response: ServiceResponse<Product>) -> Unit
    ){
        viewModelScope.launch {
            var response = repository.uploadMoq(
                title, category, code, weight, dimension, color, shape, quantity,
                visitCount, addDate, property, description, price, quality,
                threadType, layernum, thickness, rangType, tissueType, image
            )
            onResponse(response)
        }
    }
    fun uploadRug(
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
        image: MultipartBody.Part,
        onResponse: (response: ServiceResponse<Product>) -> Unit
    ){
        viewModelScope.launch {
            var response = repository.uploadRug(
                title, category, code, weight, dimension, size, color,
                shape, quantity, visitCount, addDate, property, description,
                price, quality, poodType, tarType, tissueLocation, tissueType,
                image
            )
            onResponse(response)
        }
    }
}