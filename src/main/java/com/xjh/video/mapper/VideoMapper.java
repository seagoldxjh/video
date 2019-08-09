package com.xjh.video.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xjh.video.entity.Video;

public interface VideoMapper extends BaseMapper<Video> {
    //@UpdateProvider(type = VideoProvider.class,method = "updateVideo")
    //int update(Video video);
}
