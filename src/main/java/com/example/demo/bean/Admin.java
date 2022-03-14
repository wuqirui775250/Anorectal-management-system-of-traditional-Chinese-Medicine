package com.example.demo.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

  private long aid;
  private String username;
  private String password;

  @Override
  public String toString() {
    return "Admin{" +
            "aid=" + aid +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            '}';
  }
}
