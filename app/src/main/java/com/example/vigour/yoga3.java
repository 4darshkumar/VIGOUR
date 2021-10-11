package com.example.vigour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class yoga3 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String number = intent.getStringExtra("value");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        int intNumber = Integer.parseInt(number);
        Log.i("MESSAGE", number);
        switch (intNumber) {
            case 1:
                setContentView(R.layout.activity_boat);
                VideoView videoView1 = findViewById(R.id.videoView1);
                videoView1.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.boatpose);
                MediaController mediaController = new MediaController(this);
                mediaController.setAnchorView(videoView1);
                videoView1.setMediaController(mediaController);
                break;
            case 2:
                setContentView(R.layout.activity_chakrasana);
                VideoView videoView2 = findViewById(R.id.videoView2);
                videoView2.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.chakrasana);
                MediaController mediaController2 = new MediaController(this);
                mediaController2.setAnchorView(videoView2);
                videoView2.setMediaController(mediaController2);
                break;
            case 3:
                setContentView(R.layout.activity_teardrop_pose);
                VideoView videoView3 = findViewById(R.id.videoView3);
                videoView3.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.teardrop);
                MediaController mediaController3 = new MediaController(this);
                mediaController3.setAnchorView(videoView3);
                videoView3.setMediaController(mediaController3);
                break;
            case 4:
                setContentView(R.layout.activity_uthsana);
                VideoView videoView4 = findViewById(R.id.videoView4);
                videoView4.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.uthsana );
                MediaController mediaController4 = new MediaController(this);
                mediaController4.setAnchorView(videoView4);
                videoView4.setMediaController(mediaController4);
                break;
            case 5:
                setContentView(R.layout.activity_cowpose);
                VideoView videoView5 = findViewById(R.id.videoView5);
                videoView5.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.cowpose);
                MediaController mediaController5 = new MediaController(this);
                mediaController5.setAnchorView(videoView5);
                videoView5.setMediaController(mediaController5);
                break;
            case 6:
                setContentView(R.layout.activity_catpose);
                VideoView videoView6 = findViewById(R.id.videoView6);
                videoView6.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.catpose);
                MediaController mediaController6 = new MediaController(this);
                mediaController6.setAnchorView(videoView6);
                videoView6.setMediaController(mediaController6);
                break;
            case 7:
                setContentView(R.layout.activity_palmtree);
                VideoView videoView7 = findViewById(R.id.videoView7);
                videoView7.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.swayingpalmtree);
                MediaController mediaController7 = new MediaController(this);
                mediaController7.setAnchorView(videoView7);
                videoView7.setMediaController(mediaController7);
                break;
            case 8:
                setContentView(R.layout.activity_balasana);
                VideoView videoView8 = findViewById(R.id.videoView8);
                videoView8.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.balasana);
                MediaController mediaController8 = new MediaController(this);
                mediaController8.setAnchorView(videoView8);
                videoView8.setMediaController(mediaController8);
                break;
            case 9:
                setContentView(R.layout.activity_sukhasana);
                VideoView videoView9 = findViewById(R.id.videoView9);
                videoView9.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.sukhasana);
                MediaController mediaController9 = new MediaController(this);
                mediaController9.setAnchorView(videoView9);
                videoView9.setMediaController(mediaController9);
                break;
            case 10:
                setContentView(R.layout.activity_trikonasan);
                VideoView videoView10 = findViewById(R.id.videoView10);
                videoView10.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.trikonasan);
                MediaController mediaController10 = new MediaController(this);
                mediaController10.setAnchorView(videoView10);
                videoView10.setMediaController(mediaController10);
                break;
            case 11:
                setContentView(R.layout.activity_sabasana);
                VideoView videoView11 = findViewById(R.id.videoView11);
                videoView11.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.sabasana);
                MediaController mediaController11 = new MediaController(this);
                mediaController11.setAnchorView(videoView11);
                videoView11.setMediaController(mediaController11);
                break;
            case 12:
                setContentView(R.layout.activity_chaturanga);
                VideoView videoView12 = findViewById(R.id.videoView12);
                videoView12.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.chaturanga);
                MediaController mediaController12 = new MediaController(this);
                mediaController12.setAnchorView(videoView12);
                videoView12.setMediaController(mediaController12);
                break;
            case 13:
                setContentView(R.layout.activity_natarajasana);
                VideoView videoView13 = findViewById(R.id.videoView13);
                videoView13.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.natarajasana);
                MediaController mediaController13 = new MediaController(this);
                mediaController13.setAnchorView(videoView13);
                videoView13.setMediaController(mediaController13);
                break;

        }

    }
}