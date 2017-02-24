package com.chenqi.mytooldemo.designDemo.One;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Administrator on 2017/2/14.
 */
public class ViewPagerApapter extends FragmentPagerAdapter {

    private final String[] TITLE = { "清纯", "校花", "可爱", "嫩萝莉", "唯美"};

    public ViewPagerApapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return ItemFragment.getInstance(TITLE[position]);
    }

    @Override
    public int getCount() {
        return TITLE.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TITLE[position];
    }

}


