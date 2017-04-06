package com.up_vams.photo.entity;

import java.io.Serializable;

public class Photo implements Serializable{

    private static final long serialVersionUID = 5782293761762720735L;

    private String photoId;



    private String photoName;

    private String photoTitle;

    private Integer photoLatitude;

    private Integer photoLongitude;

    private Integer photoViewNum;

    private Integer photoLikeNum;

    private String photoCreatorId;

    private String photoIntroduction;



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

    public Integer getPhotoLatitude() {
        return photoLatitude;
    }

    public void setPhotoLatitude(Integer photoLatitude) {
        this.photoLatitude = photoLatitude;
    }

    public Integer getPhotoLongitude() {
        return photoLongitude;
    }

    public void setPhotoLongitude(Integer photoLongitude) {
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