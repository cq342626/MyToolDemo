//package com.chenqi.mytooldemo.top;
//
//import android.view.View;
//
//package com.gxtag.gym.ui;
//
//        import android.app.Activity;
//        import android.content.Context;
//        import android.os.Bundle;
//        import android.view.LayoutInflater;
//        import android.view.View;
//        import android.view.View.OnClickListener;
//        import android.view.ViewGroup;
//        import android.widget.LinearLayout;
//        import android.widget.LinearLayout.LayoutParams;
//        import android.widget.TextView;
//
//        import com.gxtag.gym.R;
//        import com.icq.app.widget.StatedButton;
//
//public class DynamicViewActivity extends Activity implements OnClickListener{
//
//    private Context mContext;
//    private TextView mTv_title;
//    private String title = "动态添加布局";
//    private StatedButton mSbtn_back;
//    private LinearLayout mLl_parent;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_dynamic);
//        mContext=this;
//        initView();
//        mLl_parent.addView(addView1());
//        mLl_parent.addView(addView2());
//
//    }
//
//    private void initView() {
//        // TODO 初始化视图
//        mLl_parent=(LinearLayout) findViewById(R.id.ll_parent);
//        mTv_title = (TextView) findViewById(R.id.tv_title);
//        mTv_title.setText(String.format(String.format(
//                getResources().getString(R.string.title), title)));
//        mSbtn_back = (StatedButton) findViewById(R.id.sbtn_navback);
//        mSbtn_back.setOnClickListener(this);
//
//
//    }
//
//    private View addView1() {
//        // TODO 动态添加布局(xml方式)
//        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
//                LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
////      LayoutInflater inflater1=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
////      LayoutInflater inflater2 = getLayoutInflater();
//        LayoutInflater inflater3 = LayoutInflater.from(mContext);
//        View view = inflater3.inflate(R.layout.block_gym_album_list_item, null);
//        view.setLayoutParams(lp);
//        return view;
//
//    }
//
//    private View addView2() {
//        // TODO 动态添加布局(java方式)
//        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
//                LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
//        LinearLayout view = new LinearLayout(this);
//        view.setLayoutParams(lp);//设置布局参数
//        view.setOrientation(LinearLayout.HORIZONTAL);// 设置子View的Linearlayout// 为垂直方向布局
//        //定义子View中两个元素的布局
//        ViewGroup.LayoutParams vlp = new ViewGroup.LayoutParams(
//                ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT);
//        ViewGroup.LayoutParams vlp2 = new ViewGroup.LayoutParams(
//                ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT);
//
//        TextView tv1 = new TextView(this);
//        TextView tv2 = new TextView(this);
//        tv1.setLayoutParams(vlp);//设置TextView的布局
//        tv2.setLayoutParams(vlp2);
//        tv1.setText("姓名:");
//        tv2.setText("李四");
//        tv2.setPadding(calculateDpToPx(50), 0, 0, 0);//设置边距
//        view.addView(tv1);//将TextView 添加到子View 中
//        view.addView(tv2);//将TextView 添加到子View 中
//        return view;
//    }
//
//    private int calculateDpToPx(int padding_in_dp){
//        final float scale = getResources().getDisplayMetrics().density;
//        return  (int) (padding_in_dp * scale + 0.5f);
//    }
//
//
//    @Override
//    public void onClick(View v) {
//        // TODO 控件单击事件
//        switch (v.getId()) {
//            case R.id.sbtn_navback:
//                this.finish();
//                break;
//            default:
//                break;
//        }
//    }
//
//}