package com.example.tugaspbokelompok16_aplikasirentalmobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class suv extends AppCompatActivity {

    ImageButton rush,fortuner,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suv);

        rush = (ImageButton) findViewById(R.id.rush);
        rush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(suv.this, rush.class);
                startActivity(intent);
            }
        });
        fortuner = (ImageButton) findViewById(R.id.fortuner);
        fortuner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(suv.this, fortuner.class);
                startActivity(intent);
            }
        });
        back = (ImageButton) findViewById(R.id.backk);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(suv.this, Menu.class);
                startActivity(intent);
            }
        });

    }
}