package com.example.demo.test;

import com.example.demo.bean.Video;
import com.example.demo.mapper.VideoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VideoTest
{
    @Autowired
    VideoMapper videoMapper;
    @Test
    public void Test01()
    {
        List<Video> array=null;
        array=videoMapper.selectall();
        System.out.println(array.toString());
    }
    @Test
    public void Test02()
    {
        Video video=null;
        video=videoMapper.selectByvid("1");
        System.out.println(video.toString());
    }
    @Test
    public void Test03()
    {
        Video video=new Video();
        video.setVtitle("健康成长");
        video.setVstate(1);
        video.setVinformation("关乎大家的肛肠在在成长");
        Date date=new Date();
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
        video.setVaddtime(sf.format(date));
        video.setVurl("/image/5.mp4");
        Integer row=videoMapper.insert(video);
        System.out.println("受影响的行数:"+row);
    }
    @Test
    public void Test04()
    {
        Integer row=videoMapper.deletebyvid("3");
    }
    @Test
    public void Test05()
    {
        Video video=new Video();
        video=videoMapper.selectByvid("2");
        video.setVtitle("hellowrold");
        Integer row=videoMapper.updatabyvid(video);
        System.out.println("受影响的行数:"+row);
    }
    @Test
    public void tEST001()
    {
//        IBscj bscj = new BscjImpl();
//        List<Bscjinformation2> array = bscj.findinformation2();
//        array.replaceAll(e -> e.replace());
//        System.out.println(str);
    }
    @Test
    public void test02()
    {
        Integer row= null;
        row = videoMapper.deletebyvid("1");
        System.out.println(row);
    }
}
