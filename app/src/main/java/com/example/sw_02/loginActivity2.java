package com.example.sw_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginActivity2 extends AppCompatActivity {

    private Button login_move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        login_move = findViewById(R.id.login_move);
        login_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( loginActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}