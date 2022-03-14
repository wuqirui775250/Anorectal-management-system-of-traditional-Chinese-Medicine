package com.example.demo.bean;

public class Bscjinformation2 {

  private long id2;
  private long id1;
  private String information;
  private String imageurl;


  public long getId2() {
    return id2;
  }

  public void setId2(long id2) {
    this.id2 = id2;
  }


  public long getId1() {
    return id1;
  }

  public void setId1(long id1) {
    this.id1 = id1;
  }


  public String getInformation() {
    return information;
  }

  public void setInformation(String information) {
    this.information = information;
  }


  public String getImageurl() {
    return imageurl;
  }

  public void setImageurl(String imageurl) {
    this.imageurl = imageurl;
  }

  @Override
  public String toString() {
    return "Bscjinformation2{" +
            "id2=" + id2 +
            ", id1=" + id1 +
            ", information='" + information + '\'' +
            ", imageurl='" + imageurl + '\'' +
            '}';
  }
}
