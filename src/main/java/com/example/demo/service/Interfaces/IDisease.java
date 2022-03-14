package com.example.demo.service.Interfaces;

import com.example.demo.bean.Disease;
import com.example.demo.bean.Diseaseinformation;
import com.example.demo.bean.Diseasetitle;

import java.util.List;

public interface IDisease {
    List<Disease> menu();
    List<Diseasetitle> title();
    List<Diseaseinformation> information();
}
