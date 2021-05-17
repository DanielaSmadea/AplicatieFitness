package com.example.myapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Umeri extends AppCompatActivity {

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
                gotoUrl("https://www.youtube.com/watch?v=HzIiNhHhhtA");
            }
        });

        link22 = findViewById(R.id.link2);

        link22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=OuG1smZTsQQ");
            }
        });

        link33 = findViewById(R.id.link3);

        link33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=_t3lrPI6Ns4");
            }
        });

        link44 = findViewById(R.id.link4);

        link44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=lq7eLC30b9w");
            }
        });



    }

    private void gotoUrl(String s) {


        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));

    }
}