package com.example.cart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ItemActivity extends AppCompatActivity {
Button profile,rent,buy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        profile=findViewById(R.id.profilebutton);
        rent=findViewById(R.id.rentbutton1);
        buy=findViewById(R.id.buyButton1);

        profile.setOnClickListener(view -> {
            Intent i = new Intent(ItemActivity.this, profileActivity.class);
            startActivity(i);
        });

        rent.setOnClickListener(view -> {
            Intent i = new Intent(ItemActivity.this, RentdetilitemActivity.class);
            startActivity(i);
        });

        buy.setOnClickListener(view -> {
            Intent i = new Intent(ItemActivity.this, BuydetailActivity.class);
            startActivity(i);
        });




    }
}