package com.example.session5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Chats extends AppCompatActivity {

    ImageButton imgbtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chats);

        Button btnBack1 = findViewById(R.id.btnBack);
        btnBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sw = new Intent(Chats.this, Home.class);
                startActivity(sw);
            }
        });

        imgbtn1 = findViewById(R.id.imageChat2Btn);
        imgbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sw = new Intent(Chats.this, ChatRider.class);
                startActivity(sw);
            }
        });
    }
}