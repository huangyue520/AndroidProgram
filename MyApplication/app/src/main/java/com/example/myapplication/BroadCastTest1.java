package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class BroadCastTest1 extends AppCompatActivity {
    private TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad_cast_test1);
        t1.findViewById(R.id.t1);
        MyReceiver myReceiver=new MyReceiver();
        IntentFilter intentFilter=new IntentFilter("com.example.myapplication.BroadCastActivity");
        registerReceiver(myReceiver,intentFilter);
    }
    class MyReceiver extends BroadcastReceiver{

        @Override
        public void onReceive(Context context, Intent intent) {
            t1.setText(intent.getStringExtra("name"));
        }
    }
}