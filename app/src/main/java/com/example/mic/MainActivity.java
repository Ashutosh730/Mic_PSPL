package com.example.mic;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView signUp, forgotPassword;
    private Button login;
    private LinearLayout facebook_login, google_login;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window window = MainActivity.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.yellow));

        signUp = findViewById(R.id.signUp);
        login = findViewById(R.id.login);
        facebook_login = findViewById(R.id.facebook_login);
        google_login = findViewById(R.id.google_login);
        forgotPassword = findViewById(R.id.forgotPassword);

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

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchActivity = new Intent(MainActivity.this , ForgotPassword.class);
                startActivity(switchActivity);
            }
        });
    }

    private void switchToHomePage(){
        Intent switchActivity = new Intent(MainActivity.this , HomePage.class);
        startActivity(switchActivity);
    }
}