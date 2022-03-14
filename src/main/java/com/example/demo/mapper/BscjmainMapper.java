package com.example.demo.mapper;

import com.example.demo.bean.Bscjmain;

import java.util.List;

public interface BscjmainMapper
{
//    Integer insert(Bscjmain bscjmain);
//    Integer deletebyid(String id);
//    Integer updata(Bscjmain bscjmain);
    List<Bscjmain> selectall();
    Bscjmain selectbyid(String id);
}
