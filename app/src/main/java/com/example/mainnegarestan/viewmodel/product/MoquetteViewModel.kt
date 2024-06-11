package com.example.mainnegarestan.viewmodel.product

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.product.Moquette
import com.example.mainnegarestan.model.product.Product
import com.example.mainnegarestan.repository.product.MoqueteeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MoquetteViewModel @Inject constructor (val repository: MoqueteeRepository): ViewModel() {

    var dataList = mutableStateOf<List<Product>>(listOf())
    var isLoading = mutableStateOf(true)


    init {
        getMoquette { response ->
            isLoading.value = false
            if (response.status == "ok"){
                dataList.value = response.data!!
            }
        }
    }



fun getMoquette(onSuccess : (response: ServiceResponse<Product>) -> Unit){
    viewModelScope.launch {
        var data = repository.getMoquette()
        onSuccess(data)
    }
}

}