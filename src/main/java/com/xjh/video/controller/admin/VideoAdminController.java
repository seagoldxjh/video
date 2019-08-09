/**
 * FileName: VideoAdminController
 * Author:   xjh
 * Date:     2019-08-06 21:20
 * Description: 管理员Video视频接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xjh.video.controller.admin;

import com.xjh.video.entity.Video;
import com.xjh.video.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈管理员Video视频接口〉
 *
 * @author xjh
 * @create 2019-08-06
 * @since 1.0.0
 */
@RestController
@RequestMapping("admin/video")
public class VideoAdminController {
    @Autowired
    VideoService videoService;

    /**
     * 保存视频对象
     * @param
     * @return
     */
    @RequestMapping("/insert")
    public int insert(@RequestBody Video video){
        return  videoService.insert(video);
    }

    @RequestMapping("/delById")
    public int delById(int id){
        return  videoService.deleteById(id);
    }

    /**
     * 根据视频id更新视频
     * @param
     * @return
     */
    @RequestMapping("/updateById")
    public int updateById(@RequestBody Video video){
        System.out.println(video);
        return  videoService.update(video);
    }

}