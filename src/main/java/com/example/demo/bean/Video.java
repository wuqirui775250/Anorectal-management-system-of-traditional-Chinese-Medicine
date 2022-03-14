package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Video {

  private long vid;
  private String vtitle;
  private String vinformation;
  private String vurl;
  private String vaddtime;
  private long vstate;

  public long getVid() {
    return vid;
  }

  public void setVid(long vid) {
    this.vid = vid;
  }

  public String getVtitle() {
    return vtitle;
  }

  public void setVtitle(String vtitle) {
    this.vtitle = vtitle;
  }

  public String getVinformation() {
    return vinformation;
  }

  public void setVinformation(String vinformation) {
    this.vinformation = vinformation;
  }

  public String getVurl() {
    return vurl;
  }

  public void setVurl(String vurl) {
    this.vurl = vurl;
  }

  public String getVaddtime() {
    return vaddtime;
  }

  public void setVaddtime(String vaddtime) {
    this.vaddtime = vaddtime;
  }

  public long getVstate() {
    return vstate;
  }

  public void setVstate(long vstate) {
    this.vstate = vstate;
  }

  @Override
  public String toString() {
    return "Video{" +
            "vid=" + vid +
            ", vtitle='" + vtitle + '\'' +
            ", vinformation='" + vinformation + '\'' +
            ", vurl='" + vurl + '\'' +
            ", vaddtime=" + vaddtime +
            ", vstate=" + vstate +
            '}';
  }
}
