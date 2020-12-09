package com.candymobi.comeonapplication.Splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

public abstract class BaseMvpPresenter <T extends  IMvpView > extends  ILifeCycleMvpPresenter<T>{

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
}
