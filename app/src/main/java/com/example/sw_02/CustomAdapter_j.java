package com.example.sw_02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.ArrayList;

public abstract class CustomAdapter_j extends RecyclerView.Adapter<CustomAdapter_j.CustomViewHolder> {

    private ArrayList<j_rst> arrayList;
    private Context context;

    public CustomAdapter_j(ArrayList<j_rst> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }


    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewGroup list_japenfood;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout. list_japenfood, parent, false);
        CustomViewHolder holder = new CustomViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

        holder.tv_name.setText(arrayList.get(position).getName());
        holder.tv_dong.setText(arrayList.get(position).getDong());




    }

    @Override
    public int getItemCount() {
        return (arrayList != null ? arrayList.size() : 0);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name;
        TextView tv_dong;



        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tv_name = itemView.findViewById(R.id.tv_name);
            this.tv_dong = itemView.findViewById(R.id.tv_dong);

        }
    }
}
