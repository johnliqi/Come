package com.candymobi.mvpfinalapplication.model;

public interface NetTask<T> {
    void  execute(T data,LoadTasksCallBack callBack);
}
