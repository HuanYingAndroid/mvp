package com.ihappy.pj_mvp.rest;

import com.ihappy.pj_mvp.bean.Topic;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by liuhuan-mac on 16/2/1.
 */
public interface RestService {
    @GET("/topics")
    void getAllTopics(@Query("page") int page,@Query("size") int size,RestCallBack<List<Topic>> callBack);
}
