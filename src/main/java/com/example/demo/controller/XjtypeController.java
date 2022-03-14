package com.example.demo.controller;

import com.example.demo.bean.Xjtype;
import com.example.demo.service.Interfaces.IXjtype;
import com.example.demo.untils.Resultuntils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("xjtype")
@RestController
public class XjtypeController {
    @Autowired
    IXjtype iXjtype;

    @ResponseBody
    @CrossOrigin
    @GetMapping("getall")
    public Resultuntils getall()
    {
        System.out.println("1111");
        List<Xjtype> result = iXjtype.getxjtype();
        if(result==null)
        {
            return Resultuntils.fail(300,"type的结果为空");
        }
        else
        {
            return Resultuntils.success(result);
        }
    }

    @ResponseBody
    @CrossOrigin
    @PostMapping("addtype")
    public Resultuntils addtype(Xjtype xjtype)
    {
        Integer result = iXjtype.insert(xjtype);
        if(result ==1)
        {
            return Resultuntils.success("添加成功");
        }
        else
        {
            return Resultuntils.fail(300,"添加失败");
        }
    }

    @ResponseBody
    @CrossOrigin
    @PostMapping("delete")
    public Resultuntils delete(String typeid)
    {
        Integer result = iXjtype.deletebyid(typeid);
        if(result==null)
        {
            return Resultuntils.fail(300,"删除失败");
        }
        else
        {
            return Resultuntils.success("删除成功");
        }
    }
}
