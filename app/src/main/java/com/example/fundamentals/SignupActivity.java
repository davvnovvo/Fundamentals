package com.example.fundamentals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    EditText edituser, editpassword, editemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        edituser = findViewById(R.id.edituser);
        editpassword = findViewById(R.id.editpassword);
        editemail = findViewById(R.id.editemail);

    }
}