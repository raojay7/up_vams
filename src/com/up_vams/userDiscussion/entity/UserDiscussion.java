package com.up_vams.userDiscussion.entity;

import java.io.Serializable;

/**
 * Created by wzw on 2017/4/27 0027.
 */
public class UserDiscussion implements Serializable {

    private static final long serialVersionUID = -61758501035124674L;

    private String userId;
    private String discussionId;

    public UserDiscussion(String userId, String discussionId) {

        this.userId = userId;
        this.discussionId = discussionId;
    }

    public UserDiscussion() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDiscussionId() {
        return discussionId;
    }

    public void setDiscussionId(String discussionId) {
        this.discussionId = discussionId;
    }
}
