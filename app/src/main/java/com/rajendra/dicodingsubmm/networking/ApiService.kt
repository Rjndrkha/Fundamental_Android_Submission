package com.rajendra.dicodingsubmm.networking

import com.rajendra.dicodingsubmm.BuildConfig
import com.rajendra.dicodingsubmm.datasource.SearchResponse
import com.rajendra.dicodingsubmm.datasource.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("users")
    @Headers("Authorization: token $API_TOKEN", "UserResponse-Agent: request")
    suspend fun getListUsersAsync(): ArrayList<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token $API_TOKEN", "UserResponse-Agent: request")
    suspend fun getDetailUserAsync(@Path("username") username: String): UserResponse

    @GET("search/users")
    @Headers("Authorization: token $API_TOKEN", "UserResponse-Agent: request")
    fun getUserBySearch(@Query("q") username: String): Call<SearchResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token $API_TOKEN", "UserResponse-Agent: request")
    suspend fun getListFollowers(@Path("username") username: String): ArrayList<UserResponse>

    @GET("users/{username}/following")
    @Headers("Authorization: token $API_TOKEN", "UserResponse-Agent: request")
    suspend fun getListFollowing(@Path("username") username: String): ArrayList<UserResponse>

    companion object {
        private const val API_TOKEN = "XXXXX"
    }
}
