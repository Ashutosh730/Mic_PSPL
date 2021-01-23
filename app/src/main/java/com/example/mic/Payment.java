package com.example.mic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import com.google.android.material.navigation.NavigationView;


public class Payment extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ImageView imgMenu;
    private NavigationView navigationView;
    private Button pay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        pay = findViewById(R.id.pay);
        drawerLayout = findViewById(R.id.homePage);
        imgMenu = findViewById(R.id.imgMenu);
        navigationView = findViewById(R.id.navigationView);
        navigationView.setItemIconTintList(null);
        imgMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchActivity = new Intent(Payment.this, Final.class);
                startActivity(switchActivity);
            }
        });

    }
}