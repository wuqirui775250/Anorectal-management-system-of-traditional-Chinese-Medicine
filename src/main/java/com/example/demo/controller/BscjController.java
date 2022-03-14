package com.example.demo.controller;

import com.example.demo.bean.Bscjinformation1;
import com.example.demo.bean.Bscjinformation2;
import com.example.demo.bean.Bscjmain;
import com.example.demo.service.Interfaces.IBscj;
import com.example.demo.untils.Resultuntils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("Bscj")
@RestController
public class BscjController {
    @Autowired
    IBscj ibscj;
    @ResponseBody
    @CrossOrigin
    @GetMapping("bscjmeun")
    public Resultuntils bscjmeun()
    {
        List<Bscjmain> result = ibscj.findbscjmain();
        if(result==null)
        {
            return Resultuntils.fail(300,"未查询到");
        }
        else
        {
            return Resultuntils.success(result);
        }
    }
    @ResponseBody
    @CrossOrigin
    @GetMapping("title")
    public Resultuntils title()
    {
        List<Bscjinformation1> array = null;
        array = ibscj.findinformation1();
        if(array!=null)
          return Resultuntils.success(array);
        else
            return Resultuntils.fail(300,"未查询到");

    }
    @ResponseBody
    @CrossOrigin
    @GetMapping("information")
    public Resultuntils information()
    {
        List<Bscjinformation2> array = null;
        array = ibscj.findinformation2();
        if(array==null)
            return Resultuntils.fail(300,"未查询到!");
        else
            return Resultuntils.success(array);
    }
}
