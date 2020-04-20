package com.example.movieapp.api;

import com.example.movieapp.model.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service {

    @GET("movie/popular")
    Call<MoviesResponse> getPopularMovies(@Query("ac48497018874a3151365a424113f0d0") String apiKey);

}
