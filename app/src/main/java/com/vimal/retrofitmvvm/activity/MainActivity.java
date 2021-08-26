package com.vimal.retrofitmvvm.activity;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.vimal.retrofitmvvm.R;
import com.vimal.retrofitmvvm.adapter.HeroesAdapter;
import com.vimal.retrofitmvvm.model.Hero;
import com.vimal.retrofitmvvm.viewmodel.HeroesViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    HeroesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        HeroesViewModel model = ViewModelProviders.of(this).get(HeroesViewModel.class);

        model.getHeroes().observe(this, new Observer<List<Hero>>() {
            @Override
            public void onChanged(@Nullable List<Hero> heroList) {
                Log.e("vml",heroList.size()+" size");
                adapter = new HeroesAdapter(MainActivity.this, heroList);
                recyclerView.setAdapter(adapter);
            }
        });

//        CategoryViewModel categoryViewModel =  ViewModelProviders.of(this).get(CategoryViewModel.class);
//
//        categoryViewModel.getCategory().observe(this, new Observer<List<Category>>() {
//            @Override
//            public void onChanged(@Nullable List<Category> heroList) {
//
//                Log.e("vml",heroList.size()+" CategoryViewModel_size");
//
//                CategoryAdapter  adapter = new CategoryAdapter(MainActivity.this, heroList);
//                recyclerView.setAdapter(adapter);
//            }
//        });
    }




}