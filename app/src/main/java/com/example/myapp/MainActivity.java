package com.example.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.btnCall1);
        button2 = (Button) findViewById(R.id.btnCall2);
        button3 = (Button) findViewById(R.id.btnCall3);
        button4 = (Button) findViewById(R.id.btnCall4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //the first activity name
                Intent intent = new Intent(getApplicationContext(), Alimentatie.class);

                startActivity(intent);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //the 4 activity name
                Intent intent = new Intent(getApplicationContext(), Recuperare.class);

                startActivity(intent);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //the 3 activity name
                Intent intent = new Intent(getApplicationContext(), Stretching.class);

                startActivity(intent);

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //the 2 activity name
                Intent intent = new Intent(getApplicationContext(), Fitness.class);

                startActivity(intent);

            }
        });
    }
}