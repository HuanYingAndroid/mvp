package com.ihappy.pj_mvp.model.mimplements;

import com.ihappy.pj_mvp.R;
import com.ihappy.pj_mvp.bean.Topic;
import com.ihappy.pj_mvp.model.minterface.ITopicModel;
import com.ihappy.pj_mvp.rest.RestCallBack;
import com.ihappy.pj_mvp.rest.RestPool;

import java.util.List;

import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by liuhuan-mac on 16/2/1.
 */
public class TopicModel implements ITopicModel {
    @Override
    public void loadAllTopics(final onLoadTopicListener listener) {
        RestPool.init().getAllTopics(1, 10, new RestCallBack<List<Topic>>() {
            @Override
            public void success(List<Topic> topics, Response response) {
                super.success(topics, response);
                listener.success(topics);
            }

            @Override
            public void failure(RetrofitError error) {
                super.failure(error);
                listener.failure(R.string.topic_failure);
            }
        });
    }

    @Override
    public void loadSubTopics(int parentTopicId) {

    }

    public interface onLoadTopicListener{
        void success(List<Topic> topicList);
        void failure(int erroInfoId);
    }
}
