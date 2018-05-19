package com.example.ex3;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;

import android.support.design.widget.Snackbar;


public class MyHandler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);

        final Button createButton = findViewById(R.id.create);
        final Button startButton = findViewById(R.id.start);
        final Button cancelButton = findViewById(R.id.cancel);
        final TextView textView_handler = findViewById(R.id.textView);

        Looper mainLooper = Looper.getMainLooper();
        final android.os.Handler mainHandler = new android.os.Handler(mainLooper) {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                switch (msg.what) {
                    case (MyHandlerThread.WRITE_DONE):
                        textView_handler.setText("push_done!");
                        break;
                    case (MyHandlerThread.WRITE_NUMBER):
                        textView_handler.setText(msg.obj.toString());
                        break;
                    case (MyHandlerThread.WRITE_CANCEL):
                        textView_handler.setText("push_cancelled!");
                        break;
                }

            }
        };

        HandlerThread handlerThread = new HandlerThread("MyHandlerThread");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        final android.os.Handler handler = new android.os.Handler(looper);

        final MyHandlerThread[] thread = new MyHandlerThread[1];

        // Create Button
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (thread[0] == null) {
                    thread[0] = new MyHandlerThread(mainHandler);

                }
            }
        });

        // Start Button
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (thread[0] != null) {
                    handler.post(thread[0]);
                } else {

                    Snackbar.make(view, "startButton", 500).show();
                }
            }
        });

        // Cancel Button
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (thread[0] != null)
                {
                    thread[0].cancel();
                }
                else
                {
                    Snackbar.make(view, "cancelButton", 500).show();
                }

            }
        });

    }

}