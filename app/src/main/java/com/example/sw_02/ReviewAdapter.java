package com.example.sw_02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.CustomViewHolder>{

    private ArrayList<ReviewData> arrayList;
    private Context context;


    public ReviewAdapter(ArrayList<ReviewData> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        CustomViewHolder holder = new CustomViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.tv_name.setText(arrayList.get(position).getTv_name());
        holder.tv_cate.setText(arrayList.get(position).getTv_cate_1());
        holder.tv_review.setText(arrayList.get(position).getTv_rate_num());

    }

    @Override
    public int getItemCount() {
        return (arrayList != null ? arrayList.size() : 0);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name;
        TextView tv_cate;
        TextView tv_review;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tv_name = itemView.findViewById(R.id.tv_name);
            this.tv_cate = itemView.findViewById(R.id.tv_cate_1);
            this.tv_review = itemView.findViewById(R.id.tv_rate_num);
        }
    }
}