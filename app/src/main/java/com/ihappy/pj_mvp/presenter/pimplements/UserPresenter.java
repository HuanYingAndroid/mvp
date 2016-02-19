package com.ihappy.pj_mvp.presenter.pimplements;

import com.ihappy.pj_mvp.bean.User;
import com.ihappy.pj_mvp.model.minterface.IUserModel;
import com.ihappy.pj_mvp.model.mimplements.UserModel;
import com.ihappy.pj_mvp.presenter.pinterface.IUserPresenter;
import com.ihappy.pj_mvp.view.vinterface.IUserView;

/**
 * Created by liuhuan-mac on 16/1/29.
 */
public class UserPresenter implements IUserPresenter{
    private IUserModel userModel;
    private IUserView userView;

    public UserPresenter(IUserView userView){
        this.userView = userView;
        userModel = new UserModel();
    }

    @Override
    public void saveUser(int id,String name,String description){
        userModel.saveUser(new User(id,name,description));
    }

    @Override
    public void loadUser(int id){
        User user = userModel.loadUser(id);
        userView.setName(user.getName());
        userView.setDescription(user.getDescription());
    }
}
