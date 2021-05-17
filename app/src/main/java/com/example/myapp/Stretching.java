package com.example.myapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Stretching extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stretching);

        //read data from main activity
        Intent intent = getIntent();


        TextView tfull, ttotal, tspate, tumeri, tgenunchi, tgat ;
        ImageView full, total, spate, umeri, genunchi, gat;

            tfull = findViewById(R.id.txtfull);
            full = findViewById(R.id.imgfull);

            tfull.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    gotoUrl("https://www.youtube.com/watch?v=JJAHGpe0AVU");
                }
            });
            full.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    gotoUrl("https://www.youtube.com/watch?v=JJAHGpe0AVU");
                }
            });

        ttotal = findViewById(R.id.txttotal);
        total = findViewById(R.id.imgtotal);

        ttotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=y9fNh7cYo64");
            }
        });
        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=y9fNh7cYo64");
            }
        });



        tspate = findViewById(R.id.txtspate);
        spate = findViewById(R.id.imgspate);

        tspate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=UYMmtEFhuxA");
            }
        });
        spate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=UYMmtEFhuxA");
            }
        });


        tumeri = findViewById(R.id.txtumeri);
        umeri = findViewById(R.id.imgumeri);

        tumeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=6jHsraw2NIk");
            }
        });
        umeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=6jHsraw2NIk");
            }
        });

        tgenunchi = findViewById(R.id.txtgenunchi);
        genunchi = findViewById(R.id.imggenunchi);

        tgenunchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=LsB2mEMA1wk");
            }
        });
        genunchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=LsB2mEMA1wk");
            }
        });


        tgat = findViewById(R.id.txtgat);
        gat = findViewById(R.id.imggat);

        tgat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=was4RtzpfJs");
            }
        });
        gat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=was4RtzpfJs");
            }
        });


    }


    private void gotoUrl(String s) {


        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));

    }
}