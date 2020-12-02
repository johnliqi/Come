package com.candymobi.comeonapplication.Splash;

import android.os.Handler;
import android.os.Message;

import java.util.Timer;


public class CountDownTimerTask implements Runnable {
    // 1。 观察者模式
    //    功能时时回调 倒计时到几秒
    //   2.
    //   支持传入 总时间
// 3. //没过一秒秒数 -1 回调到Activity ；
    //     4. // 总时间倒计时为0时 要回调 完成的状态；
    public int CountTime;
    public int time;
    ICountDownHandler countDownHandler;
    Handler handler;
    public boolean isRun;

    @Override
    public void run() {
        if (isRun) {
            if (countDownHandler != null) {
                countDownHandler.onTicker(CountTime);
            }
            if (CountTime == 0) {
                if (countDownHandler != null) {
                    countDownHandler.finish();
                }
            } else {
                CountTime = time--;
                handler.postDelayed(this, 1000);
            }
        }
    }
// 开启 倒计时
    public void start() {
        isRun = true;
        handler.post(this);
    }
    // 取消倒计时
    public  void cancel(){
        isRun=false;
        handler.removeCallbacks(this);
    }

    public interface ICountDownHandler {
        void onTicker(int time);

        void finish();
    }


    public CountDownTimerTask(int time, ICountDownHandler countDownHandler) {
        handler = new Handler();
        this.time = time;
        this.countDownHandler = countDownHandler;
    }


}
