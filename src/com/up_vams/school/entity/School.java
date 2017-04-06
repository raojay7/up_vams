package com.up_vams.school.entity;

import java.io.Serializable;

public class School implements Serializable{

    private static final long serialVersionUID = 5540996357045469723L;

    private String schoolId;

    private String schoolName;

    private Integer schoolPageView;

    private Integer schoolActiveIndex;

    private Integer schoolPhotoCount;

    private Integer schoolRacking;

    private String schoolPinyin;

    private String schoolPinyinHeader;

    private String schoolIntroduction;


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

    public Integer getSchoolRacking() {
        return schoolRacking;
    }

    public void setSchoolRacking(Integer schoolRacking) {
        this.schoolRacking = schoolRacking;
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