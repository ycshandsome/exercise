package com.example.exercise;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class MainActivity2 extends AppCompatActivity {
    ListView list2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        list2=findViewById(R.id.list2);
        int[] images={R.drawable.p8,R.drawable.p9,R.drawable.p10};
        String[] names={"微信","微博","QQ"};
        String[] descs={"a","b","c"};
        List<Map<String,Object>> listItem=new ArrayList<Map<String,Object>>();
        for(int i=0;i<images.length;i++)
        {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put("name",names[i]);
            item.put("image",images[i]);
            item.put("desc",descs[i]);
            listItem.add(item);
        }
        //SimpleAdapter的适配器
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,listItem,R.layout.activity_layout3,new String[]{"name,image,desc"},new int[]{R.id.tv_name,R.id.iv_img,R.id.tv_desc});
        list2.setAdapter(simpleAdapter);
    }
}