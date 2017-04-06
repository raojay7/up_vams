package com.up_vams.schoolPhoto.entity;

import java.io.Serializable;

/**
 * Created by wzw on 2017/4/6.
 */
public class SchoolPhoto implements Serializable{

    private static final long serialVersionUID = -3045151462309840732L;

    private String photoId;

    private String schoolId;

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }
}
