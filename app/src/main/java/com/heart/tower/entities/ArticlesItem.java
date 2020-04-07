package com.heart.tower.entities;

import android.text.Spanned;

public class ArticlesItem {

    private int image;
    private String title;
    private Spanned text;
    private Spanned text1;



    public ArticlesItem(int image, String title, Spanned text, Spanned text1) {
        this.image = image;
        this.title = title;
        this.text = text;
        this.text1 = text1;
    }


    public ArticlesItem(int image, String title, Spanned text) {
        this.image = image;
        this.title = title;
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public Spanned getText() {
        return text;
    }

    public Spanned getText1() {
        return text1;
    }
}
