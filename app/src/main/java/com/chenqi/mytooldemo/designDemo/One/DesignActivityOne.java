package com.chenqi.mytooldemo.designDemo.One;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.chenqi.mytooldemo.R;

import org.jetbrains.annotations.Nullable;

/**
 * Toolbar+TabLayout+ViewPager的基础应用
 */
public class DesignActivityOne extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_one);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("美女图鉴");
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(this);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        ViewPager pager = (ViewPager) findViewById(R.id.viewPager);

        ViewPagerApapter adapter = new ViewPagerApapter(getSupportFragmentManager());
        pager.setAdapter(adapter);

        tabLayout.setTabTextColors(Color.WHITE, Color.RED);
        tabLayout.setBackgroundColor(Color.CYAN);

        tabLayout.setupWithViewPager(pager);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);

        tabLayout.setTabsFromPagerAdapter(adapter);

    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
