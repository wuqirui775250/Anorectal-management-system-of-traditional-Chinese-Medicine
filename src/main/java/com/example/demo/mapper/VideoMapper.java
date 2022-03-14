package com.example.demo.mapper;


import com.example.demo.bean.Video;

import java.util.List;

public interface VideoMapper {
    List<Video> selectall();
    Video selectByvid(String vid);
    Integer insert(Video video);
    Integer deletebyvid(String vid);
    Integer updatabyvid(Video video);
}
