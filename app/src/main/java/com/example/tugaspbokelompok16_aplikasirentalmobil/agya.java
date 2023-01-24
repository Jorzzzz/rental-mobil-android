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

public class agya extends AppCompatActivity {

    private ImageSlider imageSlider;
    ImageButton pesan, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agya);

        imageSlider = findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.newagyagrsporthitam, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.newagyagrsportkuning, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.newagyagrsportmerah, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.newagyagrsportputih, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        pesan = findViewById(R.id.pesan);
        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String wpurl = "https://wa.me/+6285243043609?text=Assalamualaikum warahmatullahi wabaraktuh pak agus salim, Saya ingin pesan mobil rental. \n\nIsi Data Berikut : \n\n Nama : \n Alamat : \n No Telp : \n Mobil : Agya 1.2 GR M/T \n Warna Mobil : Hitam/Kuning/Putih/Merah \n Plat Mobil : PB 2975 XL \n Lama Sewa : 1 Hari : 500.000/7 Hari : 3.500.000/1 Bulan : 15.000.000 \n\n *Isi Data Dengan Benar* \n *Hapus Jika Tidak Sesuai*";
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
                Intent intent = new Intent(agya.this, hatchback.class);
                startActivity(intent);
            }
        });

    }
}