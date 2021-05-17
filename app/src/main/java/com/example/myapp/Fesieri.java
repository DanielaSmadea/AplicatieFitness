package com.example.myapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Fesieri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fesieri);


        Intent intent = getIntent();


        TextView link11, link22, link33, link44 ;

        link11 = findViewById(R.id.link1);

        link11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=i7J5h7BJ07g");
            }
        });

        link22 = findViewById(R.id.link2);

        link22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=mnxn-7SO9Ks");
            }
        });

        link33 = findViewById(R.id.link3);

        link33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=4eDJa5MnAmY");
            }
        });

        link44 = findViewById(R.id.link4);

        link44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=NLDBFtSNhqg");
            }
        });



    }

    private void gotoUrl(String s) {


        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));

    }
}