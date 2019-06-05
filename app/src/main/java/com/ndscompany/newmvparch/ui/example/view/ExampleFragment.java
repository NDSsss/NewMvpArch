package com.ndscompany.newmvparch.ui.example.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.ndscompany.newmvparch.R;
import com.ndscompany.newmvparch.base.BaseFragment;
import com.ndscompany.newmvparch.ui.example.IExampleContract;
import com.ndscompany.newmvparch.ui.example.presenter.ExamplePresenter;

import butterknife.BindView;
import butterknife.OnClick;

public class ExampleFragment extends BaseFragment<IExampleContract.Presenter> implements IExampleContract.View {

    @BindView(R.id.tv_fragment_example)
    TextView tvExample;

    @Override
    protected IExampleContract.Presenter getNewPresenter() {
        return new ExamplePresenter();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @OnClick(R.id.btn_fragment_example)
    public void onBtnClick(View view){
        getPresenter().buttonClicked();
    }

    @Override
    public void initView(int stringId) {
        tvExample.setText(stringId);
    }

    @Override
    protected int getLayout() {
        return R.layout.framgent_example;
    }
}
