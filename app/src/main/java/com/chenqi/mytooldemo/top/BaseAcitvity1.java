package com.chenqi.mytooldemo.top;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.chenqi.mytooldemo.R;

/**
 * Created by Administrator on 2017/2/7.
 */
public class BaseAcitvity1 extends BaseAcitvity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("BaseAcitvity1");
        TextView tv = (TextView) findViewById(R.id.text);
        tv.setText("跳转");
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BaseAcitvity1.this, BaseAcitvity2.class);
                startActivity(intent);
            }
        });
    }

}
