package com.candymobi.comeonapplication.Splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

public interface ILifeCycle {
    void onCreate(Bundle saveInstanceState, Intent intent, Bundle getArguments);

    void onActivityCreated(Bundle saveInstanceState, Intent intent, Bundle getArguments);

    void onResume();

    void onDestroy();

    void onPause();

    void stop();

    void onDetachActivity();

    void onStart();

    void onDestroyView();

    void OnViewDestroy();

    void onNewIntent(Intent intent);

    void onActivityResult(int requestCode, int resultCode, @Nullable Intent data);

    void OnSaveInstaceState(Bundle bundle);

    void onAttachView(IMvpView iMvpView);
}
