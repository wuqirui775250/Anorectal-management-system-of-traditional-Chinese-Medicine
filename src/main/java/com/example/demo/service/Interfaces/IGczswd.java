package com.example.demo.service.Interfaces;

import com.example.demo.bean.Gczswdchapter;
import com.example.demo.bean.Gczswdknowledge;
import com.example.demo.bean.Gczswdsubject;

import java.util.List;

public interface IGczswd {
    List<Gczswdchapter> chapter();
    List<Gczswdsubject> subject();
    List<Gczswdknowledge> knowledge();
}
