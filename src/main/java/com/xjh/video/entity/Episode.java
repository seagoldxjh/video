package com.xjh.video.entity;


import java.io.Serializable;
import java.util.Date;

/**
 * 集数实体类
 * @title: 集标题
 * @num: 第几集
 * @duration: 时长，单位分
 * @coverImg: 封面图
 * @videoId: 视频id
 * @summary: 集概述
 * @createTime: 创建市级
 * @chapterId: 章节主键id
 * 必须实现Serializable，否则放入redis缓存时会报类型转换错误
 */

public class Episode implements Serializable {

  private Integer id;
  private String title;
  private Integer num;
  private String duration;
  private String coverImg;
  private Integer videoId;
  private String summary;
  private Date createTime;
  private Integer chapterId;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public Integer getNum() {
    return num;
  }

  public void setNum(Integer num) {
    this.num = num;
  }


  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }


  public String getCoverImg() {
    return coverImg;
  }

  public void setCoverImg(String coverImg) {
    this.coverImg = coverImg;
  }


  public Integer getVideoId() {
    return videoId;
  }

  public void setVideoId(Integer videoId) {
    this.videoId = videoId;
  }


  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }


  public java.util.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.util.Date createTime) {
    this.createTime = createTime;
  }


  public Integer getChapterId() {
    return chapterId;
  }

  public void setChapterId(Integer chapterId) {
    this.chapterId = chapterId;
  }

}
