package com.whitepanda.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ankit on 5/13/2017.
 */

public class FeedsResponse {


    @SerializedName("done")
    public boolean done;
    @SerializedName("code")
    public int code;
    @SerializedName("data")
    public List<Data> data;

    public static class Data {
        @SerializedName("id")
        public String id;
        @SerializedName("title")
        public String title;
        @SerializedName("content")
        public String content;
        @SerializedName("time")
        public String time;
        @SerializedName("ago")
        public String ago;
        @SerializedName("image")
        public String featuredImage;
        @SerializedName("user_id")
        public String userId;
        @SerializedName("firstname")
        public String firstname;
        @SerializedName("lastname")
        public String lastname;
        @SerializedName("url")
        public String url;
        @SerializedName("views")
        public String views;
        @SerializedName("comments")
        public String comments;
        @SerializedName("likes")
        public String likes;
        @SerializedName("profile_pic")
        public String profilePic;
        @SerializedName("tags")
        public List<String> tags;

        public Data(String id, String title, String content, String time, String ago, String featuredImage, String userId, String firstname, String lastname, String url, String views, String comments, String likes, String profilePic, List<String> tags) {
            this.id = id;
            this.title = title;
            this.content = content;
            this.time = time;
            this.ago = ago;
            this.featuredImage = featuredImage;
            this.userId = userId;
            this.firstname = firstname;
            this.lastname = lastname;
            this.url = url;
            this.views = views;
            this.comments = comments;
            this.likes = likes;
            this.profilePic = profilePic;
            this.tags = tags;
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

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getAgo() {
            return ago;
        }

        public void setAgo(String ago) {
            this.ago = ago;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
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

        public String getProfilePic() {
            return profilePic;
        }

        public void setProfilePic(String profilePic) {
            this.profilePic = profilePic;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        public String getFeaturedImage() {
            return featuredImage;
        }

        public void setFeaturedImage(String featuredImage) {
            this.featuredImage = featuredImage;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "id='" + id + '\'' +
                    ", title='" + title + '\'' +
                    ", content='" + content + '\'' +
                    ", time='" + time + '\'' +
                    ", ago='" + ago + '\'' +
                    ", featuredImage='" + featuredImage + '\'' +
                    ", userId='" + userId + '\'' +
                    ", firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", url='" + url + '\'' +
                    ", views='" + views + '\'' +
                    ", comments='" + comments + '\'' +
                    ", likes='" + likes + '\'' +
                    ", profilePic='" + profilePic + '\'' +
                    ", tags=" + tags +
                    '}';
        }

        public String getName() {
            return firstname+" "+lastname;
        }
    }

    public FeedsResponse(boolean done, int code, List<Data> data) {
        this.done = done;
        this.code = code;
        this.data = data;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "FeedsResponse{" +
                "done=" + done +
                ", code=" + code +
                ", data=" + data +
                '}';
    }
}
