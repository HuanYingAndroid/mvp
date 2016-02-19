package com.ihappy.pj_mvp.model.minterface;

import com.ihappy.pj_mvp.bean.User;

/**
 * Created by liuhuan-mac on 16/1/29.
 */
public interface IUserModel {
    void saveUser(User user);
    User loadUser(int id);
}
