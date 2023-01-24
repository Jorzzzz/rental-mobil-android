package com.example.tugaspbokelompok16_aplikasirentalmobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class commercial extends AppCompatActivity {

    ImageButton truck,hilux,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commercial);

        truck = (ImageButton) findViewById(R.id.truck);
        truck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(commercial.this, truck.class);
                startActivity(intent);
            }
        });
        hilux = (ImageButton) findViewById(R.id.hilux);
        hilux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(commercial.this, hilux.class);
                startActivity(intent);
            }
        });
        back = (ImageButton) findViewById(R.id.backk);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(commercial.this, Menu.class);
                startActivity(intent);
            }
        });

    }
}