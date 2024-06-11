package com.example.mainnegarestan.module

import com.example.mainnegarestan.api.product.AccessoriesApi
import com.example.mainnegarestan.api.product.CarpetApi
import com.example.mainnegarestan.api.product.CarpetPanelApi
import com.example.mainnegarestan.api.product.CollageApi
import com.example.mainnegarestan.api.product.MoquetteApi
import com.example.mainnegarestan.api.product.ProductApi
import com.example.mainnegarestan.api.product.RugApi
import com.example.mainnegarestan.api.site.SliderApi
import com.example.mainnegarestan.api.user.UserApi
import com.example.mainnegarestan.model.product.CarpetPanel
import com.example.mainnegarestan.model.product.Collage
import com.example.mainnegarestan.model.product.Product
import com.example.mainnegarestan.model.product.Rug
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    val gson = GsonBuilder().setLenient().create()

    @Provides
    @Singleton
    fun provideApi() : Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://negarrsh.ir/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }

    @Singleton
    @Provides
    fun provideSliderApi(): SliderApi {
        return provideApi().create(SliderApi::class.java)
    }

    @Singleton
    @Provides
    fun provideAccessoriesApi(): AccessoriesApi {
        return provideApi().create(AccessoriesApi::class.java)
    }


    @Singleton
    @Provides
    fun provideCarpetPanelApi(): CarpetPanelApi {
        return provideApi().create(CarpetPanelApi::class.java)
    }

    @Singleton
    @Provides
    fun provideCarpetApi(): CarpetApi {
        return provideApi().create(CarpetApi::class.java)
    }

    @Singleton
    @Provides
    fun provideCollageApi(): CollageApi {
        return provideApi().create(CollageApi::class.java)
    }

    @Singleton
    @Provides
    fun provideMoqueteeApi(): MoquetteApi {
        return provideApi().create(MoquetteApi::class.java)
    }

    @Singleton
    @Provides
    fun provideProductApi(): ProductApi {
        return provideApi().create(ProductApi::class.java)
    }

    @Singleton
    @Provides
    fun provideRugApi(): RugApi {
        return provideApi().create(RugApi::class.java)
    }

    @Singleton
    @Provides
    fun provideUserApi(): UserApi{
        return provideApi().create(UserApi::class.java)
    }
}