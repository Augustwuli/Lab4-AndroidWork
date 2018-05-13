package com.wxh.cse.alertdialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button buttotn;
    private AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttotn=(Button) findViewById(R.id.btn);
        buttotn.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        showDialog(view);
    }

    private void showDialog(View view){
        builder=new AlertDialog.Builder(this);
        builder.setTitle("ANDROID APP");//设置标题
        builder.setView(R.layout.login);
        builder.setCancelable(true);
        AlertDialog dialog=builder.create();
        dialog.show();
    }
}
