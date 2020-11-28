package com.example.wechat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotificationTestActivity extends AppCompatActivity {
private Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_test);
        bt=findViewById(R.id.ntf_bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(NotificationTestActivity.this,MainActivity.class);
                PendingIntent pendingIntent;
                pendingIntent = PendingIntent.getActivities(NotificationTestActivity.this, 0, new Intent[]{intent},0);
                Notification notification=new NotificationCompat.Builder(NotificationTestActivity.this)
                        .setContentTitle("这是标题")
                        .setContentText("这是内容")
                        .setWhen(System.currentTimeMillis())
                        .setSmallIcon(R.drawable.cherry_pic)
                        .setContentIntent(pendingIntent)
                        .setAutoCancel(true)
                        .build();
                NotificationManager manager= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                manager.notify(1,notification);
            }
        });
    }
}