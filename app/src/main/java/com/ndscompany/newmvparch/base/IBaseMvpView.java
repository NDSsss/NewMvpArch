package com.ndscompany.newmvparch.base;

public interface IBaseMvpView {
    void startLoading();
    void completeLoading();
    void errorLoadin(String error);
    void startProgressDialog();
    void completePorgressDialog();
    void errorLoadingDialog(String error);
    int getClassUniqueDeviceId();
}
