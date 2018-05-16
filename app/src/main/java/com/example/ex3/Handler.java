package com.example.ex3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Handler extends AppCompatActivity {

    ArrayList<MyThreadHandler> threads;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);

        final TextView textView = findViewById(R.id.textView);

        // Create Button
        final Button create_butt = findViewById(R.id.create);
        create_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                MyThreadHandler new_thread = new MyThreadHandler("cur_handler", textView);
//                threads.add(new_thread);
            }

        });

        // Start Button
        final Button start_butt = findViewById(R.id.start);
        start_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                threads.remove(0).run();
            }

        });

        // Cancel Button
        final Button cancel_butt = findViewById(R.id.cancel);
        cancel_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

        });

    }
}
