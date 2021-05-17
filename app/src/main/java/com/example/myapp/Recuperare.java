package com.example.myapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Recuperare extends AppCompatActivity  {

    TextView tspate, tgenunchi, tcot, tspate2, tgenunchi2, tumar ;

    ImageView spate, genunchi, cot, spate2, genunchi2, umar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperare);

        //read data from main activity
        Intent intent =  getIntent();

        tspate = findViewById(R.id.txtspate);
        spate = findViewById(R.id.imgspate);

        tspate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=pLwLzhZWE4Y");
            }
        });
        spate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=pLwLzhZWE4Y");
            }
        });


        tspate2 = findViewById(R.id.txtspate2);
        spate2 = findViewById(R.id.imgspate2);

        tspate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=-4El0iR4PhE");
            }
        });
        spate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=-4El0iR4PhE");
            }
        });


        tgenunchi = findViewById(R.id.txtgenunchi);
        genunchi = findViewById(R.id.imggenunchi);

        tgenunchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=TU-8qAbJILw");
            }
        });
        genunchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=TU-8qAbJILw");
            }
        });


        tgenunchi2 = findViewById(R.id.txtgenunchi2);
        genunchi2 = findViewById(R.id.imggenunchi2);

        tgenunchi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=WMOcMZQB-yc");
            }
        });
        genunchi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=WMOcMZQB-yc");
            }
        });


        tcot = findViewById(R.id.txtcot);
        cot = findViewById(R.id.imgcot);


        tcot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=U_eA1hSiCrUY");
            }
        });
        cot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=U_eA1hSiCrUY");
            }
        });

        tumar = findViewById(R.id.txtumar);
        umar = findViewById(R.id.imgumar);


        tumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=CGuTduLud9g");
            }
        });
        umar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=CGuTduLud9g");
            }
        });


    }

    private void gotoUrl(String s) {

        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));



    }


}