package com.example.demo.test;

import com.example.demo.bean.Bscjinformation1;
import com.example.demo.bean.Bscjinformation2;
import com.example.demo.mapper.Bscjinformation1Mapper;
import com.example.demo.mapper.Bscjinformation2Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Bscjinformation2Test
{
    @Autowired
    Bscjinformation2Mapper bscjmainMapper;
    @Test
    public void test01()
    {
        List<Bscjinformation2> array = null;
       array = bscjmainMapper.selectall();
        System.out.println(array.toString());
        array = bscjmainMapper.selectbyid1("1");
        System.out.println(array.toString());
    }

}
