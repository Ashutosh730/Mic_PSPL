package com.example.mic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CreatePassword extends AppCompatActivity {

    private TextView back;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_password);

        back = findViewById(R.id.backCreatePassword);
        login = findViewById(R.id.loginCreatePassword);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchActivity = new Intent(CreatePassword.this , ForgotPassword.class);
                startActivity(switchActivity);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchActivity = new Intent(CreatePassword.this , HomePage.class);
                startActivity(switchActivity);
            }
        });
    }
}