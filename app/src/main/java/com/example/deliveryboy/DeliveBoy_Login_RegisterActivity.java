package com.example.deliveryboy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DeliveBoy_Login_RegisterActivity extends AppCompatActivity {

    private Button dbLoginButton ;
    private Button dbRegisterButton;
    private TextView dbRegisterLink;
    private TextView dbLoginStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delive_boy__login__register);

        dbLoginButton =findViewById(R.id.db_login_btn);
        dbRegisterButton =findViewById(R.id.db_register_btn);
        dbRegisterLink=findViewById(R.id.db_register_link);
        dbLoginStatus=findViewById(R.id.db_status);

        dbRegisterButton.setVisibility(View.INVISIBLE);
        dbLoginButton.setEnabled(false);

        dbRegisterLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbRegisterLink.setVisibility(View.INVISIBLE);
                dbLoginButton.setVisibility(View.INVISIBLE);
                dbLoginStatus.setText("Register As a Delivery Boy");

                dbRegisterButton.setVisibility(View.VISIBLE);
                dbRegisterButton.setEnabled(true);
            }
        });


    }
}