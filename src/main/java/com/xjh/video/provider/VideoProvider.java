/**
 * FileName: VideoProvider
 * Author:   xjh
 * Date:     2019-08-06 21:43
 * Description: video动态构建sql语句
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xjh.video.provider;

import com.xjh.video.entity.Video;
import org.apache.ibatis.jdbc.SQL;

/**
 * 〈一句话功能简述〉<br>
 * 〈video动态构建sql语句〉
 *
 * @author xjh
 * @create 2019-08-06
 * @since 1.0.0
 */
public class VideoProvider {

    /**
     * 更新redio动态语句
     * @param video
     * @return
     */
    public String updateVideo(final Video video){
        return new SQL(){
            {
            UPDATE("video");
            if (video.getTitle()!=null){
                SET("title=#{title}");
            }
            if (video.getSummary()!=null){
                SET("summary=#{summary}");
            }
            if (video.getCoverImg()!=null){
                SET("cover_img=#{coverImg}");
            }
            if (video.getViewNum()!=null){
                SET("view_num=#{viewNum}");
            }
            if (video.getPrice()!=null){
                SET("price=#{price}");
            }
            if (video.getOnline()!=null){
                SET("online=#{online}");
            }
            if (video.getPoint()!=null){
                SET("point=#{point}");
            }
            WHERE("id=#{id}");
            }
        }.toString();
    }
}