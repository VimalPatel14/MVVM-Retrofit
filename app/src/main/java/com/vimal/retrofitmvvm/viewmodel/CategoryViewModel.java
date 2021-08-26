package com.vimal.retrofitmvvm.viewmodel;


import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.vimal.retrofitmvvm.api.Api;
import com.vimal.retrofitmvvm.model.Category;
import com.vimal.retrofitmvvm.model.Hero;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CategoryViewModel extends ViewModel {

    //this is the data that we will fetch asynchronously 
    private MutableLiveData<List<Category>> categoryList;

    //we will call this method to get the data
    public LiveData<List<Category>> getCategory() {
        //if the list is null 
        if (categoryList == null) {
            categoryList = new MutableLiveData<List<Category>>();
            //we will load it asynchronously from server in this method
            loadCategory();
        }

        //finally we will return the list
        return categoryList;
    }


    //This method is using Retrofit to get the JSON data from URL 
    private void loadCategory() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL_Local)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);
        Call<List<Category>> call = api.getCategory();
        call.enqueue(new Callback<List<Category>>() {
            @Override
            public void onResponse(Call<List<Category>> call, Response<List<Category>> response) {
                //finally we are setting the list to our MutableLiveData
                categoryList.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<Category>> call, Throwable t) {

            }
        });
    }
}
 