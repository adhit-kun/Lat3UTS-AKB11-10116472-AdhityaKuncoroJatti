package com.ayaya.myselfapp.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ayaya.myselfapp.Model.FriendModel;
import com.ayaya.myselfapp.R;

import java.util.ArrayList;

public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.FriendViewHolder> {
    private ArrayList<FriendModel> mFriendItem;

    public static class FriendViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView namaGambar;

        public FriendViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.friendImg);
            namaGambar = itemView.findViewById(R.id.friendTxt);
        }
    }

    public FriendAdapter(ArrayList<FriendModel> friendList){
        mFriendItem = friendList;
    }


    @NonNull
    @Override
    public FriendViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_friend,viewGroup,false);
        FriendViewHolder vholder = new FriendViewHolder(v);
        return vholder;
    }

    @Override
    public void onBindViewHolder(@NonNull FriendViewHolder friendViewHolder, int i) {
        FriendModel currentItem = mFriendItem.get(i);
        friendViewHolder.mImageView.setImageResource(currentItem.getmImageResource());
        friendViewHolder.namaGambar.setText(currentItem.getNamaGambar());
    }

    @Override
    public int getItemCount() {
        return mFriendItem.size();
    }

}
