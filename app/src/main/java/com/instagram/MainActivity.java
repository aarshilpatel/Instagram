package com.instagram;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUserName, edtPassword;
    Button btnLogin,btnDemo;
    CheckBox chb;
    private static String TAG= MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);

        edtUserName = (EditText) findViewById(R.id.edt_username);
        edtPassword = (EditText) findViewById(R.id.edt_password);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnDemo = (Button) findViewById(R.id.btn_demo);

        chb = (CheckBox) findViewById(R.id.chb);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strUserName = edtUserName.getText().toString();

                Intent i = new Intent( MainActivity.this, HomeActivity.class);
                       i.putExtra("EMAIL_KEY", strUserName);
                startActivity(i);
                                     /*  if (chb.isChecked()){

                    Toast.makeText(MainActivity.this, "email id is "+strUserName, Toast.LENGTH_SHORT).show();
                    Log.e(TAG, "email id is"+strUserName);
                    Log.d(TAG, "email id is"+strUserName);
                    Log.w(TAG, "email id is"+strUserName);
                    Log.i(TAG, "email id is"+strUserName);
                    Log.v(TAG, "email id is"+strUserName);

                }
                else {
                    Toast.makeText(MainActivity.this, "No Data Found", Toast.LENGTH_SHORT).show();
                }*/

            }
        });


        btnDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
                startActivity(intent);
            }
        });

    }
}
