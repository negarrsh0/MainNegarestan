package com.example.mainnegarestan.viewmodel.product

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.product.Product
import com.example.mainnegarestan.repository.product.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor(var repository: ProductRepository) : ViewModel(){

    var dataList = mutableStateOf<List<Product>>(listOf())
    var isLoading = mutableStateOf(true)

    init {
        getProduct {response ->
            isLoading.value = false
            dataList.value = response.data!!
        }
    }

    fun getProduct(onSuccess : (response: ServiceResponse<Product>) ->Unit){
        viewModelScope.launch {
            var data = repository.getCarpetPanel()
            onSuccess(data)
        }
    }
}