package com.example.mic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class SignUp extends AppCompatActivity {

    private Button signUp;
    private LinearLayout fbsignUp,googlesignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signUp = findViewById(R.id.signUp);
        fbsignUp = findViewById(R.id.fbsignUp);
        googlesignUp = findViewById(R.id.google_signUp);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToHomePage();
            }
        });

        fbsignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToHomePage();
            }
        });

        googlesignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToHomePage();
            }
        });
    }

    private void switchToHomePage() {
        Intent switchActivity = new Intent(this , HomePage.class);
        startActivity(switchActivity);
    }
}