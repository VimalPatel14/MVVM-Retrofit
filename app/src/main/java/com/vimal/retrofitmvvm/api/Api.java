package com.vimal.retrofitmvvm.api;

import com.vimal.retrofitmvvm.model.Category;
import com.vimal.retrofitmvvm.model.Hero;

import java.util.List;
 
import retrofit2.Call;
import retrofit2.http.GET;
 
public interface Api {
 
    String BASE_URL = "https://simplifiedcoding.net/demos/";
    String BASE_URL_Local = "http://192.168.0.20:45457/";

    @GET("marvel")
    Call<List<Hero>> getHeroes();

    @GET("api/Category")
    Call<List<Category>> getCategory();
}