package com.whitepanda;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView msg;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg = (TextView) findViewById(R.id.txt);
        btn = (Button) findViewById(R.id.logout);

        msg.setText("Logged In As : "+SharedPreferenceManager.getInstance(this).getUserName());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferenceManager.getInstance(MainActivity.this).setLoginStatus(false);
                startActivity(new Intent(MainActivity.this,Login.class));
                finish();
            }
        });

    }
}
