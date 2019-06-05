package com.ndscompany.newmvparch.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.ndscompany.newmvparch.managers.DataManager;

public abstract class BasePresenter<T extends IBaseMvpView> implements IBaseMvpPresenter<T> {
    protected String TAG = getClass().getSimpleName();
    private T mMvpView;
    private DataManager mDatamanger;

    protected T getMvpView(){
        return mMvpView;
    }

    @Override
    public void setArgs(Object... params) {

    }

    @Override
    public void attachView(T view) {
        mMvpView = view;
    }

    @Override
    public void detachView() {
        mMvpView = null;
    }

    @Override
    public boolean isViewAttached() {
        return mMvpView != null;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

    }

    protected DataManager getDatamanager(){
        if(mDatamanger == null){
            mDatamanger = App.getInstance().getApplicationComponent().datamanager();
        }
        return mDatamanger;
    }

}
