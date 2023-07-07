package com.ib.testexercise.di

import com.ib.testexercise.api.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@Module
@InstallIn(SingletonComponent::class)
class ApplicationModule {
    @Provides
    fun provideRetrofit(): ApiService {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://api.duckduckgo.com")
            .build()
            .create(ApiService::class.java)
    }
}