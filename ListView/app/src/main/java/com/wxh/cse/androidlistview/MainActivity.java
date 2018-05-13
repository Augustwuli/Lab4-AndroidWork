package com.wxh.cse.androidlistview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity  implements AdapterView.OnItemClickListener{
    private String[] text = { "Lion", "Monkey", "Dog", "Cat","Elephant"};
    private int[] img = { R.drawable.lion, R.drawable.monkey,R.drawable.dog,R.drawable.cat,R.drawable.elephant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lt = (ListView) findViewById(R.id.MyListView);
        SimpleAdapter adapter = new SimpleAdapter(this,getData(),R.layout.my_listitem,
                new String[]{"text","img"},
                new int[]{R.id.text,R.id.img});
        lt.setAdapter(adapter);
        lt.setOnItemClickListener(this);
    }
    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for(int i =0; i < text.length; i++) {
            Map<String,Object> item = new HashMap<String,Object>();
            item.put("text", text[i]);
            item.put("img", img[i]);
            list.add(item);
        }
        return list;
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        View v=parent.getChildAt(position);
        v.setBackgroundColor(Color.parseColor("#DC143C"));
        Toast.makeText(MainActivity.this,text[position], Toast.LENGTH_LONG).show();
    }

}
