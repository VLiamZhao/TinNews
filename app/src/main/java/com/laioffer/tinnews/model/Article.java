package com.laioffer.tinnews.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Article implements Serializable {

    @Ignore
    public Source source;
    public String author;
    public String content;
    public String description;
    public String publishedAt;
    @NonNull
    @PrimaryKey
    public String title;
    public String url;
    public String urlToImage;
    public boolean favorite;
}
