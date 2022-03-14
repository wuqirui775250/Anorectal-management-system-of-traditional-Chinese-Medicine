package com.example.demo.controller;

import com.example.demo.bean.Gczswdchapter;
import com.example.demo.bean.Gczswdknowledge;
import com.example.demo.bean.Gczswdsubject;
import com.example.demo.service.Interfaces.IGczswd;
import com.example.demo.untils.Resultuntils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("wenda")
@RestController
public class GczswdController {
    @Autowired
    IGczswd iGczswd;


    @CrossOrigin
    @ResponseBody
    @GetMapping("chapter")
    public Resultuntils chapter()
    {
        List<Gczswdchapter> result = null;
        result = iGczswd.chapter();
        if(result==null)
            return Resultuntils.fail(300,"未查询到");
        else
            return Resultuntils.success(result);
    }

    @CrossOrigin
    @ResponseBody
    @GetMapping("subject")
    public Resultuntils subject()
    {
        List<Gczswdsubject> result = null;
        result = iGczswd.subject();
        if(result==null)
            return Resultuntils.fail(300,"未查询到");
        else
            return Resultuntils.success(result);
    }

    @CrossOrigin
    @ResponseBody
    @GetMapping("knowledge")
    public Resultuntils knowledge()
    {
        List<Gczswdknowledge> result = null;
        result = iGczswd.knowledge();
        if(result==null)
            return Resultuntils.fail(300,"未查询到");
        else
            return Resultuntils.success(result);
    }
}
