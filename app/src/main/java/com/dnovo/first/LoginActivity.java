package com.dnovo.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.example.fundamentals.R;

public class LoginActivity extends AppCompatActivity {

    TextView signup;
    Button cancel, login;
    EditText edituser, editpassword;
    ImageView mFondo, bandera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signup = findViewById(R.id.signup);
        cancel = findViewById(R.id.cancel);
        login = findViewById(R.id.login);
        edituser = findViewById(R.id.edituser);
        editpassword = findViewById(R.id.editpassword);
        mFondo = findViewById(R.id.fondo);
        bandera = findViewById(R.id.bandera);

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.fadein);
        bandera.startAnimation(myanim);

        Animation rotation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        bandera.startAnimation(rotation);

        Glide.with(this)
                .load("https://img.freepik.com/fotos-premium/fondo-mexicano-copyspace_1101-1416.jpg?w=2000")
                .transition(DrawableTransitionOptions.withCrossFade(100))
                .centerCrop()
                .into(mFondo);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!edituser.getText().toString().equals("") && !editpassword.getText().toString().equals("")) {
                    Toast.makeText(LoginActivity.this, "INICIO DE SESIÓN CORRECTO", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(i);
                    limpiar();
                } else {
                    Toast.makeText(LoginActivity.this, "DEBE COMPLETAR LOS CAMPOS OBLIGATORIOS", Toast.LENGTH_LONG).show();
                }

            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(i);

                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limpiar();
            }
        });

    }

    private void limpiar() {
        edituser.setText("");
        editpassword.setText("");
    }

}