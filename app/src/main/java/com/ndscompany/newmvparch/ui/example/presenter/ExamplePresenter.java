package com.ndscompany.newmvparch.ui.example.presenter;

import com.ndscompany.newmvparch.base.BasePresenter;
import com.ndscompany.newmvparch.ui.example.IExampleContract;

public class ExamplePresenter extends BasePresenter<IExampleContract.View> implements IExampleContract.Presenter {
    @Override
    public void onCreate() {

    }

    @Override
    public void buttonClicked() {
        getMvpView().initView(getDatamanager().getResIs());
    }
}
