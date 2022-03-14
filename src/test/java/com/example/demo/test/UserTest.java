package com.example.demo.test;

import com.example.demo.bean.User;
import com.example.demo.bean.Video;
import com.example.demo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest
{
    @Autowired
    UserMapper userMapper;
    @Test
    public void Test01()//测试selectbyuid
    {
        User user=null;
        System.out.println("helloworld");
        user=userMapper.selectbyuid("1");
        System.out.println(user.toString());
    }
    @Test
    public void Test2()//测试selectbyuname
    {
        User user=null;
     user = userMapper.selectbyusername("admin");
        System.out.println(user.toString());
    }
    @Test
    public void Test03()//测试selectall（）
    {
        List<User> users =null;
        users=userMapper.selectall();
        System.out.println(users.toString());
    }
    @Test
    public void Test04()//测试insert
    {
        User user =new User("admin1","admin","2021-05-21");
        Integer row=userMapper.insert(user);
        System.out.println("受影响的行数:"+row);
    }
    @Test
    public void Test05()//deletebyuid测试
    {
        Integer row=userMapper.deleteByUidInteger("1");
        System.out.println("受影响的行数:"+row);
    }
}
