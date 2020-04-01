package com.example.pro_arrayadapter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.annotation.Nullable;

public class ArrayAdapterActivity extends Activity {
    private Context mContext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t_arrayadpter);
        //初始化上下文
        mContext = ArrayAdapterActivity.this;
        //获取ListView
        ListView listView = findViewById(R.id.lv1);
        //创建数据list
        ArrayList<String> list = new ArrayList<String>();
        //添加数据
        for(int i=0;i<20;i++){
            list.add("arrayAdpterView"+i);
        }
        //获取ArrayAdapter
        //参数1：上下文；参数2：ItemView布局；参数3：每一项绑定到TextView，对应TextView组件Id；参数4：数据；
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                mContext,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                list);
        //设置Adapter
        listView.setAdapter(arrayAdapter);
    }
}
