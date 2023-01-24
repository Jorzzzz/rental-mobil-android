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

public class rush extends AppCompatActivity {

    private ImageSlider imageSlider;
    ImageButton pesan,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rush);

        imageSlider = findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.rushgrsport1hitam, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.rushgrsport1merah, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.rushgrsport1putih, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.rushgrsport1silver, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        pesan = findViewById(R.id.pesan);
        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String wpurl = "https://wa.me/+6281247291283?text=Assalamualaikum warahmatullahi wabaraktuh pak Hartono, Saya ingin pesan mobil rental. \n\nIsi Data Berikut : \n\n Nama : \n Alamat : \n No Telp : \n Mobil : Rush M/T GR Sport \n Warna Mobil : Hitam/Silver/Putih/Merah \n Plat Mobil : PB 2930 XL \n Lama Sewa : 1 Hari : 700.000/7 Hari : 4.900.000/1 Bulan : 21.000.000 \n\n *Isi Data Dengan Benar* \n *Hapus Jika Tidak Sesuai*";
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
                Intent intent = new Intent(rush.this, suv.class);
                startActivity(intent);
            }
        });

    }
}