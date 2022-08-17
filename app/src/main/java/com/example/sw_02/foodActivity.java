package com.example.sw_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class foodActivity extends AppCompatActivity {

    private Button koreanfood;
    private Button japanfood;
    private Button westernfood;
    private Button chinafood;
    private Button snack;
    private Button cafe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        koreanfood = findViewById(R.id.koreanfood);
        koreanfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(foodActivity.this, koreanfood.class);
                startActivity(intent);

            }
        });

        chinafood = findViewById(R.id.chinafood);
        chinafood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(foodActivity.this, chinafood.class);
                startActivity(intent);

            }
        });
        westernfood = findViewById(R.id.westernfood);
        westernfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(foodActivity.this, westernfood.class);
                startActivity(intent);

            }
        });
        japanfood = findViewById(R.id.japanfood);
        japanfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(foodActivity.this, japenfood.class);
                startActivity(intent);

            }
        });
        snack = findViewById(R.id.snack);
        snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(foodActivity.this, snackfood.class);
                startActivity(intent);

            }
        });
        cafe = findViewById(R.id.cafe);
        cafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(foodActivity.this, cafeActivity.class);
                startActivity(intent);

            }
        });




    }
}