package com.example.demo.test;

import com.example.demo.bean.Diseaseinformation;
import com.example.demo.mapper.DiseaseMapper;
import com.example.demo.mapper.DiseaseinformationMapper;
import com.example.demo.mapper.DiseasetitleMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class Diseasetest {
    @Autowired
    DiseaseMapper diseaseMapper;
    @Autowired
    DiseasetitleMapper diseasetitleMapper;
    @Autowired
    DiseaseinformationMapper diseaseinformationMapper;

    @Test
    public void test01()
    {
        List<Diseaseinformation> arrya = null;
        arrya = diseaseinformationMapper.selectall();
        System.out.println(arrya.toString());

    }
}
