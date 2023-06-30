package com.example.cart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class registerActivity extends AppCompatActivity {
Button buttonlogin;
EditText email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        buttonlogin=findViewById(R.id.buttonlogin);
        email=findViewById(R.id.namaTxt);


        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            validateEmailAddress(email);

            }
        });

    }
    private boolean validateEmailAddress(EditText email){
        String emailinput=email.getText().toString();

        if(TextUtils.isEmpty(email.getText().toString())){
            email.setError("Please Input your Email");
            return true;
        }else {
            Intent i = new Intent(registerActivity.this, ItemActivity.class);
            startActivity(i);
            return false;

        }



    }
}