package com.example.demo.Filter;

import com.example.demo.service.Interfaces.IToken;
import com.example.demo.untils.Resultuntils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyHandler implements HandlerInterceptor {


    @Autowired
    IToken iToken;
    @Autowired
    RedisTemplate redisTemplate;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("request:"+request.getQueryString());
        String parmes = request.getQueryString();
        int tokenstart = parmes.indexOf("token=")+"token=".length();
        int tokenend = parmes.indexOf("&",tokenstart);
        if(tokenend==-1)
            tokenend = parmes.length();
        System.out.println("start:"+tokenstart+"    end:"+tokenend);
        String token = parmes.substring(tokenstart,tokenend);
        System.out.println("token："+token);
        if(redisTemplate.opsForValue().get("user:"+token)==null)
        {
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().println(Resultuntils.fail(300,"身份已过期，请先登录:"+token));
            return  false;
        }
        else
        {
            Long shijianchuo = System.currentTimeMillis();
//            redisTemplate.opsForValue().set("user:"+token,shijianchuo,20*60, TimeUnit.SECONDS);
            System.out.println("redisL:"+redisTemplate.opsForValue().get("user:"+token));
            return true;
        }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("执行到了返回");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
