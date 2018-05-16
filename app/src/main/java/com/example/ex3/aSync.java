package com.example.ex3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class aSync extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_sync);

        final TextView textView = findViewById(R.id.textView);

        // Create Button
        final Button create_butt = findViewById(R.id.create);
        create_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

        });

        // Start Button
        final Button start_butt = findViewById(R.id.start);
        start_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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

