package com.example.deliveryboy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sender_Login_RegisterActivity extends AppCompatActivity {

    private Button senderLoginButton ;
    private Button senderRegisterButton;
    private TextView senderRegisterLink;
    private TextView senderLoginStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender__login__register);


        senderLoginButton=findViewById(R.id.sender_login_btn);
        senderRegisterButton=findViewById(R.id.sender_register_btn);
        senderRegisterLink=findViewById(R.id.sender_register_link);
        senderLoginStatus=findViewById(R.id.sender_status);

        senderRegisterButton.setVisibility(View.INVISIBLE);
        senderRegisterButton.setEnabled(false);

        senderRegisterLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                senderRegisterLink.setVisibility(View.INVISIBLE);
                senderLoginButton.setVisibility(View.INVISIBLE);
                senderLoginStatus.setText("Register As a Sender ");
                senderRegisterButton.setVisibility(View.VISIBLE);
                senderRegisterButton.setEnabled(true);
            }
        });

    }
}