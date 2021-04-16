package com.example.myapp;

import android.content.Intent;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.OnTabSelectedListener;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Objects;

public class FirstActivity extends AppCompatActivity {

    private TabLayout tablayout;
    private ViewPager viewPager;
    private TabItem tab1, tab2, tab3,tab4;
    public PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Intent intent = getIntent();
        tablayout =(TabLayout) findViewById(R.id.tablayout);
        tab1 =(TabItem) findViewById(R.id.Tab1);
        tab2 =(TabItem) findViewById(R.id.Tab2);
        tab3 =(TabItem) findViewById(R.id.Tab3);
        tab4 =(TabItem) findViewById(R.id.Tab4);
        viewPager = findViewById(R.id.viewpager);

        pagerAdapter = new PageAdapter(getSupportFragmentManager(), tablayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);

        tablayout.setOnTabSelectedListener(new OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition() == 0){
                    pagerAdapter.notifyDataSetChanged();
                }
                if(tab.getPosition() == 1) {pagerAdapter.notifyDataSetChanged();}
                if(tab.getPosition() == 2){ pagerAdapter.notifyDataSetChanged();}

                if(tab.getPosition() == 3){ pagerAdapter.notifyDataSetChanged();}

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));

    }


}