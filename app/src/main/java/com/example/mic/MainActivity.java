package com.example.mic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView signUp;
    private Button login;
    private LinearLayout facebook_login, google_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signUp = findViewById(R.id.signUp);
        login = findViewById(R.id.login);
        facebook_login = findViewById(R.id.facebook_login);
        google_login = findViewById(R.id.google_login);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent switchActivity = new Intent(MainActivity.this , SignUp.class);
                MainActivity.this.startActivity(switchActivity);

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToHomePage();
            }
        });

        facebook_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToHomePage();
            }
        });

        google_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToHomePage();
            }
        });

    }

    private void switchToHomePage(){
        Intent switchActivity = new Intent(MainActivity.this , HomePage.class);
        MainActivity.this.startActivity(switchActivity);
    }
}