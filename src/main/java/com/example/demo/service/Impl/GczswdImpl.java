package com.example.demo.service.Impl;

import com.example.demo.bean.Gczswdchapter;
import com.example.demo.bean.Gczswdknowledge;
import com.example.demo.bean.Gczswdsubject;
import com.example.demo.mapper.GczswdchapterMapper;
import com.example.demo.mapper.GczswdknowledgeMapper;
import com.example.demo.mapper.GczswdsubjectMapper;
import com.example.demo.service.Interfaces.IGczswd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GczswdImpl implements IGczswd {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    GczswdchapterMapper gczswdchapterMapper;
    @Autowired
    GczswdknowledgeMapper gczswdknowledgeMapper;
    @Autowired
    GczswdsubjectMapper gczswdsubjectMapper;

    @Cacheable(value = "gczswdchapter")
    @Override
    public List<Gczswdchapter> chapter() {
        List<Gczswdchapter> array = (List<Gczswdchapter>) redisTemplate.opsForValue().get("gczswdchapter");
        if(array==null)
        {
            synchronized (this.getClass())
            {
                array = (List<Gczswdchapter>) redisTemplate.opsForValue().get("gczswdchapter");
                if(array==null)
                {
                    array=gczswdchapterMapper.selectall();
                    redisTemplate.opsForValue().set("gczswdchapter",array);
                }
            }
        }
        return array;
    }

    @Cacheable(value = "gczswdsubject")
    @Override
    public List<Gczswdsubject> subject() {
        List<Gczswdsubject> array= (List<Gczswdsubject>) redisTemplate.opsForValue().get("gczswdsubject");
        if(array==null)
        {
            synchronized (this.getClass())
            {
                array= (List<Gczswdsubject>) redisTemplate.opsForValue().get("gczswdsubject");
                if(array==null)
                {
                    array=gczswdsubjectMapper.selectall();
                    redisTemplate.opsForValue().set("gczswdsubject",array);
                }
            }
        }
        return array;
    }
//gczswdknowledgeMapper.selectall();
    @Cacheable(value = " gczswdknowledge")
    @Override
    public List<Gczswdknowledge> knowledge() {

        List<Gczswdknowledge> array = (List<Gczswdknowledge>) redisTemplate.opsForValue().get("gczswdknowledge");
        if(array==null)
        {
            synchronized (this.getClass())
            {
                array = (List<Gczswdknowledge>) redisTemplate.opsForValue().get("gczswdknowledge");
                if(array==null)
                {
                    array=gczswdknowledgeMapper.selectall();
                    List<Gczswdknowledge> result = new ArrayList<>();
                    for (Gczswdknowledge k: array)
                    {
                        k.setInformation(k.getInformation().replace("\\n",""));
                        result.add(k);
                    }
                    array=result;
                    redisTemplate.opsForValue().set("gczswdknowledge",array);
                }
            }
        }
        return array;
    }
}
