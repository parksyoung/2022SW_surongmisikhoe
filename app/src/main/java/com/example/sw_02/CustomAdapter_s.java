package com.example.sw_02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Snackadapter extends RecyclerView.Adapter<Snackadapter.adapter01ViewHolder> {

    private ArrayList<Snacksnack> arrayList;
    private Context context;

    public Snackadapter(ArrayList<Snacksnack> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public adapter01ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_snack, parent, false);
        adapter01ViewHolder holder = new adapter01ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull adapter01ViewHolder holder, int position) {



        holder.tv_name.getText(arrayList.get(position).getName());
        holder.tv_dong.getText(arrayList.get(position).getDong());
        holder.tv_star.getText(arrayList.get(position).getStar());




    }

    @Override
    public int getItemCount() {
        return (arrayList != null ? arrayList.size() : 0);
    }

    public class adapter01ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name;
        TextView tv_dong;
        TextView tv_star;



        public adapter01ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tv_name = itemView.findViewById(R.id.tv_name);
            this.tv_dong = itemView.findViewById(R.id.tv_dong);
            this.tv_star = itemView.findViewById(R.id.tv_star);


        }
    }
}