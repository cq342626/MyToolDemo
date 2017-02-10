package com.chenqi.mytooldemo.top;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.chenqi.mytooldemo.R;

/**
 * Created by Administrator on 2017/2/7.
 */
public class BaseAcitvity2 extends BaseAcitvity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("BaseAcitvity2");
    }
}
