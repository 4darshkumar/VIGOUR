package com.example.vigour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button calbmi;
    Button diet;
    Button rem;
    Button yoga;
    Button nearby;
    Button support;
    Button pedo;
    Button cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        diet = findViewById(R.id.dietplanbtn);

        diet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, diet_plan.class);
                startActivity(intent);
            }
        });

        calbmi = findViewById(R.id.btnbmical);


        calbmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, bmi.class);
                startActivity(intent);
            }
        });

        rem = findViewById(R.id.rembtn);

        rem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, notify.class);
                startActivity(intent);
            }
        });

        yoga = findViewById(R.id.btnyoga);

        yoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, yoga.class);
                startActivity(intent);
            }
        });

        nearby = findViewById(R.id.gymbtn);

        nearby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, nearby.class);
                startActivity(intent);
            }
        });

        support = findViewById(R.id.supportbtn);

        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, support.class);
                startActivity(intent);
            }
        });

        pedo = findViewById(R.id.stepbtn);

        pedo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, padometer.class);
                startActivity(intent);
            }
        });

        cal = findViewById(R.id.ccbtn);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Med.class);
                startActivity(intent);
            }
        });

    }
}