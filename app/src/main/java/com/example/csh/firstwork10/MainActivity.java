package com.example.csh.firstwork10;

import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("This is a dialog");
                dialog.setMessage("请单击登录对话框")
                .setPositiveButton("OK",null)
                        .show();
            }
        });
        Button button2 = (Button)findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog2 = new AlertDialog.Builder(MainActivity.this);
                LayoutInflater layout = getLayoutInflater();
                final View v1 = layout.inflate(R.layout.activity_second,null);
                dialog2.setView(v1)
                        .setTitle("登录对话框")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface,int i){
                                EditText denglu = (EditText)v1.findViewById(R.id.text1);
                                EditText password = (EditText)v1.findViewById(R.id.text2);
                                if(denglu.getText().toString().equals("abc") && password.getText().toString().equals("123"))
                                    Toast.makeText(MainActivity.this,"输入正确",Toast.LENGTH_SHORT).show();
                                else  Toast.makeText(MainActivity.this,"输入错误",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });
    }
}
