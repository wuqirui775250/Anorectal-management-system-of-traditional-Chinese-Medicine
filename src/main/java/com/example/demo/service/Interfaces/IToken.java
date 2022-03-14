package com.example.demo.service.Interfaces;

import com.example.demo.bean.Token;

public interface IToken {
    Token findbytoken(String token);
    Integer deletebytoken(String token);
    Integer addtoken(Token token);
    String myprint();
}
