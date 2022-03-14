package com.example.demo.mapper;

import com.example.demo.bean.Token;

public interface TokenMapper {
    public Integer insert(Token token);
    public Integer deletebytoken(String token);
    public Token selectbytoken(String token);
}
