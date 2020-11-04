package com.example.deliveryboy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {
    private Button welcomeDeliveryBoyButton;
    private Button welcomeSenderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        welcomeDeliveryBoyButton =(Button) findViewById(R.id.welcome_DeliveryBoy_btn);
        welcomeSenderButton =(Button)findViewById(R.id.welcome_Sender_btn);

        welcomeDeliveryBoyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginRegisterSender=new Intent(WelcomeActivity.this,DeliveBoy_Login_RegisterActivity.class);
                startActivity(loginRegisterSender);
            }
        });

        welcomeSenderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginRegisterDeliveryBoy=new Intent(WelcomeActivity.this,Sender_Login_RegisterActivity.class);
                startActivity(loginRegisterDeliveryBoy);
            }
        });
    }
}