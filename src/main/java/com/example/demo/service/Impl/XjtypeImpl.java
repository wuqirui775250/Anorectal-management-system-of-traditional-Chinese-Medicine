package com.example.demo.service.Impl;

import com.example.demo.bean.Xjtype;
import com.example.demo.mapper.XjtypeMapper;
import com.example.demo.service.Interfaces.IXjtype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XjtypeImpl implements IXjtype {
    @Autowired
    XjtypeMapper xjtypeMapper;
    @Autowired
    RedisTemplate redisTemplate;
    @Cacheable(value = "type")
    @Override
    public List<Xjtype> getxjtype() {
        List<Xjtype> array = (List<Xjtype>) redisTemplate.opsForValue().get("type");
        if(array==null)
        {
            synchronized (this.getClass())
            {
                array = (List<Xjtype>) redisTemplate.opsForValue().get("type");
                if(array==null)
                {
                    array = xjtypeMapper.getalltype();
                    redisTemplate.opsForValue().set("type",array);
                }
            }
        }
        return array;
    }
    @CacheEvict(value = "type")
    @Override
    public Integer deletebyid(String typeid) {
        Integer result = xjtypeMapper.deletebytypeid(typeid);
        System.out.println(result);
        if(result != null)
        {
            System.out.println("执行删除");
            redisTemplate.delete("type");
        }
        return result;
    }

    @Override
    public Integer insert(Xjtype xjtype) {
        return xjtypeMapper.insert(xjtype);
    }
}
