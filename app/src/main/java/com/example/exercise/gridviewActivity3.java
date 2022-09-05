package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gridviewActivity3 extends AppCompatActivity {
GridView grid1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview3);

        grid1 = findViewById(R.id.grid1);
        int[] images={R.drawable.zeta1, R.drawable.gaosi1, R.drawable.aguru1, R.drawable.yinhe1};
        String[] names = {"a", "b", "c", "d"};
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for(int i=0;i<images.length;i++)
        {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put("image",images[i]);
            item.put("name",names[i]);
            list.add(item);
        }
        //声明SimpleAdapter
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,list,R.layout.activity_la3,new String[]{"image","name"},new int[]{R.id.iv_img,R.id.tv_name});
        grid1.setAdapter(simpleAdapter);
        //事件处理
        grid1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(gridviewActivity3.this,i+"被点击",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(gridviewActivity3.this,infoActivity3.class);
                intent.putExtra("num",i);
                startActivity(intent);
            }
        });
    }
}