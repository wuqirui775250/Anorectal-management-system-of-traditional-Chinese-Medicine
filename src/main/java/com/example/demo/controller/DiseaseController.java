package com.example.demo.controller;

import com.example.demo.bean.Disease;
import com.example.demo.bean.Diseaseinformation;
import com.example.demo.bean.Diseasetitle;
import com.example.demo.service.Interfaces.IDisease;
import com.example.demo.untils.Resultuntils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("Disease")
@RestController
public class DiseaseController {
    @Autowired
    IDisease iDisease;

    @ResponseBody
    @CrossOrigin
    @GetMapping("diseasemeun")
    public Resultuntils diseasemeun()
    {
        List<Disease> result = null;
        result = iDisease.menu();
        if(result!=null)
            return Resultuntils.success(result);
        else
            return Resultuntils.fail(300,"data is empty");
    }

    @ResponseBody
    @CrossOrigin
    @GetMapping("diseasetitle")
    public Resultuntils diseasetitle()
    {
        List<Diseasetitle> result = null;
        result = iDisease.title();
        if(result!=null)
            return Resultuntils.success(result);
        else
            return Resultuntils.fail(300,"data is empty");
    }

    @ResponseBody
    @CrossOrigin
    @GetMapping("diseaseinformation")
    public Resultuntils diseaseinformation()
    {
        List<Diseaseinformation> result = null;
        result = iDisease.information();
        if(result!=null)
            return Resultuntils.success(result);
        else
            return Resultuntils.fail(300,"data is empty");
    }
}
