package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Diseasetitle {

  private long tid;
  private long did;
  private String title;

  @Override
  public String toString() {
    return "Diseasetitle{" +
            "tid=" + tid +
            ", did=" + did +
            ", title='" + title + '\'' +
            '}';
  }
}
