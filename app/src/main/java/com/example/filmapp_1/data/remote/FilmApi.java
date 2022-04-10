package com.example.filmapp_1.data.remote;

import com.example.filmapp_1.data.models.Film;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FilmApi {

    @GET("/films")
    Call<List<Film>> getFilms();


}
