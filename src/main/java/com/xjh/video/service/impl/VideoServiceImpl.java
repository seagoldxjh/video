/**
 * FileName: VideoServiceImpl
 * Author:   xjh
 * Date:     2019-08-06 19:03
 * Description: 视频业务处理类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xjh.video.service.impl;

import com.xjh.video.entity.Video;
import com.xjh.video.mapper.VideoMapper;
import com.xjh.video.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈视频业务处理类〉
 *
 * @author xjh
 * @create 2019-08-06
 * @since 1.0.0
 */
@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    VideoMapper videoMapper;

    @Override
    public List<Video> findAll() {
        return videoMapper.selectList(null);
    }

    @Override
    public Video findById(int id) {
        return videoMapper.selectById(id);
    }

    @Override
    public int update(Video video) {
        return videoMapper.updateById(video);
    }

    @Override
    public int deleteById(int id) {
        return videoMapper.deleteById(id);
    }

    @Override
    public int insert(Video video) {
        videoMapper.insert(video);
        return video.getId();
    }

}