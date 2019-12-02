package com.instagram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LifeCycle2Activity extends AppCompatActivity {
    private static String TAG = LifeCycle2Activity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle2);
        Log.e(TAG,"OnCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"OnStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"OnRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"OnResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"OnDestroy");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"OnStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"OnPause");
    }
}
