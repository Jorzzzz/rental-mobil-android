package com.example.tugaspbokelompok16_aplikasirentalmobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class truck extends AppCompatActivity {

    private ImageSlider imageSlider;
    ImageButton pesan,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truck);

        imageSlider = findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.dynamerah, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        pesan = findViewById(R.id.pesan);
        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String wpurl = "https://wa.me/+6282235413747?text=Assalamualaikum warahmatullahi wabaraktuh pak Purnomo, Saya ingin pesan mobil rental. \n\nIsi Data Berikut : \n\n Nama : \n Alamat : \n No Telp : \n Dyna 136HT Hi-Gear 4x2 6MT \n Warna Mobil : Merah \n Plat Mobil : PB 4090 XL \n Lama Sewa : 1 Hari : 1.000.000/7 Hari : 7.000.000/1 Bulan : 30.000.000 \n\n *Isi Data Dengan Benar* \n *Hapus Jika Tidak Sesuai*";
                ;

                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);

            }
        });

        back = (ImageButton) findViewById(R.id.backk);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(truck.this, commercial.class);
                startActivity(intent);
            }
        });

    }
}