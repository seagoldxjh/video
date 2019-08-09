/**
 * FileName: VideoService
 * Author:   xjh
 * Date:     2019-08-06 18:58
 * Description: 视频业务接口类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xjh.video.service;

import com.xjh.video.entity.Video;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈视频业务接口类〉
 *
 * @author xjh
 * @create 2019-08-06
 * @since 1.0.0
 */
public interface VideoService {
    List<Video> findAll();
    Video findById(int id);
    int update(Video video);
    int deleteById(int id);
    int insert(Video video);
}