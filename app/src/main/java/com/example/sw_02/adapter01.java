package com.example.sw_02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter01 extends RecyclerView.Adapter<adapter01.adapter01ViewHolder> {

    private ArrayList<분식> arrayList;
    private Context context;

    public adapter01(ArrayList<분식> arrayList, Context context) {
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



        holder.tv_name.getText(arrayList.get(position).getName())
        holder.tv_location.getText(arrayList.get(position).getLocation());
        holder.tv_star.getText(arrayList.get(position).getStar());




    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class adapter01ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name;
        TextView tv_location;
        TextView tv_star;



        public adapter01ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tv_name = itemView.findViewById(R.id.tv_name);
            this.tv_location = itemView.findViewById(R.id.tv_location);
            this.tv_star = itemView.findViewById(R.id.tv_star);


        }
    }
}
