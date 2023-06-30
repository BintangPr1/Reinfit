package com.example.cart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class profileActivity extends AppCompatActivity {
Button logout,history;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        logout=findViewById(R.id.button);
        history=findViewById(R.id.imageButton);

        logout.setOnClickListener(view -> {
            Intent i = new Intent(profileActivity.this, registerActivity.class);
            startActivity(i);
        });

        history.setOnClickListener(view -> {
            Intent i = new Intent(profileActivity.this, ProfileStoryActivity.class);
            startActivity(i);
        });
    }
}