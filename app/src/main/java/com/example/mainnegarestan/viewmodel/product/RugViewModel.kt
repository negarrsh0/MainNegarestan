package com.example.mainnegarestan.viewmodel.product

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.product.Product
import com.example.mainnegarestan.model.product.Rug
import com.example.mainnegarestan.repository.product.RugRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RugViewModel @Inject constructor(var repository: RugRepository): ViewModel() {

    var dataList = mutableStateOf<List<Product>>(listOf())
    var isLoading = mutableStateOf(true)

    init {
        getRug {response ->
            isLoading.value = false
            if (response.status == "ok"){
                dataList.value = response.data!!
            }
        }
    }


    fun getRug(onSuccess:(response : ServiceResponse<Product>)-> Unit){
        viewModelScope.launch {
            var data = repository.getRug()
            onSuccess(data)
        }
    }
}