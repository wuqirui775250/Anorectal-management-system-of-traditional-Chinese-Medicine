package com.example.demo.service.Impl;

import com.example.demo.bean.Xjarticle;
import com.example.demo.mapper.XjarticleMapper;
import com.example.demo.service.Interfaces.IXjarticle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class XjarticleImpl  implements IXjarticle {
    @Autowired
    XjarticleMapper xjarticleMapper;
    @Override
    public List<Xjarticle> getall() {
        return xjarticleMapper.getallarticle();
    }
    @Override
    public Integer insert(Xjarticle xjarticle) {
        Date mydate = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        xjarticle.setPublishtime(sf.format(mydate));
        return xjarticleMapper.insert(xjarticle);
    }

    @Override
    public Integer deletebyarticleid(String articleid) {
        return xjarticleMapper.deletebyarticleid(articleid);
    }
}
