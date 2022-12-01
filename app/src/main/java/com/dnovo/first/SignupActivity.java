package com.dnovo.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.example.fundamentals.R;

public class SignupActivity extends AppCompatActivity {

    EditText edituser, editpassword, editpassword2, editemail;
    Button cancel, login;
    ImageView mFondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        cancel = findViewById(R.id.cancel);
        login = findViewById(R.id.login);
        edituser = findViewById(R.id.edituser);
        editemail = findViewById(R.id.editemail);
        editpassword = findViewById(R.id.editpassword);
        editpassword2 = findViewById(R.id.editpassword2);
        mFondo = findViewById(R.id.fondo);

        Glide.with(this)
                .load("https://w0.peakpx.com/wallpaper/470/824/HD-wallpaper-yellow-ocean-aesthetic.jpg")
                .transition(DrawableTransitionOptions.withCrossFade(100))
                .centerCrop()
                .into(mFondo);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!edituser.getText().toString().equals("") && !editemail.getText().toString().equals("")
                        && !editpassword.getText().toString().equals("") && !editpassword2.getText().toString().equals("")) {
                    if (editpassword.getText().toString().equals(editpassword2.getText().toString())) {
                        Toast.makeText(SignupActivity.this, "CUENTA CREADA CON ÉXITO", Toast.LENGTH_LONG).show();
                        Intent i = new Intent(SignupActivity.this, LoginActivity.class);
                        startActivity(i);
                        limpiar();
                    } else {
                        Toast.makeText(SignupActivity.this, "LAS CONTRASEÑAS NO COINCIDEN", Toast.LENGTH_LONG).show();
                        editpassword.setTextColor(getColor(R.color.red));
                        editpassword2.setTextColor(getColor(R.color.red));
                    }
                } else {
                    Toast.makeText(SignupActivity.this, "DEBE COMPLETAR LOS CAMPOS OBLIGATORIOS", Toast.LENGTH_LONG).show();
                }

            }
        });

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

    private void limpiar() {
        edituser.setText("");
        editpassword.setText("");
    }

}