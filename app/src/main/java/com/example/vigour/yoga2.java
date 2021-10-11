package com.example.vigour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class yoga2 extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        newArray = new int[] {
                R.id.boat_pose,R.id.chakrasana, R.id.Teardrop_pose, R.id.Uthanasana, R.id.cowpose
                ,R.id.catpose , R.id.palmtreepose,R.id.balasana,R.id.sukhasana,R.id.trikonasan,R.id.sabasana,
                R.id.chaturanga,R.id.natarajasana
        };
    }

    public  void ImageButtonClicked(View view){
        for (int i=0;i<newArray.length;i++)
        {
            if (view.getId()==newArray[i])
            {
                int value = i + 1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent = new Intent(yoga2.this, yoga3.class);
                intent.putExtra("value", String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}