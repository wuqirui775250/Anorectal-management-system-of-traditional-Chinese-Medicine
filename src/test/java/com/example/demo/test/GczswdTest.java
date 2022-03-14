package com.example.demo.test;

import com.example.demo.bean.Gczswdchapter;
import com.example.demo.bean.Gczswdknowledge;
import com.example.demo.bean.Gczswdsubject;
import com.example.demo.mapper.GczswdchapterMapper;
import com.example.demo.mapper.GczswdknowledgeMapper;
import com.example.demo.mapper.GczswdsubjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GczswdTest {
   @Autowired
   GczswdchapterMapper gczswdchapterMapper;
   @Autowired
   GczswdknowledgeMapper gczswdknowledgeMapper;
   @Autowired
    GczswdsubjectMapper gczswdsubjectMapper;
   @Test
    public void Test01()
   {
       List<Gczswdchapter> array = gczswdchapterMapper.selectall();
       System.out.println(array.toString());
   }
   @Test
    public void Test02()
   {
       List<Gczswdknowledge> array = null;
       array = gczswdknowledgeMapper.selectall();
       System.out.println(array.toString());
   }
   @Test
    public void Test03()
   {
       List<Gczswdsubject> array = null;
       array = gczswdsubjectMapper.selectall();
       System.out.println(array.toString());
   }
}
