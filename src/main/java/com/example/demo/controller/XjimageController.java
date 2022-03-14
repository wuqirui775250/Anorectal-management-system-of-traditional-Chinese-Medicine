package com.example.demo.controller;

import com.example.demo.bean.Xjimage;
import com.example.demo.service.Interfaces.IXjimage;
import com.example.demo.untils.Resultuntils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("image")
public class XjimageController {
    @Autowired
    IXjimage iXjimage;

    @CrossOrigin
    @ResponseBody
    @GetMapping("images")
    public Resultuntils images()
    {
        List<Xjimage> result = iXjimage.getall();
        if(result==null)
        {
            return Resultuntils.fail(300,"查询结果为空");
        }
        else
        {
            return Resultuntils.success(result);
        }
    }

    @CrossOrigin
    @ResponseBody
    @PostMapping("addimage")
    public Resultuntils addimage(Xjimage xjimage)
    {
        Integer result = iXjimage.insert(xjimage);
        if(result==null)
        {
            return Resultuntils.fail(300,"查询结果为空");
        }
        else
        {
            return Resultuntils.success(result);
        }
    }

    @CrossOrigin
    @ResponseBody
    @PostMapping("delete")
    public Resultuntils delete(String iid)
    {
        Integer result = iXjimage.deletebyiid(iid);
        if(result==1)
        {
            return Resultuntils.success(result);
        }
        else
        {
            return Resultuntils.fail(300,"删除失败");
        }
    }
}
