package com.example.demo.service.Interfaces;

import com.example.demo.bean.Xjtype;

import java.util.List;

public interface IXjtype {
    List<Xjtype> getxjtype();
    Integer deletebyid(String typeid);
    Integer insert(Xjtype xjtype);
}
