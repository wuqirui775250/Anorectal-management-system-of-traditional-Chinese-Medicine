package com.example.demo.bean;


public class Xjarticle {

  private int articleid;
  private int typeid;
  private String actor;
  private String title;
  private String article;
  private String publishtime;

  public Xjarticle() {
  }

  public Xjarticle(int articleid, int typeid, String actor, String title, String article, String publishtime) {
    this.articleid = articleid;
    this.typeid = typeid;
    this.actor = actor;
    this.title = title;
    this.article = article;
    this.publishtime = publishtime;
  }

  public int getArticleid() {
    return articleid;
  }

  public void setArticleid(int articleid) {
    this.articleid = articleid;
  }

  public int getTypeid() {
    return typeid;
  }

  public void setTypeid(int typeid) {
    this.typeid = typeid;
  }

  public String getActor() {
    return actor;
  }

  public void setActor(String actor) {
    this.actor = actor;
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

  @Override
  public String toString() {
    return "Xjarticle{" +
            "articleid=" + articleid +
            ", typeid=" + typeid +
            ", actor='" + actor + '\'' +
            ", title='" + title + '\'' +
            ", article='" + article + '\'' +
            ", publishtime='" + publishtime + '\'' +
            '}';
  }
}
