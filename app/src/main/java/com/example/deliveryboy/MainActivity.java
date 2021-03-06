package com.example.deliveryboy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread=new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(2700);
                }
                catch (Exception e ){
                    e.printStackTrace();

                }
                finally {
                    Intent welcomeintent=new Intent(MainActivity.this,WelcomeActivity.class);
                    startActivity(welcomeintent);


                }
            }
        };
        thread.start();

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}