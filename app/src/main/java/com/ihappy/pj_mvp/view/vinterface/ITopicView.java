package com.ihappy.pj_mvp.view.vinterface;

import com.ihappy.pj_mvp.bean.Topic;

import java.util.List;

/**
 * Created by liuhuan-mac on 16/2/1.
 */
public interface ITopicView {
    void showLoading();
    void addTopics(List<Topic> topicList);
    void hideLoading();
    void showError(int errorInfoId);
}
