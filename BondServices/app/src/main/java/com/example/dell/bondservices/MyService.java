package com.example.dell.bondservices;

import android.app.Service;
import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.os.Binder;
import android.os.IBinder;

import java.util.Date;
import java.util.Locale;

public class MyService extends Service {
    public MyService() {
    }
    private final IBinder mybinder = new myBinder();

    @Override
    public IBinder onBind(Intent intent) {
        return mybinder;
    }
    public  String getCurrentTime()
    {
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss", Locale.ROOT);
        return (df.format(new Date()));

    }

    public  class myBinder extends Binder {

        MyService getService(){

            return MyService.this;
        }
    }
}
