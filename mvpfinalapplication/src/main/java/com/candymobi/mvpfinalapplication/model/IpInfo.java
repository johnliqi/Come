package com.candymobi.mvpfinalapplication.model;

public class IpInfo {
    public int getCode() {
        return code;
    }

    public IpInfo setCode(int code) {
        this.code = code;
        return this;
    }

    public IpData getIpData() {
        return ipData;
    }

    public IpInfo setIpData(IpData ipData) {
        this.ipData = ipData;
        return this;
    }

    private  int code;
    private  IpData ipData;
}
