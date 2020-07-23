package com.example.relax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {

    private Button rainButton, forestButton, fireButton, galaxyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        forestButton = findViewById(R.id.forest);
        rainButton = findViewById(R.id.rain);
        fireButton = findViewById(R.id.fire);
        galaxyButton = findViewById(R.id.galaxy);

        forestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, forestActivity.class);
                startActivity(intent);
            }
        });


        rainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, rainActivity.class);
                startActivity(intent);
            }
        });

        fireButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, fireActivity.class);
                startActivity(intent);
            }
        });


        galaxyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, galaxyActivity.class);
                startActivity(intent);
            }
        });
    }

}