package com.example.mainnegarestan.viewmodel.product

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.product.Carpet
import com.example.mainnegarestan.model.product.Product
import com.example.mainnegarestan.repository.product.CarpetRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CarpetViewModel @Inject constructor(var repository: CarpetRepository) : ViewModel(){

    var dataList = mutableStateOf<List<Product>>(listOf())
    var isLoading = mutableStateOf(true)


    init {
        getCarpet {response ->
            isLoading.value = false
            if (response.status == "ok"){
                dataList.value = response.data!!
            }
        }
    }

    fun getCarpet(onSuccess : (response: ServiceResponse<Product>) -> Unit){
        viewModelScope.launch {
            var data = repository.getCarpet()
            onSuccess(data)
        }
    }
}