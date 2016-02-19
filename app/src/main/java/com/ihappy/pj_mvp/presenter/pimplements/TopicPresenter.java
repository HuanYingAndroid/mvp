package com.ihappy.pj_mvp.presenter.pimplements;

import com.ihappy.pj_mvp.bean.Topic;
import com.ihappy.pj_mvp.model.mimplements.TopicModel;
import com.ihappy.pj_mvp.model.minterface.ITopicModel;
import com.ihappy.pj_mvp.presenter.pinterface.ITopicPresenter;
import com.ihappy.pj_mvp.view.vinterface.ITopicView;

import java.util.List;

/**
 * Created by liuhuan-mac on 16/2/1.
 */
public class TopicPresenter implements ITopicPresenter{
    private ITopicView topicView;
    private ITopicModel topicModel;

    public TopicPresenter(ITopicView topicView){
        this.topicView = topicView;
        topicModel = new TopicModel();
    }

    @Override
    public void loadAllTopics() {
        topicView.showLoading();
        topicModel.loadAllTopics(new TopicModel.onLoadTopicListener() {
            @Override
            public void success(List<Topic> topicList) {
                topicView.hideLoading();
                topicView.addTopics(topicList);
            }

            @Override
            public void failure(int erroInfoId) {
                topicView.hideLoading();
                topicView.showError(erroInfoId);
            }
        });
    }

    @Override
    public void loadSubTopics() {

    }
}
