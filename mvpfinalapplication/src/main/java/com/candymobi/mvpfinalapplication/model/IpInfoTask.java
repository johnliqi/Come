package com.candymobi.mvpfinalapplication.model;

import cn.finalteam.okhttpfinal.BaseHttpRequestCallback;
import cn.finalteam.okhttpfinal.HttpRequest;
import cn.finalteam.okhttpfinal.RequestParams;

public class IpInfoTask implements NetTask<String> {
    private static IpInfoTask INSTANCE = null;
    private static final String HOST = "http://ip.taobao.com/service/getIpInfo.php";
    private LoadTasksCallBack loadTasksCallBack;

    @Override
    public void execute(final String ip, final LoadTasksCallBack callBack) {
    //    RequestParams requestParams = new RequestParams();
       // requestParams.addFormDataPart("ip", ip);
        HttpRequest.get(ip, new BaseHttpRequestCallback<IpData>() {
            @Override
            public void onStart() {
                super.onStart();
                callBack.onStart();
            }

            @Override
            protected void onSuccess(IpData ipInfo) {
                super.onSuccess(ipInfo);
                callBack.onSuccess(ipInfo);
            }

            @Override
            public void onFinish() {
                super.onFinish();
                callBack.onFinish();
            }

            @Override
            public void onFailure(int errorCode, String msg) {
                super.onFailure(errorCode, msg);
                callBack.onFailed();
            }
        });


    }

    public IpInfoTask() {

    }

    public static IpInfoTask getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new IpInfoTask();
        }
        return INSTANCE;
    }

}
