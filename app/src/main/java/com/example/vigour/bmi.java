package com.example.vigour;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class bmi extends AppCompatActivity {

    private EditText height;
    private EditText weight;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        result = (TextView) findViewById(R.id.result);
    }

    public void calculateBMI(View v) {
        String heightStr = height.getText().toString();
        String weightStr = weight.getText().toString();

        if (heightStr != null && !"".equals(heightStr)
                && weightStr !=null && !"".equals(weightStr)) {
            float heightValue = Float.parseFloat(heightStr)/ 100;
            float weightvalue = Float.parseFloat(weightStr);

            float bmi = weightvalue / (heightValue * heightValue);

            displayBMI(bmi);
        }

    }

    private  void displayBMI(float bmi){
        String bmilabel = "";

        if (Float.compare(bmi, 15f) <= 0){
            bmilabel = "very_severly_underweight";
        } else if (Float.compare(bmi, 15f) > 0 && Float.compare(bmi, 16f) <= 0){
            bmilabel = "severly_underweight";
        } else if (Float.compare(bmi, 16f) > 0 && Float.compare(bmi, 18.5f) <= 0){
            bmilabel = "underweight";
        } else if (Float.compare(bmi, 18.5f) > 0 && Float.compare(bmi, 25f) <= 0){
            bmilabel = "normal";
        } else if (Float.compare(bmi, 25f) > 0 && Float.compare(bmi, 30f) <= 0){
            bmilabel = "overweight";
        } else if (Float.compare(bmi, 30f) > 0 && Float.compare(bmi, 35f) <= 0){
            bmilabel = "obese_class_1";
        } else if (Float.compare(bmi, 35f) > 0 && Float.compare(bmi, 40f) <= 0){
            bmilabel = "obese_class_2";
        } else {
            bmilabel = "obese_class_3";
        }
        bmilabel = bmi + "\n\n" + bmilabel;
        result.setText(bmilabel);
    }
}