package com.yuukidach.ucount;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mob.MobSDK;
import com.mob.OperationCallback;

public class MineActivity extends BaseActivity {
    private TextView textView;
    private Button dbutton;
    private Button zbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mine);
        dbutton=findViewById(R.id.button4);
        zbutton=findViewById(R.id.button5);
        dbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MineActivity.this,loginActivity.class);
                startActivity(intent);
            }
        });
        boolean granted = true;
        MobSDK.submitPolicyGrantResult(granted, null);
    }

    @Override
    public void next(View view) {
        Intent intent=new Intent(MineActivity.this,MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void pre(View view) {

    }



}
