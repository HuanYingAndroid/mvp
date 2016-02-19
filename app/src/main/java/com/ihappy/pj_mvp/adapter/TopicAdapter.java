package com.ihappy.pj_mvp.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ihappy.pj_mvp.R;
import com.ihappy.pj_mvp.bean.Topic;
import com.ihappy.pj_mvp.util.customview.GlideCircleTransform;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by liuhuan-mac on 16/2/1.
 */
public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.ViewHolder> {
    private Context context;
    private List<Topic> topicList;

    public TopicAdapter(Context context,List<Topic> topicList){
        this.context = context;
        this.topicList = topicList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_fragment_topic, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Topic topic = topicList.get(position);
        if(topic.getAuthor().getAvatar() != null){
            Glide.with(context).load(topic.getAuthor().getAvatar()).transform(new GlideCircleTransform(context)).into(holder.authorAvatar);
        }else {
            holder.authorAvatar.setImageResource(R.drawable.menu_user_avatar);
        }
        holder.authorName.setText(topic.getAuthor().getNickname());
        holder.topicTitle.setText(topic.getTitle());
    }

    @Override
    public int getItemCount() {
        return topicList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.sv_topic_author_avatar)
        ImageView authorAvatar;

        @Bind(R.id.tv_topic_author_name)
        TextView authorName;

        @Bind(R.id.tv_topic_title)
        TextView topicTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}

