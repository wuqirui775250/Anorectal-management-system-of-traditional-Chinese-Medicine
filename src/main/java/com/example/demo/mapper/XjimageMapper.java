package com.example.demo.mapper;

import com.example.demo.bean.Xjimage;

import java.util.List;

public interface XjimageMapper {
    List<Xjimage> getallimage();
    Integer insert(Xjimage xjimage);
    Integer deletebyiid(String iid);
}
