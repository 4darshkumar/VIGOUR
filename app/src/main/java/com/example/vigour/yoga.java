package com.example.vigour;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class yoga extends AppCompatActivity {

    Button yogabtn;

    LottieAnimationView lottieAnimationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);

        lottieAnimationView = findViewById(R.id.lottieAnimationView2);

        yogabtn = findViewById(R.id.yogabtn);

        yogabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yoga.this,yoga2.class);
                startActivity(intent);

            }
        });





    }
}
