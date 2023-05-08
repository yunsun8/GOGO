package com.example.gogo.ui.List;

import android.graphics.drawable.Drawable;

public class CustomWord {

    private String mS1;

    private String mS2;

    private int photo;

    public String getS1(){
        return mS1;
    }

    public String getS2(){
        return mS2;
    }
    public int getPhoto() {
        return photo;
    }
    public CustomWord(String s1, String s2, int photo){
        this.mS1 = s1;
        this.mS2 = s2;
        this.photo = photo;
    }

}