package com.ndscompany.newmvparch.ui.example;

import com.ndscompany.newmvparch.base.IBaseMvpPresenter;
import com.ndscompany.newmvparch.base.IBaseMvpView;

public interface IExampleContract {
    interface View extends IBaseMvpView{
        void initView(int stringId);
    }

    interface Presenter extends IBaseMvpPresenter<View>{
        void buttonClicked();
    }
}
