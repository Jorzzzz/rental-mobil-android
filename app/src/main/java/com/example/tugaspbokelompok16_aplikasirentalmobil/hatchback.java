package com.example.tugaspbokelompok16_aplikasirentalmobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class hatchback extends AppCompatActivity {

    ImageButton agya,yaris,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hatchback);

        agya = (ImageButton) findViewById(R.id.agya);
        agya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hatchback.this, agya.class);
                startActivity(intent);
            }
        });
        yaris = (ImageButton) findViewById(R.id.yaris);
        yaris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hatchback.this, yaris.class);
                startActivity(intent);
            }
        });
        back = (ImageButton) findViewById(R.id.backk);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hatchback.this, Menu.class);
                startActivity(intent);
            }
        });

    }
}