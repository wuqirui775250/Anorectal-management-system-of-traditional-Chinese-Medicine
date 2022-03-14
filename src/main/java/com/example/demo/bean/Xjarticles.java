package com.example.demo.bean;


public class Xjarticles {
    String articleid;
    String title;
    String article;
    String publishtime;
    String type;
    String actor;

    public Xjarticles(String articleid, String title, String article, String publishtime, String type, String actor) {
        this.articleid = articleid;
        this.title = title;
        this.article = article;
        this.publishtime = publishtime;
        this.type = type;
        this.actor = actor;
    }

    public Xjarticles() {
    }

    public String getArticleid() {
        return articleid;
    }

    public void setArticleid(String articleid) {
        this.articleid = articleid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(String publishtime) {
        this.publishtime = publishtime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Xjarticles{" +
                "articleid='" + articleid + '\'' +
                ", title='" + title + '\'' +
                ", article='" + article + '\'' +
                ", publishtime='" + publishtime + '\'' +
                ", type='" + type + '\'' +
                ", actor='" + actor + '\'' +
                '}';
    }
}
