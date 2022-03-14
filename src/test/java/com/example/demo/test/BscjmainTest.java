package com.example.demo.test;

import com.example.demo.bean.Bscjinformation1;
import com.example.demo.bean.Bscjmain;
import com.example.demo.bean.User;
import com.example.demo.mapper.Bscjinformation1Mapper;
import com.example.demo.mapper.BscjmainMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.Interfaces.IBscj;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BscjmainTest
{
    @Autowired
    BscjmainMapper bscjmainMapper;
    @Autowired
    IBscj iBscj;
    @Autowired
    Bscjinformation1Mapper bscj1;
    @Test
    public void test01()
    {
        List<Bscjmain> array=null;
        array = bscjmainMapper.selectall();
        System.out.println(array.toString());
        System.out.println("helloworld");
    }
    @Test
    public void test02()
    {
        List<Bscjinformation1> array=null;
        array = iBscj.findinformation1();
        System.out.println(array);
    }

}
