package com.example.mainnegarestan.viewmodel.product

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.product.Collage
import com.example.mainnegarestan.model.product.Product
import com.example.mainnegarestan.repository.product.CollageRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CollageViewModel @Inject constructor(var repository: CollageRepository): ViewModel() {

    var dataList = mutableStateOf<List<Product>>(listOf())
    var isLoading = mutableStateOf(true)

    init {
        getCollage {response ->
            isLoading.value = false
            if (response.status == "ok"){
                dataList.value = response.data!!
            }
        }
    }


    fun getCollage(onSuccess: (response: ServiceResponse<Product>) -> Unit){
        viewModelScope.launch {
            var data = repository.getCollage()
            onSuccess(data)
        }
    }
}