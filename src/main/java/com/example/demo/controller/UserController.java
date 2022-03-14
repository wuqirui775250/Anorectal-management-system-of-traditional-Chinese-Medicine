package com.example.demo.controller;

import com.example.demo.mapper.TokenMapper;
import com.example.demo.service.Interfaces.IUser;
import com.example.demo.untils.Resultuntils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@RequestMapping("user")
@RestController
public class UserController
{
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    IUser iUser;
    @Autowired
    TokenMapper tokenMapper;
    @ResponseBody
    @CrossOrigin
    @GetMapping("login")
    public Resultuntils login(String username, String password, HttpServletRequest request,HttpServletResponse response,HttpSession session)
    {
        System.out.println("username:"+username +"    password:"+password);
        Integer result = null;
        result = iUser.userlogin(username,password);
        if(result==1)
        {
            Long shijianchuo = System.currentTimeMillis();
            redisTemplate.opsForValue().set("user:"+username,shijianchuo,20*60, TimeUnit.SECONDS);
            return Resultuntils.success(username);
        }
        else if(result==0)
        {
            return Resultuntils.fail(300,"用户名和密码错误");
        }
        else
        {
            return Resultuntils.fail(400,"用户名不存在");
        }
    }
    @ResponseBody
    @CrossOrigin
    @PostMapping("loginout")
    public Resultuntils loginout(String token) throws IOException {
        Long shijianchuo = System.currentTimeMillis();
        Integer reslut=tokenMapper.deletebytoken(token);
        System.out.println("redisdelte’s key:"+token);
        Boolean redisresult=redisTemplate.delete("user:"+token);
        System.out.println("redisdelte‘s key:"+redisresult);
        return Resultuntils.success(reslut);
    }
    @RequestMapping("gettoken")
    public Resultuntils test(String token)
    {
        Long shijianchuo = System.currentTimeMillis();
        Long oldshijianchuo = (Long) redisTemplate.opsForValue().get("user:"+token);
        if(oldshijianchuo!=null)
        {
            redisTemplate.opsForValue().set("user:"+token,shijianchuo,20*60, TimeUnit.SECONDS);
            return Resultuntils.success(token);
        }
        else
        {
            return Resultuntils.fail(300,"身份已过期，请重新登录");
        }
    }
}
