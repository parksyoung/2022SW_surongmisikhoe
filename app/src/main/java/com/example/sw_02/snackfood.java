package com.example.sw_02;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class snackfood extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private Arraylist<snackfood> arraylist;
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;
    private ArrayList<s_rst> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);

        recyclerView = findViewById((R.id.recyclerView));
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        arraylist = new Arraylist<>();

        database = FirebaseDatabase.getInstance();

        databaseReference = database.getReference("s_rst");
        databaseReference.addListenerForSingleValueEvent(new ValueEventListener(){
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                arraylist.clear();
                for(DataSnapshot snapshot : dataSnapshot.getChildren()){
                      s_rst s_rst = snapshot.getValue(s_rst.class);
                      arraylist.add(s_rst);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Log.e("snackfood", String.valueOf(databaseError.toException()));
            }
        });

        adapter = new CustomAdapter_s(arrayList, this);
        recyclerView.setAdapter(adapter);
        }




    private class Arraylist<T> {
        public void clear() {
        }

        public void add(T s_rst) {
        }

        public void add(s_rst s_rst) {
        }
    }
}