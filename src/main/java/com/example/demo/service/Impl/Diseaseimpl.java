package com.example.demo.service.Impl;

import com.example.demo.bean.Disease;
import com.example.demo.bean.Diseaseinformation;
import com.example.demo.bean.Diseasetitle;
import com.example.demo.mapper.DiseaseMapper;
import com.example.demo.mapper.DiseaseinformationMapper;
import com.example.demo.mapper.DiseasetitleMapper;
import com.example.demo.service.Interfaces.IDisease;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Diseaseimpl  implements IDisease {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    DiseaseMapper diseaseMapper;
    @Autowired
    DiseasetitleMapper diseasetitleMapper;
    @Autowired
    DiseaseinformationMapper diseaseinformationMapper;

    @Cacheable(value = "diseasemenu")
    @Override
    public List<Disease> menu() {
        List<Disease> array = (List<Disease>) redisTemplate.opsForValue().get("diseasemenu");
        if(array==null)
        {
            synchronized (this.getClass())
            {
                array = (List<Disease>) redisTemplate.opsForValue().get("diseasemenu");
                if(array==null)
                {
                    array = diseaseMapper.selectall();
                    redisTemplate.opsForValue().set("diseasemenu",array);
                }
            }
        }
        return array;
    }

    @Cacheable(value = "diseasetitle")
    @Override
    public List<Diseasetitle> title() {
        List<Diseasetitle> array = (List<Diseasetitle>) redisTemplate.opsForValue().get("diseasetitle");
        if(array==null)
        {
            synchronized (this.getClass())
            {
                array = (List<Diseasetitle>) redisTemplate.opsForValue().get("diseasetitle");
                if(array==null)
                {
                    array=diseasetitleMapper.selectall();
                    redisTemplate.opsForValue().set("diseasetitle",array);
                }
            }
        }
        return array;
    }

    @Cacheable(value = "diseaseinformation")
    @Override
    public List<Diseaseinformation> information() {
        List<Diseaseinformation> array = (List<Diseaseinformation>) redisTemplate.opsForValue().get("diseaseinformation");
        if(array==null)
        {
            synchronized (this.getClass())
            {
                array = (List<Diseaseinformation>) redisTemplate.opsForValue().get("diseaseinformation");
                if(array==null)
                {
                    array=diseaseinformationMapper.selectall();
                    redisTemplate.opsForValue().set("diseaseinformation",array);
                }
            }
        }
        return array;
    }
}
