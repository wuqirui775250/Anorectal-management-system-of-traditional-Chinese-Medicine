package com.example.demo.mapper;

import com.example.demo.bean.Xjarticle;

import java.util.List;

public interface XjarticleMapper {
    List<Xjarticle> getallarticle();
    Integer insert(Xjarticle xjarticle);
    Integer deletebyarticleid(String articleid);
}
