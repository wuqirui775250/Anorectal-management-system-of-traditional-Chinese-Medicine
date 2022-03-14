package com.example.demo.bean;


public class Bscjinformation1 {

  private long id1;
  private long bscjid;
  private String title;


  public long getId1() {
    return id1;
  }

  public void setId1(long id1) {
    this.id1 = id1;
  }


  public long getBscjid() {
    return bscjid;
  }

  public void setBscjid(long bscjid) {
    this.bscjid = bscjid;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "Bscjinformation1{" +
            "id1=" + id1 +
            ", bscjid=" + bscjid +
            ", title='" + title + '\'' +
            '}';
  }
}
