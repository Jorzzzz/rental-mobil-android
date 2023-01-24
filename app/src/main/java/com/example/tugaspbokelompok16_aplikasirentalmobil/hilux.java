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

public class hilux extends AppCompatActivity {

    private ImageSlider imageSlider;
    ImageButton pesan,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hilux);

        imageSlider = findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.hiluxabu, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.hiluxhitam, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.hiluxputih, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.hiluxsilver, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        pesan = findViewById(R.id.pesan);
        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String wpurl = "https://wa.me/+6282235413747?text=Assalamualaikum warahmatullahi wabaraktuh pak Purnomo, Saya ingin pesan mobil rental. \n\nIsi Data Berikut : \n\n Nama : \n Alamat : \n No Telp : \n Mobil : 4x2 2.7 GR Sport A/T  \n Warna Mobil : Hitam/Silver/Putih/Abu \n Plat Mobil : PB 3990 XL \n Lama Sewa : 1 Hari : 1.000.000/7 Hari : 7.000.000/1 Bulan : 30.000.000 \n\n *Isi Data Dengan Benar* \n *Hapus Jika Tidak Sesuai*";
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
                Intent intent = new Intent(hilux.this, commercial.class);
                startActivity(intent);
            }
        });

    }
}