package com.example.filmapp_1;

import android.app.Application;

import com.example.filmapp_1.data.remote.FilmApi;
import com.example.filmapp_1.data.remote.RetrofitClient;

public class App extends Application {

    private RetrofitClient retrofitClient;
    public static FilmApi api;

    @Override
    public void onCreate() {
        super.onCreate();
        retrofitClient = new RetrofitClient();
        api = retrofitClient.createFilmApi();
    }
}
