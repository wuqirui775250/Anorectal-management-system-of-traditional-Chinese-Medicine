package com.example.demo.controller;

import com.example.demo.bean.Xjarticle;
import com.example.demo.service.Interfaces.IXjarticle;
import com.example.demo.untils.Resultuntils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("article")
public class XjarticleController {
    @Autowired
    IXjarticle iXjarticle;

    @CrossOrigin
    @ResponseBody
    @GetMapping("articles")
    public Resultuntils articles()
    {
        List<Xjarticle> result = iXjarticle.getall();
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
    @PostMapping("addarticle")
    public Resultuntils addarticle(@RequestBody Xjarticle xjarticle)
    {
        System.out.println("xjarticle:"+xjarticle.toString());
        Integer result = iXjarticle.insert(xjarticle);
        if(result==1)
        {
            return Resultuntils.success(result);
        }
        else
        {
            return Resultuntils.fail(300,"添加失败");
        }

    }
    @CrossOrigin
    @ResponseBody
    @PostMapping("delarticle")
    public Resultuntils deletebyarticle(String articleid)
    {
        Integer result = iXjarticle.deletebyarticleid(articleid);
        if(result==1)
        {
            System.out.println(articleid+"删除成功");
            return Resultuntils.success(result);
        }
        else
        {
            return Resultuntils.fail(300,"删除失败");
        }
    }

}
