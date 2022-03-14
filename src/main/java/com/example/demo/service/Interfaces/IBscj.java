package com.example.demo.service.Interfaces;

import com.example.demo.bean.Bscjinformation1;
import com.example.demo.bean.Bscjinformation2;
import com.example.demo.bean.Bscjmain;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IBscj {
    List<Bscjmain> findbscjmain();
    List<Bscjinformation1> findinformation1();
    List<Bscjinformation2> findinformation2();
}
