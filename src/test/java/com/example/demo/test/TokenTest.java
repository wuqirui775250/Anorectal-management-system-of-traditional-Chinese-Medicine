package com.example.demo.test;

import com.example.demo.bean.Token;
import com.example.demo.mapper.TokenMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TokenTest {
    @Autowired
    TokenMapper tokenMapper;
    @Test
    public void TEST01()
    {
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Token token=new Token();
        token.setUsername("wqr");
        token.setUid(1);
        token.setOrdertime(sf.format(date));
        token.setLongs("600");
        token.setToken((token.getUsername()+token.getOrdertime()).trim());
        System.out.println(token.toString());
        Integer row = tokenMapper.insert(token);
        System.out.println(row);
    }
    @Test
    public void Test01()
    {
        Date date = new Date();
        System.out.println(date);
        String longs=String.valueOf(System.currentTimeMillis());
        date.setTime(Long.valueOf(longs)+60*1000*10);
        System.out.println(date);
    }
    @Test
    public void Test02() throws ParseException {
        String token = "wqr2022-01-13 11:59:39";
        Token token1 = tokenMapper.selectbytoken(token);
        System.out.println(token1.toString());
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sf.parse(token1.getOrdertime());
        Long longs=Long.valueOf(date.getTime());
        Long newlong=Long.valueOf((new Date()).getTime());
        if(newlong>(longs+1000*60*10))
        {
            System.out.println("已经超时");
            tokenMapper.deletebytoken(token);
        }
        else
            System.out.println("未超时");
        System.out.println(longs);
    }
    @Test
    public void test03()
    {
        Integer row = tokenMapper.deletebytoken("admin11642064982986");
        System.out.println(row);
    }
}
