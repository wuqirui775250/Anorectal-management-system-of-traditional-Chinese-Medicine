package com.example.demo.service.Impl;

import com.example.demo.bean.Xjimage;
import com.example.demo.service.Interfaces.IXjimage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XjimageImpl implements IXjimage {
    @Autowired
    IXjimage iXjimage;
    @Override
    public List<Xjimage> getall() {
        List<Xjimage> array = iXjimage.getall();
        return array;
    }

    @Override
    public Integer insert(Xjimage image) {
        return iXjimage.insert(image);
    }

    @Override
    public Integer deletebyiid(String iid) {
        return iXjimage.deletebyiid(iid);
    }
}
