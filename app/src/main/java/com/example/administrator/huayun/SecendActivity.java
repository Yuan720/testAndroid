package com.example.administrator.huayun;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class SecendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secend);
        String[] data={"李小亮","鄢画云","ours","菜菜","小仙女","临床","z114","李小亮","鄢画云","ours","菜菜","小仙女","临床","z114"};
      //  ArrayAdapter<String> md=new ArrayAdapter<String>(SecendActivity.this,R.layout.support_simple_spinner_dropdown_item,data);
        MySimpleAdaptar ms=new MySimpleAdaptar(SecendActivity.this,R.layout.list_viewdlayout,data);
        ListView lv=(ListView)findViewById(R.id.mylistview);
        lv.setAdapter(ms);

    }
}

class MySimpleAdaptar extends ArrayAdapter<String>{
    int Resorece;
    public  MySimpleAdaptar(Context contex, int Resorece, String[] list){
        super(contex,Resorece,list);
        this.Resorece=Resorece;


    }

    private static final String TAG = "MySimpleAdaptar";

     @Override
     public View getView(int position,  View convertView,  ViewGroup parent) {

         // String text=getItem(position);
         View view= LayoutInflater.from(getContext()).inflate(Resorece,parent,false);
         TextView Tv=(TextView)view.findViewById(R.id.gfd);
         ImageView Iv=(ImageView)view.findViewById(R.id.huayun);
         String s=getItem(position);
        Tv.setText(s);
         Log.d(TAG, "getView: 设置文本");

         return view;
     }
 }
