package com.example.mainnegarestan.module

import com.example.mainnegarestan.api.product.AccessoriesApi
import com.example.mainnegarestan.api.product.CarpetApi
import com.example.mainnegarestan.api.product.CarpetPanelApi
import com.example.mainnegarestan.api.product.CollageApi
import com.example.mainnegarestan.api.product.MoquetteApi
import com.example.mainnegarestan.api.product.ProdectApi
import com.example.mainnegarestan.api.product.RugApi
import com.example.mainnegarestan.api.site.SliderApi
import com.example.mainnegarestan.model.product.Collage
import com.example.mainnegarestan.model.product.Rug
import com.example.mainnegarestan.model.site.Slider
import com.example.mainnegarestan.repository.product.AccessoriesRepository
import com.example.mainnegarestan.repository.product.CarpetPanelRepository
import com.example.mainnegarestan.repository.product.CarpetRepository
import com.example.mainnegarestan.repository.product.CollageRepository
import com.example.mainnegarestan.repository.product.MoqueteeRepository
import com.example.mainnegarestan.repository.product.ProductRepository
import com.example.mainnegarestan.repository.product.RugRepository
import com.example.mainnegarestan.repository.site.SliderRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {


    @Provides
    @Singleton
    fun provideSliderRepository(api: SliderApi) = SliderRepository(api)


    @Provides
    @Singleton
    fun provideAccessoriesRepository(api: AccessoriesApi) = AccessoriesRepository(api)


    @Provides
    @Singleton
    fun provideCarpetPanelRepository(api: CarpetPanelApi) = CarpetPanelRepository(api)


    @Provides
    @Singleton
    fun provideCarpetRepository(api: CarpetApi) = CarpetRepository(api)


    @Provides
    @Singleton
    fun provideCollageRepository(api: CollageApi) = CollageRepository(api)


    @Provides
    @Singleton
    fun provideMoquetteRepository(api: MoquetteApi) = MoqueteeRepository(api)


    @Provides
    @Singleton
    fun provideProductRepository(api: ProdectApi) = ProductRepository(api)

    @Provides
    @Singleton
    fun provideRugRepository(api: RugApi) = RugRepository(api)
}
