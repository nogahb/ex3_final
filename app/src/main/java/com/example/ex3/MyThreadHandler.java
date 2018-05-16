package com.example.ex3;

import android.os.HandlerThread;
import android.os.SystemClock;
import android.widget.TextView;

public class MyThreadHandler extends HandlerThread {

    TextView textView;

    public MyThreadHandler(String name, TextView textView) {
        super(name);
        this.textView = textView;
    }

    @Override
    public void run() {
        Long time = SystemClock.elapsedRealtime();

        for (int i = 0; i < 10; i++) {

        }

        try {
            sleep(500);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
