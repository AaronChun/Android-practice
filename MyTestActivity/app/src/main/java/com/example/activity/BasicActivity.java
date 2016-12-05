package com.example.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.acc.control.ActivityControler;

/**
 * Basic Activity
 */
public class BasicActivity extends AppCompatActivity {

    private static final String TAG = "BasicActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, getClass().getSimpleName());
        ActivityControler.addActivity(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,getClass().getSimpleName()+":onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, getClass().getSimpleName() + ":onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, getClass().getSimpleName() + ":onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, getClass().getSimpleName() + ":onStop");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, getClass().getSimpleName());
        ActivityControler.removeActivity(this);
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, getClass().getSimpleName() + ":onRestart");
    }
}
