package com.ndscompany.newmvparch.managers;

import android.content.Context;

import com.ndscompany.newmvparch.R;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class DataManager {

    @Inject
    public DataManager() {

    }

    public int getResIs(){
        return R.string.some_long_text;
    }
}
