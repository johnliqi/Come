package com.candymobi.mvpfinalapplication.presenter;

import com.candymobi.mvpfinalapplication.model.IpData;
import com.candymobi.mvpfinalapplication.model.IpInfo;

public interface IpInfoContract {
    interface Presenter {
        void getIpInfo(String IP);//获取数据
    }

    interface View extends BaseView<Presenter> {
        void setIpInfo(IpData ipData);

        void showLoading();

        void hideLoading();

        void ShowError();

        boolean isActive();
    }
}
