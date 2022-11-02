package com.example.fundamentals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    Button cancel;
    EditText edituser,editpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        cancel=findViewById(R.id.cancel);
        edituser=findViewById(R.id.edituser);
        editpassword=findViewById(R.id.editpassword);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
}