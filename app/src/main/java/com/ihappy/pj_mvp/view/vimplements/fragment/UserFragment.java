package com.ihappy.pj_mvp.view.vimplements.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.ihappy.pj_mvp.R;
import com.ihappy.pj_mvp.presenter.pimplements.UserPresenter;
import com.ihappy.pj_mvp.view.vinterface.IUserView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by liuhuan-mac on 16/2/1.
 */
public class UserFragment extends Fragment implements IUserView {
    @Bind(R.id.et_id)
    EditText mIdText;

    @Bind(R.id.et_name)
    EditText mNameText;

    @Bind(R.id.et_description)
    EditText mDesText;

    private UserPresenter mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new UserPresenter(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user,container,false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.bt_save)
    public void save(){
        mPresenter.saveUser(Integer.valueOf(getId()), getName(), getDescription());
    }

    @OnClick(R.id.bt_load)
    public void load(){
        mPresenter.loadUser(Integer.valueOf(getId()));
    }

    @Override
    public String getUserId() {
        return mIdText.getText().toString();
    }

    @Override
    public String getName() {
        return mNameText.getText().toString();
    }

    @Override
    public String getDescription() {
        return mDesText.getText().toString();
    }

    @Override
    public void setName(String name) {
        mNameText.setText(name);
    }

    @Override
    public void setDescription(String description) {
        mDesText.setText(description);
    }
}
