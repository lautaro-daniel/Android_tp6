package com.pil.movieApp.service

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MovieRequestGenerator {
    private const val API_MOVIES_URL = "https://api.themoviedb.org/"
    private const val API = "apikey"

    //fix
    private val httpClient = OkHttpClient.Builder().addInterceptor { chain ->
        val defaultRequest = chain.request()
        val defaultHttpUrl = defaultRequest.url()
        val httpUrl = defaultHttpUrl.newBuilder()
            .addQueryParameter(API,"api_key=7d3e6a5c45ebf4fea2fa47bb046f8756")
            .build()
        val requestBuilder = defaultRequest.newBuilder().url(httpUrl)
        chain.proceed(requestBuilder.build())
    }


    private val builder = Retrofit.Builder()
        .baseUrl(API_MOVIES_URL)
        .addConverterFactory(GsonConverterFactory.create())

    fun <S> createService(serviceClass: Class<S>): S {
        val retrofit = builder.client(httpClient.build()).build()
        return retrofit.create(serviceClass)
    }


}
