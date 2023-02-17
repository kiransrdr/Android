package com.example.dell.bondservices;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MyService myService;
    Boolean isbind = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, com.example.dell.bondservices.MyService.class);
        bindService(i,myconnection, Context.BIND_AUTO_CREATE);
    }

        public void getTime(View view)
        {
            String currentTime = myService.getCurrentTime();
            TextView myTV = (TextView) findViewById(R.id.textView);
            myTV.setText(currentTime.toString());
        }

        private ServiceConnection myconnection = new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName name, IBinder service) {
                MyService.myBinder binder =  (MyService.myBinder) service;
                MyService= binder.getService();
                isbind= true;
            }

            @Override
            public void onServiceDisconnected(ComponentName name) {
                isbind= false;
            }
        };
}
