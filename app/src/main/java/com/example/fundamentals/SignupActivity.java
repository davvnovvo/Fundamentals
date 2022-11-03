package com.example.fundamentals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    EditText edituser, editpassword, editpassword2, editemail;
    Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        cancel = findViewById(R.id.cancel);
        edituser = findViewById(R.id.edituser);
        editpassword = findViewById(R.id.editpassword);
        editemail = findViewById(R.id.editemail);
        editpassword2 = findViewById(R.id.editpassword2);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edituser.setText("");
                editpassword.setText("");
                editpassword2.setText("");
                editemail.setText("");

            }
        });

    }
}