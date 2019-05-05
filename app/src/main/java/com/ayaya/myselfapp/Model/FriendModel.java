package com.ayaya.myselfapp.Model;

public class FriendModel {
    private int mImageResource;
    private String namaGambar;

    public FriendModel(int ImageResource, String namagambar){
        mImageResource = ImageResource;
        namaGambar = namagambar;

    }

    public int getmImageResource(){
        return mImageResource;
    }

    public String getNamaGambar(){
        return namaGambar;
    }

}
