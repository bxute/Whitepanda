package com.whitepanda.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ankit on 5/13/2017.
 */

public class BriefPost {

    @Expose
    @SerializedName("id")
    public String id;
    @Expose
    @SerializedName("title")
    public String title;
    @Expose
    @SerializedName("user_id")
    public String user_id;
    @Expose
    @SerializedName("firstname")
    public String first_name;
    @Expose
    @SerializedName("lastname")
    public String last_name;
    @Expose
    @SerializedName("url")
    public String url;
    @Expose
    @SerializedName("views")
    public String views;
    @Expose
    @SerializedName("comments")
    public String comments;
    @Expose
    @SerializedName("likes")
    public String likes;

    public BriefPost(String id, String title, String user_id, String first_name, String last_name, String url, String views, String comments, String likes) {
        this.id = id;
        this.title = title;
        this.user_id = user_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.url = url;
        this.views = views;
        this.comments = comments;
        this.likes = likes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "BriefPost{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", user_id='" + user_id + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", url='" + url + '\'' +
                ", views='" + views + '\'' +
                ", comments='" + comments + '\'' +
                ", likes='" + likes + '\'' +
                '}';
    }
}
