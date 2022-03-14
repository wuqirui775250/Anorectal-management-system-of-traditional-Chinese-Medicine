package com.example.demo.controller;

import com.example.demo.bean.Video;
import com.example.demo.service.Interfaces.IVideo;
import com.example.demo.untils.Resultuntils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RequestMapping("Test")
@Controller
public class TestController
{
    @Autowired
    IVideo iVideo;
    @ResponseBody
    @CrossOrigin
    @PostMapping("test")
    public String test(@RequestParam("file")MultipartFile file,String title,String information)
    {
        String url;
        String addtime;
        SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        addtime = sf.format(new Date());
        url="h:\\new\\"+System.currentTimeMillis()+file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));
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
            result=iVideo.fileupload(file,url);
        } catch (IOException e) {
            System.out.println("文件复制失败");
            e.printStackTrace();
        }
        if(result.equals("OK") && insertresult==1)
            return "success";
        else if(insertresult!=1)
            return "video insert is not successful";
        else
            return "file is empty";
    }
    @ResponseBody
    @CrossOrigin
    @GetMapping("test01")
    public String test1(String id)
    {
        System.out.println("id:"+id);
        return "helloworld";
    }
    @CrossOrigin
    @PostMapping("/uploadFile")
    public String uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        System.out.println("开发上传");
        if (file.isEmpty()) {
            return "上传失败，请选择文件";
        }
        String fileName = file.getOriginalFilename();
        String fileName1 = fileName.split("\\.")[1];
        System.out.println("filename:"+fileName1);
        String name = String.valueOf(System.currentTimeMillis()); // 随机的uuid
//        String filePath = "/usr/local/tomcat/apache-tomcat-9.0.54/webapps/video/" + name + "." + fileName1;
        String filePath = "/usr/local/tomcat/apache-tomcat-9.0.54/webapps/video/" + name + "." + fileName1;
        File dest = new File(filePath);
        file.transferTo(dest);
        return name + "." + fileName1;
    }
    @CrossOrigin
    @PostMapping("/uploadimage")
    public String uploadimage(@RequestParam("file") MultipartFile file) throws IOException {
        System.out.println("开发上传");
        if (file.isEmpty()) {
            return "上传失败，请选择文件";
        }
        String fileName = file.getOriginalFilename();
        String fileName1 = fileName.split("\\.")[1];
        System.out.println("filename:"+fileName1);
        String name = String.valueOf(System.currentTimeMillis()); // 随机的uuid
//        String filePath = "/usr/local/tomcat/apache-tomcat-9.0.54/webapps/video/" + name + "." + fileName1;
        String filePath = "/usr/local/tomcat/apache-tomcat-9.0.54/webapps/video/" + name + "." + fileName1;
        File dest = new File(filePath);
        file.transferTo(dest);
        return name + "." + fileName1;
    }
    @ResponseBody
    @CrossOrigin
    @GetMapping("test05")
    public Resultuntils test5(String id)
    {
        System.out.println("id:"+id);
        return Resultuntils.success(id);
    }
}
