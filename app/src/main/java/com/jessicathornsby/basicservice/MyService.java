package com.jessicathornsby.basicservice;

/**
 * Created by jessicathornsby on 15/02/2017.
 */

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.HandlerThread;

public class MyService extends Service {

    @Override
    public void onCreate() {
        HandlerThread thread = new HandlerThread("MyHandlerThread");
        thread.start();

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        return START_STICKY;
    }


    @Override
    public void onDestroy() {


    }

    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }
}