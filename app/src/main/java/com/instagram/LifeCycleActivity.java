package com.instagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LifeCycleActivity extends AppCompatActivity {

    Button btnsend;
    private static String TAG = LifeCycleActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.e(TAG,"OnCreate");
        btnsend = (Button)findViewById(R.id.btnsend);

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LifeCycleActivity.this,LifeCycle2Activity.class);
                startActivity(i);
            }
        });
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
