package com.candymobi.mvpfinalapplication.presenter;

import com.candymobi.mvpfinalapplication.model.IpData;
import com.candymobi.mvpfinalapplication.model.IpInfo;
import com.candymobi.mvpfinalapplication.model.LoadTasksCallBack;
import com.candymobi.mvpfinalapplication.model.NetTask;

public class IpInfoPresenter implements IpInfoContract.Presenter, LoadTasksCallBack<IpData> {
    private NetTask netTask;
    private IpInfoContract.View addTaskView;

    public IpInfoPresenter(IpInfoContract.View addTaskView, NetTask netTask) {
        this.netTask = netTask;
        this.addTaskView = addTaskView;
    }

    @Override
    public void getIpInfo(String IP) {
        netTask.execute(IP, this);
    }

    @Override
    public void onSuccess(IpData ipInfo) {
        if (addTaskView.isActive()) {
            addTaskView.setIpInfo(ipInfo);
        }
    }

    @Override
    public void onStart() {
        if (addTaskView.isActive()) {
            addTaskView.showLoading();
        }
    }

    @Override
    public void onFailed() {
        if (addTaskView.isActive()) {
            addTaskView.ShowError();
        }
    }

    @Override
    public void onFinish() {
        if (addTaskView.isActive()) {
            addTaskView.hideLoading();
        }
    }
}
