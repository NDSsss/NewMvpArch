package com.ndscompany.newmvparch.di.components;

import com.ndscompany.newmvparch.managers.DataManager;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component
public interface ApplicationComponent {
    DataManager datamanager();
}
