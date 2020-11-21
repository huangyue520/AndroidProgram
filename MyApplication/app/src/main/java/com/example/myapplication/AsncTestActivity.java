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
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DownloadTask().execute();
            }
        });
    }

    class DownloadTask extends AsyncTask<Void,Integer,Boolean> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();


        @Override
        protected Boolean doInBackground(Void... voids) {
            int count=0;
            while(count<100){
                count+=10;
                publishProgress(count);
            }
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            tv.setText("下载进度："+values[0]+"%");
            pb.setProgress(values[0]);
        }
        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);
        }

    }
}