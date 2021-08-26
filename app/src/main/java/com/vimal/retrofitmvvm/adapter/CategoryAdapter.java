package com.vimal.retrofitmvvm.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.vimal.retrofitmvvm.R;
import com.vimal.retrofitmvvm.model.Category;
import com.vimal.retrofitmvvm.model.Hero;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.HeroViewHolder> {

    Context mCtx;
    List<Category> heroList;

    public CategoryAdapter(Context mCtx, List<Category> heroList) {
        this.mCtx = mCtx;
        this.heroList = heroList;
    }
 
    @NonNull
    @Override
    public HeroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mCtx).inflate(R.layout.recyclerview_layout, parent, false);
        return new HeroViewHolder(view);
    }
 
    @Override
    public void onBindViewHolder(@NonNull HeroViewHolder holder, int position) {
        Category hero = heroList.get(position);
 
        Glide.with(mCtx)
                .load(hero.getCategoryImagePath())
                .into(holder.imageView);
 
        holder.textView.setText(hero.getCategoryName());
    }
 
    @Override
    public int getItemCount() {
        return heroList.size();
    }
 
    class HeroViewHolder extends RecyclerView.ViewHolder {
 
        ImageView imageView;
        TextView textView;
 
        public HeroViewHolder(View itemView) {
            super(itemView);
 
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}