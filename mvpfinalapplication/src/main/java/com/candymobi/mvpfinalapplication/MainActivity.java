package com.candymobi.mvpfinalapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.candymobi.mvpfinalapplication.model.IpInfoTask;
import com.candymobi.mvpfinalapplication.presenter.IpInfoFragment;
import com.candymobi.mvpfinalapplication.presenter.IpInfoPresenter;

public class MainActivity extends AppCompatActivity {
    IpInfoPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IpInfoFragment ipInfoFragment = (IpInfoFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);
        if (ipInfoFragment == null) {
            ipInfoFragment = IpInfoFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), ipInfoFragment, R.id.contentFrame);
        }
        IpInfoTask ipInfoTask = IpInfoTask.getInstance();
        mPresenter = new IpInfoPresenter(ipInfoFragment, ipInfoTask);
        ipInfoFragment.setPresenter(mPresenter);
    }
}
