package com.example.demo.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Disease {

  private long did;
  private String disease;

  @Override
  public String toString() {
    return "Disease{" +
            "did=" + did +
            ", disease='" + disease + '\'' +
            '}';
  }
}
