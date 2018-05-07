package com.thaihuy.recyclerview;

/**
 * Created by ThaiHuyPC on 5/7/2018.
 */

public class Food {
    private String mName;
    private int mImg;

    public Food(String mName, int mImg) {
        this.mName = mName;
        this.mImg = mImg;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmImg() {
        return mImg;
    }

    public void setmImg(int mImg) {
        this.mImg = mImg;
    }
}
