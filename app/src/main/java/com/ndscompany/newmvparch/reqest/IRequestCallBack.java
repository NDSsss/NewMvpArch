package com.ndscompany.newmvparch.reqest;

import com.ndscompany.newmvparch.eventbus.EventBusContainer;

public interface IRequestCallBack {
    void onStartRequest();
    void onFinishRequest();
    void onErrorRequest(String message);
    void onSuccess(EventBusContainer data);
}
