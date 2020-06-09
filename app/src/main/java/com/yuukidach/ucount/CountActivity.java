package com.yuukidach.ucount;

import android.content.Intent;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.next.easynavigation.view.EasyNavigationBar;

import java.util.ArrayList;
import java.util.List;

public class CountActivity extends BaseActivity{

    private EasyNavigationBar navigationBar;
    private TextView mtextview;
    private Fragment fragment;


    private boolean flag=true;
    private View cancelImageView;
    private Handler mHandler = new Handler();


    private String[] tabText = {"汇总", "支出", "收入"};
    //未选中icon
    private int[] normalIcon = {R.mipmap.huizong1, R.mipmap.zhichu, R.mipmap.shouru};
    //选中时icon
    private int[] selectIcon = {R.mipmap.huizong, R.mipmap.zhichu1, R.mipmap.shouru1};

    List<Fragment> fragments = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);
        navigationBar = findViewById(R.id.navigationBar);

        fragments.add(new FirstFragment());
        fragments.add(new SecondFragment());
        fragments.add(new ThirdFragment());


        navigationBar.titleItems(tabText)
                .normalIconItems(normalIcon)
                .selectIconItems(selectIcon)
                .fragmentList(fragments)
                .addLayoutRule(EasyNavigationBar.RULE_BOTTOM)
                .addLayoutHeight(100)
                .addLayoutBottom(0)
                .addAlignBottom(true)
                .addAsFragment(true)
                .fragmentManager(getSupportFragmentManager())
                .build();
    }

    @Override
    public void next(View view) {

    }

    @Override
    public void pre(View view) {
        Intent intent=new Intent(CountActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
