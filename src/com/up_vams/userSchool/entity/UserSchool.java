package com.up_vams.userSchool.entity;

import java.io.Serializable;

/**
 * Created by wzw on 2017/4/21 0021.
 */
public class UserSchool implements Serializable {

    private static final long serialVersionUID = -4467010056278823164L;

    private String userId;

    private String schoolId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }
}
