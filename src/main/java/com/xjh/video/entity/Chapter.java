package com.xjh.video.entity;


import java.io.Serializable;

/**
 * 章实体类
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

public class Chapter implements Serializable{

  private Integer id;
  private Integer videoId;
  private String title;
  private Integer ordered;
  private java.util.Date createTime;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getVideoId() {
    return videoId;
  }

  public void setVideoId(Integer videoId) {
    this.videoId = videoId;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public Integer getOrdered() {
    return ordered;
  }

  public void setOrdered(Integer ordered) {
    this.ordered = ordered;
  }


  public java.util.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.util.Date createTime) {
    this.createTime = createTime;
  }

}
