package com.example.mainnegarestan.viewmodel.user

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.user.User
import com.example.mainnegarestan.repository.user.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(var repository:UserRepository):ViewModel(){


    fun login(data:User , onResponse:(response: ServiceResponse<User>) -> Unit){
        viewModelScope.launch {
            var response = repository.login(data)
            onResponse(response)
            Log.e("TAG", "login: ${response.toString()}")

        }
    }

    fun register(data: User,onResponse: (response: ServiceResponse<User>) -> Unit){
        viewModelScope.launch {
            var response = repository.register(data)
            onResponse(response)
            Log.e("TAG", "register:${response.status} ", )
        }
    }


}