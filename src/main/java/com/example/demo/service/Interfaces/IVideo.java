package com.example.demo.service.Interfaces;

import com.example.demo.bean.Video;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface IVideo
{
    Integer addnewvideo(Video video);
    Integer deletebyvid(String vid);
    Integer updatavideo(Video video);
    List<Video> selectall();
    Video selectbyvid(String vid);
    Video selectbyvtitle(String vtitle);
    String fileupload(MultipartFile multipartFile,String url) throws IOException;
}
