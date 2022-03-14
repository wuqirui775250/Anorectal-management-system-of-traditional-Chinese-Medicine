package com.example.demo.service.Interfaces;

import com.example.demo.bean.Xjimage;

import java.util.List;

public interface IXjimage {
    List<Xjimage> getall();
    Integer insert(Xjimage image);
    Integer deletebyiid(String iid);
}
