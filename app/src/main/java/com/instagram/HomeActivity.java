package com.instagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
TextView tvEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvEmail = (TextView) findViewById(R.id.tvEmail);

        Intent i = getIntent();
        String strEmail = i.getStringExtra("EMAIL_KEY");
        tvEmail.setText("Welcome "+strEmail);
    }
}
