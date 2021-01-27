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

public class SignUp extends AppCompatActivity {

    private Button signUp;
    private LinearLayout fbsignUp,googlesignUp;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Window window = SignUp.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(ContextCompat.getColor(SignUp.this, R.color.yellow));

        signUp = findViewById(R.id.signUp);
        fbsignUp = findViewById(R.id.fbsignUp);
        googlesignUp = findViewById(R.id.google_signUp);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchActivity = new Intent(SignUp.this , AccountCreated.class);
                startActivity(switchActivity);
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