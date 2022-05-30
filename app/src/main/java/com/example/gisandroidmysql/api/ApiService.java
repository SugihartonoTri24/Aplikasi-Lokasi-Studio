package com.example.gisandroidmysql.api;

import com.example.gisandroidmysql.model.ListLocationModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("JsonDisplayMarker.php")
    Call<ListLocationModel> getAllLocation();
}
