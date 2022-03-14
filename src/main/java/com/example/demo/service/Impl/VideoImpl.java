package com.example.demo.service.Impl;

import com.example.demo.bean.Video;
import com.example.demo.mapper.VideoMapper;
import com.example.demo.service.Interfaces.IVideo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
@Service
public class VideoImpl implements IVideo {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    VideoMapper videoMapper;
    @Override
    public Integer addnewvideo(Video video) {
        Integer row = videoMapper.insert(video);
        if(row==1)
        {
            return 1;
        }
        return 0;
    }

    @Override
    public Integer deletebyvid(String vid) {
        Integer row = videoMapper.deletebyvid(vid);
        if(row==null)
            return 0;
        else
            return 1;
    }

    @Override
    public Integer updatavideo(Video video) {
        Integer row=videoMapper.updatabyvid(video);
        if(row==null)
            return 0;
        else
            return 1;
    }

    @Override
    public List<Video> selectall() {
        return videoMapper.selectall();
    }

    @Override
    public Video selectbyvid(String vid) {
        Video video  = null ;
        video = videoMapper.selectByvid(vid);
        return video;
    }

    @Override
    public Video selectbyvtitle(String vtitle) {
        return null;
    }

    @Override
    public String fileupload(MultipartFile file,String url) throws IOException {
        if(file.isEmpty())
            return null;
        String OriginFilename = file.getOriginalFilename();
        String filename = url;
        String filepath = "C:\\Users\\wqr\\Desktop\\wqr/";
        File newfile = new File(filepath+filename);
        if(!newfile.exists())
        {
            newfile.mkdir();
        }
        file.transferTo(newfile);
        return "OK";
    }
}
