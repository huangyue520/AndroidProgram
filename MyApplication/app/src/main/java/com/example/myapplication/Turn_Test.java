package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Turn_Test extends AppCompatActivity {
    private Button bt123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turn_test);
        bt123=(Button)findViewById(R.id.bt123) ;



        bt123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(Intent.ACTION_VIEW); //跳转网页
//                intent.setData(Uri.parse("http://www.4399.com/"));
                Intent intent=new Intent(Turn_Test.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

