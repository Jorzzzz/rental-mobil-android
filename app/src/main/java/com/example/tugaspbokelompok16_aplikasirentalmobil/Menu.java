package com.example.tugaspbokelompok16_aplikasirentalmobil;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {

    ImageButton keluar,hatchback,mvp,suv,commercial,profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        hatchback = (ImageButton) findViewById(R.id.hactback);
        hatchback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, hatchback.class);
                startActivity(intent);
            }
        });
        mvp = (ImageButton) findViewById(R.id.mvp);
        mvp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, mvp.class);
                startActivity(intent);
            }
        });
        suv = (ImageButton) findViewById(R.id.suv);
        suv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, suv.class);
                startActivity(intent);
            }
        });
        commercial = (ImageButton) findViewById(R.id.commercial);
        commercial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, commercial.class);
                startActivity(intent);
            }
        });
        keluar = (ImageButton) findViewById(R.id.keluar);
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

        profile = (ImageButton) findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, profile.class);
                startActivity(intent);
            }
        });

    }
}