package com.candymobi.comeonapplication.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.candymobi.comeonapplication.Splash.IMvpView;
import com.candymobi.comeonapplication.mvp.MvpControler;

public class LifeCycleMvpActivity extends AppCompatActivity implements IMvpView {
    private MvpControler mvpcontroler;

    @Override
    public MvpControler getMvpControler() {
        if (this.mvpcontroler == null) {
           this. mvpcontroler = new MvpControler();
        }
        return mvpcontroler;
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
