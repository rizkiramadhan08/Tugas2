package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

import android.widget.Button;

import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Button drawer_menu = findViewById(R.id.drawer_menu);

        drawer_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDrawer();
            }
        });
    }
    private void openDrawer() {
        DrawerLayout drawerLayout = findViewById(R.id.drawerlayout);
        drawerLayout.openDrawer(GravityCompat.END);
    }

}