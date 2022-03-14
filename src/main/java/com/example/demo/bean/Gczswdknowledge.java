package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Gczswdknowledge {

  private long Kid;
  private long sid;
  private String information;
  private String imageurl;

  @Override
  public String toString() {
    return "Gczswdknowledge{" +
            "__Kid=" + Kid +
            ", sid=" + sid +
            ", information='" + information + '\'' +
            ", imageurl='" + imageurl + '\'' +
            '}';
  }

  public long getKid() {
    return Kid;
  }

  public void setKid(long kid) {
    Kid = kid;
  }

  public long getSid() {
    return sid;
  }

  public void setSid(long sid) {
    this.sid = sid;
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
}
