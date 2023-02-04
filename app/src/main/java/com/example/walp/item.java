package com.example.walp;

public class item {
    private int id;
    private String imageUrl, tags ;
    private int likes;

    public item (String imageUrl, String tags,  int likes){
        this.id = id;

        this.imageUrl =imageUrl;
        this.tags =tags;
        this.likes = this.likes;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getOriginalUrl() {
        return imageUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getTags() {
        return tags;
    }

    public int getLikes() {
        return likes;
    }
}
