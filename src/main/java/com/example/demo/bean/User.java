package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class User {

  private long uid;
  private String username;
  private String password;
  private String logintime;

  public User() {
  }

  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getLogintime() {
    return logintime;
  }

  public void setLogintime(String logintime) {
    this.logintime = logintime;
  }

  public User(String username, String password, String logintime) {
    this.username = username;
    this.password = password;
    this.logintime = logintime;
  }

  @Override
  public String toString() {
    return "User{" +
            "uid=" + uid +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", logintime=" + logintime +
            '}';
  }
}
