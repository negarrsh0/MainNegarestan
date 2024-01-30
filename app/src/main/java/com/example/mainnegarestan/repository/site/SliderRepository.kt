package com.example.mainnegarestan.repository.site

import com.example.mainnegarestan.api.site.SliderApi
import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.site.Slider
import java.lang.Exception
import javax.inject.Inject

class SliderRepository @Inject constructor(var api : SliderApi) {

    suspend fun getSlisers(): ServiceResponse<Slider> {
        return try {
            api.getSliders()
        } catch (e: Exception) {
            ServiceResponse(status = "EXCEPTION", message = e.message!!)
        }
    }

}