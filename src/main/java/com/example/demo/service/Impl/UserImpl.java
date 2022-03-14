package com.example.demo.service.Impl;

import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.service.Interfaces.IUser;
@Service
public class UserImpl implements IUser {
    @Autowired
    UserMapper userMapper;
    @Override
    public Integer userlogin(String username, String password) {
        User user=null;
        user = userMapper.selectbyusername(username);
        if(user == null)
        {
            return -1;//用户名不存在
        }
        else if(user.getPassword().equals(password))
        {
            return 1;//密码错误
        }
        else
            return 0;//用户登录成功
    }

    @Override
    public Integer adduser(String username, String password) {
        return null;
    }
}
