package com.example.tugaspbokelompok16_aplikasirentalmobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class mvp extends AppCompatActivity {

    ImageButton avanza,veloz,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);

        avanza = (ImageButton) findViewById(R.id.avanza);
        avanza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mvp.this, avanza.class);
                startActivity(intent);
            }
        });
        veloz = (ImageButton) findViewById(R.id.veloz);
        veloz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mvp.this, veloz.class);
                startActivity(intent);
            }
        });
        back = (ImageButton) findViewById(R.id.backk);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mvp.this, Menu.class);
                startActivity(intent);
            }
        });

    }
}