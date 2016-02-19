package com.ihappy.pj_mvp.presenter.pinterface;

/**
 * Created by liuhuan-mac on 16/2/1.
 */
public interface IUserPresenter {
    void saveUser(int id,String name,String description);
    void loadUser(int id);
}
