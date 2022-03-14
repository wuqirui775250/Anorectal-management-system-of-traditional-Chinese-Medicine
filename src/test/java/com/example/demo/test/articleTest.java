package com.example.demo.test;

import com.example.demo.bean.Xjarticle;
import com.example.demo.bean.Xjimage;
import com.example.demo.mapper.XjarticleMapper;
import com.example.demo.mapper.XjimageMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class articleTest
{
    @Autowired
    XjarticleMapper xjarticleMapper;
    @Autowired
    XjimageMapper xjimageMapper;
    @Test
    public void test01()
    {
//        List<Xjarticle> array = xjarticleMapper.getallarticle();
//        System.out.println(array.toString());
//        Xjarticle xjarticle = new Xjarticle();
//        xjarticle.setTitle("斗破苍穹");
//        xjarticle.setArticle("斗破苍穹作者天蚕土豆");
//        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
//        xjarticle.setPublishtime(sf.format(new Date()));
//        System.out.println("reslut:"+xjarticleMapper.insert(xjarticle));
//        System.out.println("delete:"+xjarticleMapper.deletebyarticleid("4"));
    }
    @Test
    public void test02()
    {
        List<Xjimage> arrray = xjimageMapper.getallimage();
        System.out.println("result:"+arrray.toString());
        Xjimage xjimage = new Xjimage();
        xjimage.setImagename("wqr");
        xjimage.setImagetype(1);
        xjimage.setImageurl("123/wqr.png");
        System.out.println("insert:"+xjimageMapper.insert(xjimage));
        System.out.println("delete:"+xjimageMapper.deletebyiid("3"));
    }
    @Test
    public void test03() throws ParseException {
        List<Xjarticle> array = xjarticleMapper.getallarticle();
        for (Xjarticle article:array
             ) {
            System.out.println(article.toString());
        }
    }
}
