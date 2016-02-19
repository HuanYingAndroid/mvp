package com.ihappy.pj_mvp.model.minterface;

import com.ihappy.pj_mvp.model.mimplements.TopicModel;

/**
 * Created by liuhuan-mac on 16/2/1.
 */
public interface ITopicModel {
    void loadAllTopics(TopicModel.onLoadTopicListener listener);
    void loadSubTopics(int parentTopicId);
}
