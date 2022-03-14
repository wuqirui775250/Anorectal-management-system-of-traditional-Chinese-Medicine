package com.example.demo.test;

import com.example.demo.service.Interfaces.IToken;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class iftoken {
    @Autowired
    IToken iToken;
    @Test
    public void TEST01()
    {
        System.out.println(iToken.deletebytoken("admin11642065224938"));
    }

}
