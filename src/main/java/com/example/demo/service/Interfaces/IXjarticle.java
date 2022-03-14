package com.example.demo.service.Interfaces;

import com.example.demo.bean.Xjarticle;

import java.util.List;

public interface IXjarticle {
    List<Xjarticle> getall();
    Integer insert(Xjarticle xjarticle);
    Integer deletebyarticleid(String articleid);
}
