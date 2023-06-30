package com.example.cart;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import android.widget.Button;


public class BuydetailActivity extends AppCompatActivity {
Button buy,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buydetail);

        back=findViewById(R.id.buttonback);
        buy=findViewById(R.id.button1);


        back.setOnClickListener(view -> {
            Intent i = new Intent(BuydetailActivity.this, ItemActivity.class);
            startActivity(i);
        });
        buy.setOnClickListener(view -> {
            Intent i = new Intent(BuydetailActivity.this, CartActivity.class);
            startActivity(i);
        });


    }


}
