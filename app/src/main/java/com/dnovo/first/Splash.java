package com.dnovo.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.example.fundamentals.R;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        openApp();

        ImageView thunder = findViewById(R.id.logosplash);

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.blink);
        thunder.startAnimation(myanim);

        ImageView mFondo = findViewById(R.id.backView);

        Glide.with(this)
                .load(R.drawable.fondo2)
                .transition(DrawableTransitionOptions.withCrossFade(100))
                .centerCrop()
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.teal_200)))
                .into(mFondo);
    }

    private void openApp() {

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash
                        .this, LoginActivity.class);
                startActivity(intent);
            }
        }, 5000);
    }
}