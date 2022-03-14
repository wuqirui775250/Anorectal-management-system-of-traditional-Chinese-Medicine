package com.example.demo.service.Impl;

import com.example.demo.bean.Bscjinformation1;
import com.example.demo.bean.Bscjinformation2;
import com.example.demo.bean.Bscjmain;
import com.example.demo.mapper.Bscjinformation1Mapper;
import com.example.demo.mapper.Bscjinformation2Mapper;
import com.example.demo.mapper.BscjmainMapper;
import com.example.demo.service.Interfaces.IBscj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BscjImpl implements IBscj {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    BscjmainMapper bscjmainMapper;
    @Autowired
    Bscjinformation1Mapper bscjinformation1Mapper;
    @Autowired
    Bscjinformation2Mapper bscjinformation2Mapper;
    @Cacheable(value = "Bscjmain")
    @Override
    public List<Bscjmain> findbscjmain() {
        List<Bscjmain> array = (List<Bscjmain>) redisTemplate.opsForValue().get("Bscjmain");
        if(array == null)
        {
            synchronized (this.getClass())
            {
                array = (List<Bscjmain>) redisTemplate.opsForValue().get("Bscjmain");
                if(array==null)
                {
                    array = bscjmainMapper.selectall();
                    redisTemplate.opsForValue().set("Bscjmain",array);
                }
            }

        }
       return array;
    }
    @Cacheable(value = "Bscjinformation1")
    @Override
    public List<Bscjinformation1> findinformation1() {
        List<Bscjinformation1> array = (List<Bscjinformation1>) redisTemplate.opsForValue().get("Bscjinformation1");
        if(array == null)
        {
            synchronized (this.getClass())
            {
                array = (List<Bscjinformation1>) redisTemplate.opsForValue().get("Bscjinformation1");
                if(array == null)
                {
                    array = bscjinformation1Mapper.selectall();
                    redisTemplate.opsForValue().set("Bscjinformation1",array);
                }
            }

        }
        return array;
    }
    @Cacheable(value = "Bscjinformation2")
    @Override
    public List<Bscjinformation2> findinformation2() {
        List<Bscjinformation2> array = (List<Bscjinformation2>) redisTemplate.opsForValue().get("Bscjinformation2");
        if(array == null)
        {
            synchronized (this.getClass())
            {
                array = (List<Bscjinformation2>) redisTemplate.opsForValue().get("Bscjinformation2");
                if(array == null)
                {
                    array = bscjinformation2Mapper.selectall();
                    redisTemplate.opsForValue().set("Bscjinformation2",array);
                }
            }

        }
        return array;
    }
}
