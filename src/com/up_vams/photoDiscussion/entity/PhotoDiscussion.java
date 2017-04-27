package com.up_vams.photoDiscussion.entity;

public class PhotoDiscussion{
    private String discussionId;

    private String photoId;


    public PhotoDiscussion(String photoId, String discussionId) {
        this.discussionId = discussionId;
        this.photoId = photoId;
    }

    public PhotoDiscussion() {
    }



    public PhotoDiscussion(String photoId) {
        this.photoId = photoId;
    }

    public String getDiscussionId() {
        return discussionId;
    }

    public void setDiscussionId(String discussionId) {
        this.discussionId = discussionId;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }
}