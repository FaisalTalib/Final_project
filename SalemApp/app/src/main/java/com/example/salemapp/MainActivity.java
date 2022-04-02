package com.example.salemapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void TrackingLocation(View view) {
        Intent intent = new Intent(MainActivity.this, Tracking_location.class);
                startActivity(intent);
    }

    public void Welcoming_User(View view) {
    }

    public void HeartRate(View view) {
        Intent intent = new Intent(MainActivity.this, Heart_rate.class);
        startActivity(intent);
    }

    public void Notifactions(View view) {
        Intent intent = new Intent(MainActivity.this, Notifactions.class);
        startActivity(intent);
    }

    public void Alarm(View view) {
        Intent intent = new Intent(MainActivity.this, Settings.class);
        startActivity(intent);
    }
}