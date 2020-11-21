package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.nio.channels.AsynchronousChannelGroup;

public class AsncTestActivity extends AppCompatActivity {
private TextView tv;
private Button bt;
private ProgressBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asnc_test);
        tv=findViewById(R.id.asy_tv);
        bt=findViewById(R.id.asy_bt);
        pb=findViewById(R.id.asy_pb);

    }}
