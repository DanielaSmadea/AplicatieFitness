package com.example.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Fitness extends AppCompatActivity {
    Button fesieri, cvadriceps, bicepsfemural, gambe , piept, umeri, biceps, triceps, spate, abdomen;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness);

        //read data from Fourth activity
        Intent intent =  getIntent();
        fesieri = (Button) findViewById(R.id.btnfesieri);
        cvadriceps = (Button) findViewById(R.id.btncvadriceps);
        bicepsfemural = (Button) findViewById(R.id.btnbicepsfemural);
        gambe = (Button) findViewById(R.id.btngambe);
        piept = (Button) findViewById(R.id.btnpiept);
        umeri = (Button) findViewById(R.id.btnumeri);
        biceps = (Button) findViewById(R.id.btnbiceps);
        triceps = (Button) findViewById(R.id.btntriceps);
        spate = (Button) findViewById(R.id.btnspate);
        abdomen = (Button) findViewById(R.id.btnabdomen);

        fesieri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //the first activity name
                Intent intent = new Intent(getApplicationContext(),Fesieri.class);

                startActivity(intent);

            }
        });

        cvadriceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //the second activity name
                Intent intent = new Intent(getApplicationContext(), Cvadriceps.class);

                startActivity(intent);

            }
        });

        bicepsfemural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //the first activity name
                Intent intent = new Intent(getApplicationContext(),BicepsFemural.class);

                startActivity(intent);

            }
        });

        gambe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //the first activity name
                Intent intent = new Intent(getApplicationContext(),Gambe.class);

                startActivity(intent);

            }
        });
        piept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //the first activity name
                Intent intent = new Intent(getApplicationContext(),Piept.class);

                startActivity(intent);

            }
        });
        umeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //the first activity name
                Intent intent = new Intent(getApplicationContext(),Umeri.class);

                startActivity(intent);

            }
        });
        biceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //the first activity name
                Intent intent = new Intent(getApplicationContext(),Biceps.class);

                startActivity(intent);

            }
        });
        triceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //the first activity name
                Intent intent = new Intent(getApplicationContext(),Triceps.class);

                startActivity(intent);

            }
        });
        spate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //the first activity name
                Intent intent = new Intent(getApplicationContext(),Spate.class);

                startActivity(intent);

            }
        });
        abdomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //the first activity name
                Intent intent = new Intent(getApplicationContext(),Abdomen.class);

                startActivity(intent);

            }
        });



    }
}