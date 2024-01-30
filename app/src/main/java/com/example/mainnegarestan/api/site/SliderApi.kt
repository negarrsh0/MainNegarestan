package com.example.mainnegarestan.api.site

import com.example.mainnegarestan.model.ServiceResponse
import com.example.mainnegarestan.model.site.Slider
import retrofit2.http.GET

interface SliderApi {

    @GET("slider.php")
    suspend fun getSliders(): ServiceResponse<Slider>

}