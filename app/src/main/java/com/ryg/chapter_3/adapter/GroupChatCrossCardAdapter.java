package com.ryg.chapter_3.adapter;


import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.ryg.chapter_3.R;

import java.util.ArrayList;

public class GroupChatCrossCardAdapter extends RecyclerView.Adapter {

    private Context mContext;


    public GroupChatCrossCardAdapter(Context context) {
        this.mContext = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GroupChatCrossCardViewHolder(LayoutInflater.from(mContext).inflate(R.layout.pp_feed_group_chat_cross_item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        GroupChatCrossCardViewHolder groupChatCrossCardViewHolder = (GroupChatCrossCardViewHolder) holder;
            groupChatCrossCardViewHolder.mGroupChatName.setText("skhdsjhds");
            groupChatCrossCardViewHolder.mGroupChatCount.setText(String.valueOf("sjdhsjds"));
    }

    @Override
    public int getItemCount() {
        return 50;
    }


    protected class GroupChatCrossCardViewHolder extends RecyclerView.ViewHolder {
        private final TextView mGroupChatName;
        private final ImageView mGroupChatIcon;
        private final TextView mGroupChatCount;

        public GroupChatCrossCardViewHolder(final View itemView) {
            super(itemView);
            mGroupChatIcon = itemView.findViewById(R.id.pp_group_chat_icon);
            mGroupChatName = itemView.findViewById(R.id.pp_group_name);
            mGroupChatCount = itemView.findViewById(R.id.pp_group_count);
        }
    }

}
