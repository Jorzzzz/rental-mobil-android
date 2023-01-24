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

public class veloz extends AppCompatActivity {

    private ImageSlider imageSlider;
    ImageButton pesan,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veloz);

        imageSlider = findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.velovqputih, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.velovqhitam, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.velovqsilver, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        pesan = findViewById(R.id.pesan);
        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String wpurl = "https://wa.me/+6282197804760?text=Assalamualaikum warahmatullahi wabaraktuh pak Bambang, Saya ingin pesan mobil rental. \n\nIsi Data Berikut : \n\n Nama : \n Alamat : \n No Telp : \n Mobil : Veloz Q CVT    \n Warna Mobil : Hitam/Silver/Putih \n Plat Mobil : PB 2190 XL \n Lama Sewa : 1 Hari : 500.000/7 Hari : 3.500.000/1 Bulan : 15.000.000 \n\n *Isi Data Dengan Benar* \n *Hapus Jika Tidak Sesuai*";
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
                Intent intent = new Intent(veloz.this, mvp.class);
                startActivity(intent);
            }
        });

    }
}