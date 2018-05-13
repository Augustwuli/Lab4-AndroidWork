package com.wxh.cse.menu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        return true;
    }
    public boolean onContextItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.size:
                item.setChecked(true);
                break;

            case R.id.color:
                item.setChecked(true);
                break;
        }
        return super.onContextItemSelected(item);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        txt=findViewById(R.id.txt);
        switch (item.getItemId()) {
            case R.id.big:
                item.setChecked(true);
                txt.setTextSize(20);
                return true;
            case R.id.middle:
                item.setChecked(true);
                txt.setTextSize(16);
                return true;
            case R.id.small:
                item.setChecked(true);
                txt.setTextSize(10);
                return true;
            case R.id.red:
                item.setChecked(true);
                txt.setTextColor(Color.parseColor("#FF0000"));
                return true;
            case R.id.black:
                item.setChecked(true);
                txt.setTextColor(Color.parseColor("#000000"));
                return true;
            case R.id.menu:
                item.setChecked(true);
                Toast.makeText(this,"这是普通项", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
