package com.candymobi.comeonapplication.mvp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.candymobi.comeonapplication.Splash.ILifeCycle;
import com.candymobi.comeonapplication.Splash.IMvpView;

import java.util.HashSet;
import java.util.Set;

public  class MvpControler implements ILifeCycle {
    //存放的P层的实力 activty 可以对应多个实例
    Set<ILifeCycle> iLifeCycles=new HashSet<>();
    @Override
    public void onCreate(Bundle saveInstanceState, Intent intent, Bundle getArguments) {

    }

    @Override
    public void onActivityCreated(Bundle saveInstanceState, Intent intent, Bundle getArguments) {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void onDetachActivity() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onDestroyView() {

    }

    @Override
    public void OnViewDestroy() {

    }

    @Override
    public void onNewIntent(Intent intent) {

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

    }

    @Override
    public void OnSaveInstaceState(Bundle bundle) {

    }

    @Override
    public void onAttachView(IMvpView iMvpView) {

    }
}
