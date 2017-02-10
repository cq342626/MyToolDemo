package com.chenqi.mytooldemo.top;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.chenqi.mytooldemo.R;

/**
 * 统一底部的基类activity
 */
public class BaseAcitvity extends Activity implements View.OnClickListener {

    private RelativeLayout parentRelativeLayout;//把父类activity和子类activity的view都add到这里
    private TextView tv1, tv2, tv3;

    public BaseAcitvity() {
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initContentView(R.layout.top);
        initView();
    }

    private void initContentView(int layoutResID) {
        ViewGroup viewGroup = (ViewGroup) findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        parentRelativeLayout = new RelativeLayout(this);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);//这个就是添加其他属性的，这个是在父元素的底部。
        viewGroup.addView(parentRelativeLayout);
        View view = LayoutInflater.from(this).inflate(layoutResID, null);
        view.setLayoutParams(params);
        view.setId(R.id.base_bottom);
        parentRelativeLayout.addView(view, params);
    }

    @Override
    public void setContentView(int layoutResID) {
        View view = LayoutInflater.from(this).inflate(layoutResID, null);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);
        params.addRule(RelativeLayout.ABOVE,R.id.base_bottom);
        parentRelativeLayout.addView(view, params);
    }

    private void initView() {
        tv1 = (TextView) findViewById(R.id.text1);
        tv2 = (TextView) findViewById(R.id.text2);
        tv3 = (TextView) findViewById(R.id.text3);

        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
    }

    public void isShow(boolean b1, boolean b2, boolean b3) {
        if (b1)
            tv1.setVisibility(View.VISIBLE);
        else
            tv1.setVisibility(View.GONE);
        if (b2)
            tv2.setVisibility(View.VISIBLE);
        else
            tv2.setVisibility(View.GONE);
        if (b3)
            tv3.setVisibility(View.VISIBLE);
        else
            tv3.setVisibility(View.GONE);
    }

    public void setTitle(String title) {
        tv2.setText(title);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.text1) {
            finish();
        }
    }
}
