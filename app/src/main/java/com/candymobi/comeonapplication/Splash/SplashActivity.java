package com.candymobi.comeonapplication.Splash;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

import com.candymobi.comeonapplication.MainActivity;
import com.candymobi.comeonapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashActivity extends AppCompatActivity {
    @BindView(R.id.splash_video_player)
    FullScreenWindow mSplashVideoPlayer;
    @BindView(R.id.splash_skip)
    TextView splashSkip;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_main);
        ButterKnife.bind(this);
        mSplashVideoPlayer.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.splash);
        mSplashVideoPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
            }
        });
        mSplashVideoPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.start();
            }
        });
        splashSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        CountDownTimerTask countDownTimerTask=new CountDownTimerTask(5, new CountDownTimerTask.ICountDownHandler() {
            @Override
            public void onTicker(int time) {

            }

            @Override
            public void finish() {

            }
        });
    }

}
