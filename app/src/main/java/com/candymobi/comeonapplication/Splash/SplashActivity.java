package com.candymobi.comeonapplication.Splash;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

import com.candymobi.comeonapplication.MainActivity;
import com.candymobi.comeonapplication.R;
import com.candymobi.comeonapplication.Viewject;

import butterknife.BindView;
import butterknife.ButterKnife;

@Viewject(mainlayoutId = R.layout.splash_main)
public class SplashActivity extends AppCompatActivity {
    @BindView(R.id.splash_video_player)
    FullScreenWindow mSplashVideoPlayer;
    @BindView(R.id.splash_skip)
    TextView splashSkip;
    private SplashTimerPresenter timerPresenter;

    // Liqi
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_main);
        initPresenter();
        initListener();
        initVideo();


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void initPresenter() {
        timerPresenter = new SplashTimerPresenter(this);
        timerPresenter.initTimer();
    }

    private void initVideo() {
        mSplashVideoPlayer.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.splash);
    }


    private void initListener() {
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
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        timerPresenter.onDestroy();
    }

    public void setTimer(String timer) {
        splashSkip.setText(timer + "秒");
    }
}
