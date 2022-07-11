package com.example.practicekotlin17.service

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {

    @GET("/v3/9d3e9e44-91da-4b3b-ac1f-25442c48e427")
    fun listMusics() : Call<MusicDto>
}