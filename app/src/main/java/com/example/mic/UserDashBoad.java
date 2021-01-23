package com.example.mic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class UserDashBoad extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ImageView imgMenu;
    private NavigationView navigationView;
    private Button payment_continue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dash_boad);

        payment_continue = findViewById(R.id.payment_continue);
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

        payment_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchActivity = new Intent(UserDashBoad.this, ConfirmationDetails.class);
                startActivity(switchActivity);
            }
        });
    }
}