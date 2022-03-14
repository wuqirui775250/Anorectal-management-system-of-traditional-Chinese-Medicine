package com.example.demo.mapper;

import com.example.demo.bean.Xjtype;

import java.util.List;

public interface XjtypeMapper {
    List<Xjtype> getalltype();
    Integer insert(Xjtype xjtype);
    Integer deletebytypeid(String typeid);
}
