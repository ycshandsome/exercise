package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class infoActivity3 extends AppCompatActivity {
    int[] images={R.drawable.zeta,R.drawable.yinhe,R.drawable.aguru,R.drawable.gaosi};
    String[] names={"a","b","c"};
    ImageView iv_info;
    TextView tv_info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info3);

        iv_info=findViewById(R.id.iv_info);
        tv_info=findViewById(R.id.tv_info);

        //获得是第几项被单机
        Intent intent=getIntent();
        int i=intent.getIntExtra("num",0);

        iv_info.setImageResource(images[i]);
        tv_info.setText(names[i]);

    }
}