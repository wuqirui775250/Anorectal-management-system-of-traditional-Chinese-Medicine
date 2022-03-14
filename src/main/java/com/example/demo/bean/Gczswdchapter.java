package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gczswdchapter {

  private long cid;
  private String chapter;

  @Override
  public String toString() {
    return "Gczswdchapter{" +
            "cid=" + cid +
            ", chapter='" + chapter + '\'' +
            '}';
  }
}
