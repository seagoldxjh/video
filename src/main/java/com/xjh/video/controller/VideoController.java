/**
 * FileName: VideoController
 * Author:   xjh
 * Date:     2019-08-06 18:23
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xjh.video.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xjh.video.entity.Video;
import com.xjh.video.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Video接口〉
 *
 * @author xjh
 * @create 2019-08-06
 * @since 1.0.0
 */
@RestController
@RequestMapping("video")
public class VideoController {

    @Autowired
    VideoService videoService;

    /**
     * @parm page 当前第几页，默认第一页
     * @parm size 每页显示几条
     * @return
     */
    @RequestMapping("/page")
    public PageInfo<Video> pageVideo(@RequestParam(value = "page",defaultValue = "1") int page,
                           @RequestParam(value = "size",defaultValue = "10") int size){
        PageHelper.startPage(page, size);
        List<Video> videos = videoService.findAll();
        PageInfo<Video> pageInfo = new PageInfo<>(videos);
        return  pageInfo;
    }

    /**
     * 根据视频id找视频
     * @param videoId
     * @return
     */
    @RequestMapping("/findById")
    public Video findById(@RequestParam(value = "video_id",required = true) int videoId){
        return  videoService.findById(videoId);
    }

}