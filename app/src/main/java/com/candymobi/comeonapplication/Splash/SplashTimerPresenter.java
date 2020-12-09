package com.candymobi.comeonapplication.Splash;

import android.app.Activity;

public class SplashTimerPresenter extends BaseMvpPresenter {
    SplashActivity mActivity;
    private CountDownTimerTask countDownTimerTask;

    SplashTimerPresenter(SplashActivity mactivity) {
        this.mActivity = mactivity;
    }

    public void initTimer() {
        countDownTimerTask = new CountDownTimerTask(5, new CountDownTimerTask.ICountDownHandler() {
            @Override
            public void onTicker(int time) {
                mActivity.setTimer(time + "秒");

            }

            @Override
            public void finish() {
                //   splashSkip.setText("跳过");
            }
        });
        countDownTimerTask.start();
    }



    @Override
    protected IMvpView getEmptyView() {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        countDownTimerTask.cancel();
    }
}
