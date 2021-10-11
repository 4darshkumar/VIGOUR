package com.example.vigour;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class Med extends AppCompatActivity {
    LottieAnimationView lottieAnimationView;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med);
        lottieAnimationView = findViewById(R.id.lottieAnimationView2);
        mediaPlayer = null;
    }
    public void music(View view){
        switch(view.getId()){
            case R.id.button:
                if (mediaPlayer == null){
                    mediaPlayer = MediaPlayer.create(this, R.raw.song);
                }
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        stopMusic();
                    }
                });
                mediaPlayer.start();
                break;
            case R.id.button2:
                if (mediaPlayer != null)
                    mediaPlayer.pause();
                break;
            case R.id.button3:
                if (mediaPlayer != null){
                    mediaPlayer.stop();
                    stopMusic();
                }
                break;
        }

    }
    private void stopMusic(){
        mediaPlayer.release();
        mediaPlayer = null;
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopMusic();
    }
}