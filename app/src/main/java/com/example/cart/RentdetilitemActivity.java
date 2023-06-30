package com.example.cart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


public class RentdetilitemActivity extends AppCompatActivity {

Button back,rent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rentdetilitem);
        back=findViewById(R.id.buttonback);
        rent=findViewById(R.id.rentbutton);

        back.setOnClickListener(view -> {
            Intent i = new Intent(RentdetilitemActivity.this, ItemActivity.class);
            startActivity(i);
        });
        rent.setOnClickListener(view -> {
            Intent i = new Intent(RentdetilitemActivity.this, CartActivity.class);
            startActivity(i);
        });

    }


}
