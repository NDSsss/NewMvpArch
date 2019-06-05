package com.ndscompany.newmvparch.base;

import android.app.Application;

import com.ndscompany.newmvparch.di.components.ApplicationComponent;
import com.ndscompany.newmvparch.di.components.DaggerApplicationComponent;

public class App extends Application {
    private static App mInstance;
    private ApplicationComponent mApplicationComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static App getInstance() {
        return mInstance;
    }

    public ApplicationComponent getApplicationComponent(){
        if(mApplicationComponent == null){
            mApplicationComponent = DaggerApplicationComponent.builder().build();
        }
        return mApplicationComponent;
    }
}
