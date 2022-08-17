package com.example.sw_02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.text.BreakIterator;
import java.util.ArrayList;

public class CustomAdapter_w extends RecyclerView.Adapter<CustomAdapter_w.CustomViewHolder> {

    private ArrayList<w_rst> arrayList;
    private Context context;

    public CustomAdapter_w(ArrayList<w_rst> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }


    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewGroup list_westernfood;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_westernfood, parent, false);
        CustomViewHolder holder = new CustomViewHolder(view);
        return holder;
    }


    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        Glide.with(holder.itemView);
        holder.tv_name.setText(arrayList.get(position).getName());
        holder.tv_dong.setText(arrayList.get(position).getDong());
        holder.tv_star.setText(arrayList.get(position).getStar());



    }

    @Override
    public int getItemCount() {
        return (arrayList != null ? arrayList.size() : 0);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name;
        TextView tv_dong;
        TextView tv_star;


        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tv_name = itemView.findViewById(R.id.tv_name);
            this.tv_dong = itemView.findViewById(R.id.tv_dong);
            this.tv_star = itemView.findViewById(R.id.tv_star);
        }
    }
}
