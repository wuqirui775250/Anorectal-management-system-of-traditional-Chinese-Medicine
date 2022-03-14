package com.example.demo.bean;


public class Bscjmain {

  private long bscjid;
  private String jwgcjb;


  public long getBscjid() {
    return bscjid;
  }

  public void setBscjid(long bscjid) {
    this.bscjid = bscjid;
  }


  public String getJwgcjb() {
    return jwgcjb;
  }

  public void setJwgcjb(String jwgcjb) {
    this.jwgcjb = jwgcjb;
  }

  @Override
  public String toString() {
    return "Bscjmain{" +
            "bscjid=" + bscjid +
            ", jwgcjb='" + jwgcjb + '\'' +
            '}';
  }
}
