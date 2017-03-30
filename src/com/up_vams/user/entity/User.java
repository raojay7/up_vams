package com.up_vams.user.entity;

import java.io.Serializable;

public class User implements Serializable {


    private static final long serialVersionUID = -8675287919386683759L;

    //用户ID
    private String userId;

    //用户名
    private String userName;

    //用户密码
    private String userPassword;

    //用户邮箱
    private String userEmail;

    //用户手机号
    private String userPhone;

    //用户性别
    private Integer gender;

    //用户地址
    private String userAddress;

    //用户头像
    private String userImage;

    //用户积分
    private Integer score;









    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}