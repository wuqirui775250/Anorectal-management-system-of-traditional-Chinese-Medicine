package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisAccessor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Token {

  private String token;
  private String ordertime;
  private String longs;
  private String username;
  private long uid;

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getOrdertime() {
    return ordertime;
  }

  public void setOrdertime(String ordertime) {
    this.ordertime = ordertime;
  }

  public String getLongs() {
    return longs;
  }

  public void setLongs(String longs) {
    this.longs = longs;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }

  @Override
  public String toString() {
    return "Token{" +
            "token='" + token + '\'' +
            ", ordertime='" + ordertime + '\'' +
            ", longs='" + longs + '\'' +
            ", username='" + username + '\'' +
            ", uid=" + uid +
            '}';
  }
  public  void gettoken(String usertoken)
  {
    RedisAccessor redisAccessor = new RedisAccessor();
  }
}
