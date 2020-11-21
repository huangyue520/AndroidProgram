package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThreadTestActivity extends AppCompatActivity {
    private Button bt;
private TextView tv;
private Handler handler=new Handler();
public void handleMessage(Message msg){
    if(msg.what>=0){
        tv.setText(msg.what);
    }
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread_test);
        bt=findViewById(R.id.thread_bt);
        tv=findViewById(R.id.thread_tv);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        int count=0;
                        while (count<10){
                            Message message=new Message();
                            message.what=count;
                            handler.sendMessage(message);
                            count+=1;
//                            try {
//                                Thread.sleep(1000);
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
                        }

                    }
                }).start();

            }
        });
    }
}