package com.example.mainnegarestan.viewmodel.site

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.site.Slider
import com.example.mainnegarestan.repository.site.SliderRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SliderViewModel @Inject constructor(var repository: SliderRepository): ViewModel() {


    var dataList = mutableStateOf<List<Slider>>(listOf())
    var isLoading = mutableStateOf(true)

    init {
        getSliders { response ->
            isLoading.value = false
        if (response.status == "ok"){
            dataList.value = response.data!!
            }
        }
    }

    fun getSliders(onResponse: (response : ServiceResponse<Slider>) -> Unit) {
        viewModelScope.launch {
            var data = repository.getSlisers()
            onResponse(data)
        }
    }
}