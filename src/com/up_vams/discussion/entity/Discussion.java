package com.up_vams.discussion.entity;

import java.io.Serializable;
import java.util.Date;

public class Discussion implements Serializable{

    private static final long serialVersionUID = -9114550156470373295L;
    private String discussionId;

    private Integer disFloorNum;

    private Date disCreateTime;

    private String disContent;


    public String getDiscussionId() {
        return discussionId;
    }

    public void setDiscussionId(String discussionId) {
        this.discussionId = discussionId;
    }

    public Integer getDisFloorNum() {
        return disFloorNum;
    }

    public void setDisFloorNum(Integer disFloorNum) {
        this.disFloorNum = disFloorNum;
    }

    public Date getDisCreateTime() {
        return disCreateTime;
    }

    public void setDisCreateTime(Date disCreateTime) {
        this.disCreateTime = disCreateTime;
    }

    public String getDisContent() {
        return disContent;
    }

    public void setDisContent(String disContent) {
        this.disContent = disContent;
    }
}