package com.example.demo.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gczswdsubject {

  private long sid;
  private long cid;
  private String subjects;

  @Override
  public String toString() {
    return "Gczswdsubject{" +
            "sid=" + sid +
            ", cid=" + cid +
            ", subjects='" + subjects + '\'' +
            '}';
  }
}
