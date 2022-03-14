package com.example.demo.service.Impl;

import com.example.demo.bean.Token;
import com.example.demo.mapper.TokenMapper;
import com.example.demo.service.Interfaces.IToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenImpl implements IToken {
    @Autowired
    TokenMapper tokenMapper;
    @Override
    public Token findbytoken(String token) {
        System.out.println(token);
        return tokenMapper.selectbytoken(token);
    }

    @Override
    public Integer deletebytoken(String token) {
        System.out.println("delete:"+token);
        System.out.println("delete:"+"admin11642066145489");
        System.out.println("admin11642066145489".equals(token));
        Integer row = tokenMapper.deletebytoken(token);
        System.out.println("tokendelete:"+row);
        return row;
    }

    @Override
    public Integer addtoken(Token token) {
        return null;
    }

    @Override
    public String myprint() {
        return "myhellow9orld";
    }
}
