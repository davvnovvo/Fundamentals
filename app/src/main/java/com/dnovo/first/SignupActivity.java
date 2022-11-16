package com.dnovo.first;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.example.fundamentals.R;

public class SignupActivity extends AppCompatActivity {

    EditText edituser, editpassword, editpassword2, editemail;
    Button cancel;
    ImageView mFondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        cancel = findViewById(R.id.cancel);
        edituser = findViewById(R.id.edituser);
        editpassword = findViewById(R.id.editpassword);
        editemail = findViewById(R.id.editemail);
        editpassword2 = findViewById(R.id.editpassword2);
        mFondo = findViewById(R.id.fondo);

        Glide.with(this)
                .load("https://img.freepik.com/fotos-premium/fondo-mexicano-copyspace_1101-1416.jpg?w=2000")
                .transition(DrawableTransitionOptions.withCrossFade(100))
                .centerCrop()
                .into(mFondo);

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