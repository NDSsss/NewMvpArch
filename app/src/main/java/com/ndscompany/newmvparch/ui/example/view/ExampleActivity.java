package com.ndscompany.newmvparch.ui.example.view;

import com.ndscompany.newmvparch.base.BaseActivity;
import com.ndscompany.newmvparch.base.BaseFragment;

public class ExampleActivity extends BaseActivity {
    @Override
    protected BaseFragment getFragment() {
        return new ExampleFragment();
    }
}
