package com.ihappy.pj_mvp.rest;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by liuhuan-mac on 16/2/1.
 */
public abstract class RestCallBack<T> implements Callback<T> {
    protected boolean isCanceled = false;

    public void cancel(){
        isCanceled = true;
    }
    @Override
    public void success(T t, Response response) {

    }

    @Override
    public void failure(RetrofitError error) {

    }
}
