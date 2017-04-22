package com.up_vams.userSchool.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wzw on 2017/4/21 0021.
 */
public class UserSchool implements Serializable {

    private static final long serialVersionUID = -4467010056278823164L;

    private String userId;

    private String schoolId;

    private Date collectTime;

    private Integer usState;

    public UserSchool(String userId, String schoolId) {
        this.userId = userId;
        this.schoolId = schoolId;
    }

    public UserSchool() {
    }

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

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    public Integer getUsState() {
        return usState;
    }

    public void setUsState(Integer usState) {
        this.usState = usState;
    }
}
