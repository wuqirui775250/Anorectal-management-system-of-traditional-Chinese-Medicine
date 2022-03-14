package com.example.demo.bean;

public class Xjimage {

  private long iid;
  private String imagename;
  private String imageurl;
  private long imagetype;


  public long getIid() {
    return iid;
  }

  public void setIid(long iid) {
    this.iid = iid;
  }


  public String getImagename() {
    return imagename;
  }

  public void setImagename(String imagename) {
    this.imagename = imagename;
  }


  public String getImageurl() {
    return imageurl;
  }

  public void setImageurl(String imageurl) {
    this.imageurl = imageurl;
  }


  public long getImagetype() {
    return imagetype;
  }

  public void setImagetype(long imagetype) {
    this.imagetype = imagetype;
  }

  @Override
  public String toString() {
    return "Xjimage{" +
            "iid=" + iid +
            ", imagename='" + imagename + '\'' +
            ", imageurl='" + imageurl + '\'' +
            ", imagetype=" + imagetype +
            '}';
  }
}
