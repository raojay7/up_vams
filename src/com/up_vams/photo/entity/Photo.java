package com.up_vams.photo.entity;

import java.io.Serializable;

public class Photo implements Serializable{

    private static final long serialVersionUID = 5782293761762720735L;

    //片id
    private String photoId;

    //照片名
    private String photoName;

    //照片标题
    private String photoTitle;

    //照片纬度
    private Double photoLatitude;

    //照片经度
    private Double photoLongitude;

    //照片访问量
    private Integer photoViewNum;

    //照片点赞次数
    private Integer photoLikeNum;

    //照片创造者id
    private String photoCreatorId;

    //照片简介
    private String photoIntroduction;

    //照片的oss上的key
    private String photoOssname;


    public String getPhotoOssname() {
        return photoOssname;
    }

    public void setPhotoOssname(String photoOssname) {
        this.photoOssname = photoOssname;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public String getPhotoTitle() {
        return photoTitle;
    }

    public void setPhotoTitle(String photoTitle) {
        this.photoTitle = photoTitle;
    }

    public Double getPhotoLatitude() {
        return photoLatitude;
    }

    public void setPhotoLatitude(Double photoLatitude) {
        this.photoLatitude = photoLatitude;
    }

    public Double getPhotoLongitude() {
        return photoLongitude;
    }

    public void setPhotoLongitude(Double photoLongitude) {
        this.photoLongitude = photoLongitude;
    }

    public Integer getPhotoViewNum() {
        return photoViewNum;
    }

    public void setPhotoViewNum(Integer photoViewNum) {
        this.photoViewNum = photoViewNum;
    }


    public Integer getPhotoLikeNum() {
        return photoLikeNum;
    }

    public void setPhotoLikeNum(Integer photoLikeNum) {
        this.photoLikeNum = photoLikeNum;
    }

    public String getPhotoCreatorId() {
        return photoCreatorId;
    }

    public void setPhotoCreatorId(String photoCreatorId) {
        this.photoCreatorId = photoCreatorId;
    }

    public String getPhotoIntroduction() {
        return photoIntroduction;
    }

    public void setPhotoIntroduction(String photoIntroduction) {
        this.photoIntroduction = photoIntroduction;
    }
}