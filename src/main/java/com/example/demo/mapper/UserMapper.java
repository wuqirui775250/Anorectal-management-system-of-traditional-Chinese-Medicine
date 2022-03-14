package com.example.demo.mapper;

import com.example.demo.bean.User;

import java.util.List;

public interface UserMapper {
    User selectbyuid(String uid);
    User selectbyusername(String username);
    List<User> selectall();
    Integer insert(User user);
    Integer deleteByUidInteger(String uid);
}
