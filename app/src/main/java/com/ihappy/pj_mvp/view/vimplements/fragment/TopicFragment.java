package com.ihappy.pj_mvp.view.vimplements.fragment;

import android.app.Fragment;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ihappy.pj_mvp.R;
import com.ihappy.pj_mvp.adapter.TopicAdapter;
import com.ihappy.pj_mvp.bean.Topic;
import com.ihappy.pj_mvp.presenter.pimplements.TopicPresenter;
import com.ihappy.pj_mvp.util.ToastUtil;
import com.ihappy.pj_mvp.view.vinterface.ITopicView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by liuhuan-mac on 16/2/1.
 */
public class TopicFragment extends Fragment implements ITopicView{
    @Bind(R.id.rl_topic)
    RecyclerView mTopicView;

    private TopicPresenter topicPresenter;
    private RecyclerView.LayoutManager layoutManager;
    private TopicAdapter mAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        topicPresenter = new TopicPresenter(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_topic,container,false);
        ButterKnife.bind(this, view);
        init();
        return view;
    }

    public void init(){
        layoutManager = new LinearLayoutManager(getActivity());
        mTopicView.setLayoutManager(layoutManager);
        mTopicView.setHasFixedSize(true);
        mTopicView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                if(parent.getChildLayoutPosition(view) == 0){
                    outRect.top = 20;
                }
                outRect.bottom = 10;
            }
        });
        topicPresenter.loadAllTopics();
    }

    @Override
    public void showLoading() {
        ToastUtil.showInCenter(R.string.is_loading);
    }

    @Override
    public void addTopics(List<Topic> topicList) {
        mAdapter = new TopicAdapter(getActivity(),topicList);
        mTopicView.setAdapter(mAdapter);
    }

    @Override
    public void hideLoading() {
        ToastUtil.showInCenter(R.string.finish_loading);
    }

    @Override
    public void showError(int errorInfoId) {
        ToastUtil.showInCenter(errorInfoId);
    }
}
