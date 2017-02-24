package com.chenqi.mytooldemo.designDemo.two;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.chenqi.mytooldemo.R;
import com.chenqi.mytooldemo.designDemo.One.ViewPagerApapter;

import org.jetbrains.annotations.Nullable;

/**
 *
 */
public class DesignActivity extends AppCompatActivity implements View.OnClickListener {

    private CoordinatorLayout coordinatorLayout;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private FloatingActionButton button;
    private Toolbar toolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_two);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        toolbar.setTitle("返回");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(this);

        ViewPagerApapter adapter = new ViewPagerApapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        tabLayout.setTabTextColors(Color.WHITE, Color.RED);
        tabLayout.setBackgroundColor(Color.CYAN);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.setTabsFromPagerAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.toolbar: finish();
        }
    }
}
