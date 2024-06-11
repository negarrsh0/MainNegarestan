package com.example.mainnegarestan.viewmodel.product

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.ViewModelFactoryDsl
import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.product.CarpetPanel
import com.example.mainnegarestan.model.product.Product
import com.example.mainnegarestan.repository.product.CarpetPanelRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CarpetPanelViewModel @Inject constructor(var repository: CarpetPanelRepository): ViewModel() {


    var dataList = mutableStateOf<List<Product>>(listOf())
    var isLoading = mutableStateOf(true)

    init {
        getCarpetPanel {response ->
            isLoading.value = false
            if (response.status == "ok"){
                dataList.value = response.data!!
            }
        }
    }

    fun getCarpetPanel(onSuccess: (response: ServiceResponse<Product>) -> Unit){
        viewModelScope.launch {
            var data = repository.getCarpetPanel()
            onSuccess(data)
        }
    }
}