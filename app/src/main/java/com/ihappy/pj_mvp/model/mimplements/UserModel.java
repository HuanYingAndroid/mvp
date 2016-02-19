package com.ihappy.pj_mvp.model.mimplements;

import com.ihappy.pj_mvp.Constant;
import com.ihappy.pj_mvp.bean.User;
import com.ihappy.pj_mvp.model.minterface.IUserModel;
import com.orhanobut.hawk.Hawk;

/**
 * Created by liuhuan-mac on 16/1/29.
 */
public class UserModel implements IUserModel {
    @Override
    public void saveUser(User user) {
        if(user != null){
            Hawk.put(Constant.USER_INFO,user);
        }
    }

    @Override
    public User loadUser(int id) {
        User user = Hawk.get(Constant.USER_INFO);
        return user!= null && user.getId() == id ? user : null;
    }
}
