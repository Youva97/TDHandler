package com.example.tdhandler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private Handler handler;
    protected ProgressBar pgBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pgBar = findViewById(R.id.progressBarFoo);

        handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent monIntent = new Intent(getApplicationContext(),Activity2.class);
                startActivity(monIntent);
            }
        }, 5000);
    }
}