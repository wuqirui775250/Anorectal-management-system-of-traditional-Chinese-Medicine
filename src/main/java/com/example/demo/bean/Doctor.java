package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

  private long doctorid;
  private String doctorname;
  private String password;
  private String position;

  @Override
  public String toString() {
    return "Doctor{" +
            "doctorid=" + doctorid +
            ", doctorname='" + doctorname + '\'' +
            ", password='" + password + '\'' +
            ", position='" + position + '\'' +
            '}';
  }
}
