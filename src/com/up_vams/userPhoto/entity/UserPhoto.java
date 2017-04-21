package com.up_vams.userPhoto.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wzw on 2017/4/21 0021.
 */
public class UserPhoto implements Serializable{

    private static final long serialVersionUID = -6905480406469899205L;

    //用户Id
    private String userId;

    //照片id
    private String photoId;

    //赞的时间
    private Date voteTime;

    //点赞状态
    private Integer state;



    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public Date getVoteTime() {
        return voteTime;
    }

    public void setVoteTime(Date voteTime) {
        this.voteTime = voteTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
