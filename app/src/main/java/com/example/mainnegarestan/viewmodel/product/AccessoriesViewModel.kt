package com.example.mainnegarestan.viewmodel.product

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.product.Accessories
import com.example.mainnegarestan.repository.product.AccessoriesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AccessoriesViewModel @Inject constructor(var repository: AccessoriesRepository) : ViewModel() {

    var dataList = mutableStateOf<List<Accessories>>(listOf())
    var isLoading = mutableStateOf(true)

    init {
        getAccessories {response ->
            getAccessories {
                dataList.value = response.data!!
            }
        }
    }

    fun getAccessories(onSuccess: (response:ServiceResponse<Accessories>) -> Unit){
        viewModelScope.launch {
            var data = repository.getAccessories()
            onSuccess(data)
        }
    }
}