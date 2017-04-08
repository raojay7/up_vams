package com.up_vams.school.entity;

import com.up_vams.photo.entity.Photo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class School implements Serializable {

    private static final long serialVersionUID = 5540996357045469723L;

    //学校id
    private String schoolId;

    //学校名
    private String schoolName;

    //学校访问量
    private Integer schoolPageView;

    //学校活跃指数
    private Integer schoolActiveIndex;

    //学校照片总数
    private Integer schoolPhotoCount;

    //学校学校排名
    private Integer schoolRanking;

    //学校全拼
    private String schoolPinyin;

    //拼音首字母
    private String schoolPinyinHeader;

    //学校简介
    private String schoolIntroduction;

    //照片
    private Photo photo;

    //照片集
    private List<Photo> photos = new ArrayList<>();

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Integer getSchoolPageView() {
        return schoolPageView;
    }

    public void setSchoolPageView(Integer schoolPageView) {
        this.schoolPageView = schoolPageView;
    }

    public Integer getSchoolActiveIndex() {
        return schoolActiveIndex;
    }

    public void setSchoolActiveIndex(Integer schoolActiveIndex) {
        this.schoolActiveIndex = schoolActiveIndex;
    }

    public Integer getSchoolPhotoCount() {
        return schoolPhotoCount;
    }

    public void setSchoolPhotoCount(Integer schoolPhotoCount) {
        this.schoolPhotoCount = schoolPhotoCount;
    }

    public Integer getSchoolRanking() {
        return schoolRanking;
    }

    public void setSchoolRanking(Integer schoolRanking) {
        this.schoolRanking = schoolRanking;
    }

    public String getSchoolPinyin() {
        return schoolPinyin;
    }

    public void setSchoolPinyin(String schoolPinyin) {
        this.schoolPinyin = schoolPinyin;
    }

    public String getSchoolPinyinHeader() {
        return schoolPinyinHeader;
    }

    public void setSchoolPinyinHeader(String schoolPinyinHeader) {
        this.schoolPinyinHeader = schoolPinyinHeader;
    }

    public String getSchoolIntroduction() {
        return schoolIntroduction;
    }

    public void setSchoolIntroduction(String schoolIntroduction) {
        this.schoolIntroduction = schoolIntroduction;
    }
}