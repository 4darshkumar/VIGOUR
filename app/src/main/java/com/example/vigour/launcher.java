package com.example.vigour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class launcher extends AppCompatActivity {
    private static  int SPLASH_SCREEN = 5000;

    Animation anim_top,anim_bottom;
    ImageView image;
    TextView logo, slogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_launcher);
        getSupportActionBar().hide();

        anim_top = AnimationUtils.loadAnimation(this,R.anim.anim_top);
        anim_bottom = AnimationUtils.loadAnimation(this,R.anim.anim_bottom);


        image = findViewById(R.id.imageView);
        logo = findViewById(R.id.logo);
        slogan = findViewById(R.id.slogan);

        image.setAnimation(anim_top);
        logo.setAnimation( anim_bottom );
        slogan.setAnimation( anim_bottom );

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent (launcher.this,Authantication.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);

    }
}