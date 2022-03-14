package com.example.demo.mapper;

import com.example.demo.bean.Bscjinformation1;

import java.util.List;

public interface Bscjinformation1Mapper
{
//    Integer insert(Bscjinformation1 bscjinformation1);
//    Integer update(Bscjinformation1 bscjinformation1);
//    Integer deletebyid(String id);
    List<Bscjinformation1> selectall();
    List<Bscjinformation1> selectbybscjid(String bscjid);
}
