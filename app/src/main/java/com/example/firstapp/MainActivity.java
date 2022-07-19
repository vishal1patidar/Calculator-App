package com.example.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final Object TAG = "Activity2"  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Toast.makeText(this, "onCreate Activity2", Toast.LENGTH_SHORT).show();
        Log.e((String) TAG, "onCreate Activity2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart Activity2", Toast.LENGTH_SHORT).show();
        Log.d((String) TAG, "onStart Activity2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart Activity2", Toast.LENGTH_SHORT).show();
        Log.d((String) TAG, "onRestart Activity2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume Activity2", Toast.LENGTH_SHORT).show();
        Log.d((String) TAG, "onResume Activity2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause Activity2", Toast.LENGTH_SHORT).show();
        Log.d((String) TAG, "onPause Activity2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop Activity2", Toast.LENGTH_SHORT).show();
        Log.d((String) TAG, "onStop Activity2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy Activity2", Toast.LENGTH_SHORT).show();
        Log.d((String) TAG, "onDestroy Activity2");
    }
}