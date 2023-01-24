package com.example.tugaspbokelompok16_aplikasirentalmobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class profile extends AppCompatActivity {

    ImageButton back, ig, wa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        back = (ImageButton) findViewById(R.id.backk);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profile.this, Menu.class);
                startActivity(intent);
            }
        });

        ig = findViewById(R.id.igbutton1);
        ig.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {

                                      Uri uri = Uri.parse("http://instagram.com/_u/habibibasri09");


                                      Intent i = new Intent(Intent.ACTION_VIEW, uri);

                                      i.setPackage("com.instagram.android");

                                      try {
                                          startActivity(i);
                                      } catch (ActivityNotFoundException e) {

                                          startActivity(new Intent(Intent.ACTION_VIEW,
                                                  Uri.parse("http://instagram.com/_u/habibibasri09")));
                                      }
                                  }
                              });
        ig = findViewById(R.id.igbutton2);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("http://instagram.com/_u/_.deviiii");


                Intent i = new Intent(Intent.ACTION_VIEW, uri);

                i.setPackage("com.instagram.android");

                try {
                    startActivity(i);
                } catch (ActivityNotFoundException e) {

                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://instagram.com/_u/_.deviiii")));
                }
            }
        });
        ig = findViewById(R.id.igbutton3);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("http://instagram.com/_u/prnms.j");


                Intent i = new Intent(Intent.ACTION_VIEW, uri);

                i.setPackage("com.instagram.android");

                try {
                    startActivity(i);
                } catch (ActivityNotFoundException e) {

                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://instagram.com/_u/prnms.j")));
                }
            }
        });
        ig = findViewById(R.id.igbutton4);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("http://instagram.com/_u/hayyun_bakkin");


                Intent i = new Intent(Intent.ACTION_VIEW, uri);

                i.setPackage("com.instagram.android");

                try {
                    startActivity(i);
                } catch (ActivityNotFoundException e) {

                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://instagram.com/_u/hayyun_bakkin")));
                }
            }
        });
        ig = findViewById(R.id.igbutton5);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("http://instagram.com/_u/chaiylan");


                Intent i = new Intent(Intent.ACTION_VIEW, uri);

                i.setPackage("com.instagram.android");

                try {
                    startActivity(i);
                } catch (ActivityNotFoundException e) {

                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://instagram.com/_u/chaiylan")));
                }
            }
        });
        wa = findViewById(R.id.wabutton1);
        wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String wpurl = "https://wa.me/+6285243043609?text=Assalamualaikum warahmatullahi wabaraktuh";
                ;

                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);

            }
        });
        wa = findViewById(R.id.wabutton2);
        wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String wpurl = "https://wa.me/+6282297997274?text=Assalamualaikum warahmatullahi wabaraktuh";
                ;

                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);

            }
        });
        wa = findViewById(R.id.wabutton3);
        wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String wpurl = "https://wa.me/+6281247617473?text=Assalamualaikum warahmatullahi wabaraktuh";
                ;

                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);

            }
        });
        wa = findViewById(R.id.wabutton4);
        wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String wpurl = "https://wa.me/+6282235414265?text=Assalamualaikum warahmatullahi wabaraktuh";
                ;

                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);

            }
        });
        wa = findViewById(R.id.wabutton5);
        wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String wpurl = "https://wa.me/+6281343138560?text=Assalamualaikum warahmatullahi wabaraktuh";
                ;

                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);

            }
        });


    }
}
