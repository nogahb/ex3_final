package com.example.ex3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // MyHandler Button
        final Button handler_but = findViewById(R.id.handler_but);
        handler_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent handler_intent = new Intent(MainActivity.this, MyHandler.class);
                startActivity(handler_intent);
            }

        });

        // Async Button
        final Button a_sync_but = findViewById(R.id.a_sync_but);
        a_sync_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a_sync_intent = new Intent(MainActivity.this, aSync.class);
                startActivity(a_sync_intent);

            }
        });

    }
}
