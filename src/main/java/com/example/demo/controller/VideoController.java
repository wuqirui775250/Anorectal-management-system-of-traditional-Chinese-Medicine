package com.example.demo.controller;

import com.example.demo.bean.Video;
import com.example.demo.service.Interfaces.IVideo;
import com.example.demo.untils.Resultuntils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RequestMapping("video")
@RestController
public class VideoController
{
    @Autowired
    IVideo iVideo;

    @CrossOrigin
    @PostMapping("addvideo")
    public Resultuntils addvideo(String vtitle,String vinformation,String vurl)
    {
        System.out.println("vtitle    "+vtitle+"      vinformation       "+vinformation+"         vurl      "+vurl);
        Video video = new Video();
        video.setVtitle(vtitle);
        video.setVinformation(vinformation);
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        video.setVaddtime(sf.format(date));
        video.setVurl(vurl);
        Integer result = iVideo.addnewvideo(video);
        if (result == null) {
            return Resultuntils.fail(300,"数据库保存失败");
        }
        return Resultuntils.success(null);
    }


    @ResponseBody
    @CrossOrigin
    @PostMapping("deletebyvid")
    public Resultuntils deletebyvid(String vid)
    {
        Integer row = iVideo.deletebyvid(vid);
        System.out.println("vid:"+vid);
        if(row == null)
            return Resultuntils.fail(300,"删除失败");
        else
            return Resultuntils.success(null);
    }
    @ResponseBody
    @CrossOrigin
    @GetMapping("findall")
    public Resultuntils findall()
    {
        List<Video> videos = null;
        videos = iVideo.selectall();
        if(videos==null)
            return Resultuntils.fail(300,"查询失败");
        else
            return Resultuntils.success(videos);
    }
    @ResponseBody
    @CrossOrigin
    @GetMapping("findvideobyvid")
    public Resultuntils findvideobyvid(String vid)
    {
        Video video = null;
        video = iVideo.selectbyvid(vid);
        if(video == null)
            return Resultuntils.fail(300,"查询失败");
        else
            return Resultuntils.success(video);
    }
    @ResponseBody
    @CrossOrigin
    @PostMapping("upload")
    public Resultuntils test(@RequestParam("file")MultipartFile file, String title, String information, HttpServletResponse response,HttpServletRequest request) throws IOException, ServletException {
        String url;
        String addtime;
        SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        addtime = sf.format(new Date());
        url=System.currentTimeMillis()+file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));
        Video video = new Video();
        video.setVtitle(title);
        video.setVinformation(information);
        video.setVaddtime(addtime);
        video.setVurl(url);
        Integer insertresult = iVideo.addnewvideo(video);
        System.out.println(video.toString());
        System.out.println(title);
        String result=null;
        try {
            result=iVideo.fileupload(file,"111222.png");
        } catch (IOException e) {
            System.out.println("文件复制失败");
            e.printStackTrace();
        }
        if(result.equals("OK") && insertresult==1)
        {
            response.setContentType("text/html;charset=utf-8");
            return Resultuntils.success(null);
        }
        else if(insertresult!=1)
            return Resultuntils.fail(300,"数据库插入失败");
        else
        return Resultuntils.fail(400,"文件添加失败");
    }
}
