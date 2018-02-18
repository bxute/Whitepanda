package com.whitepanda.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ankit on 5/13/2017.
 */

public class SingleFeedResponse {


    @SerializedName("msg")
    public String msg;
    @SerializedName("done")
    public boolean done;
    @SerializedName("code")
    public int code;
    @SerializedName("data")
    public Data data;

    public static class Replies {
        @SerializedName("user_id")
        public String userId;
        @SerializedName("firstname")
        public String firstname;
        @SerializedName("lastname")
        public String lastname;
        @SerializedName("id")
        public String id;
        @SerializedName("time")
        public String time;
        @SerializedName("ago")
        public String ago;
        @SerializedName("reply")
        public String reply;
        @SerializedName("is_liked")
        public String liked;
        @SerializedName("count_likes")
        public String likes;
        @SerializedName("profile_pic")
        public String profilePic;

        @Override
        public String toString() {
            return "Replies{" +
                    "userId='" + userId + '\'' +
                    ", firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", id='" + id + '\'' +
                    ", ago='" + ago + '\'' +
                    ", reply='" + reply + '\'' +
                    ", liked='" + liked + '\'' +
                    ", likes='" + likes + '\'' +
                    ", profilePic='" + profilePic + '\'' +
                    '}';
        }
    }

    public static class Comments {
        @SerializedName("user_id")
        public String userId;
        @SerializedName("firstname")
        public String firstname;
        @SerializedName("lastname")
        public String lastname;
        @SerializedName("id")
        public String id;
        @SerializedName("time")
        public String time;
        @SerializedName("ago")
        public String ago;
        @SerializedName("comment")
        public String comment;
        @SerializedName("is_liked")
        public String liked;
        @SerializedName("is_followed")
        public String following;
        @SerializedName("count_likes")
        public String likes;
        @SerializedName("count_replies")
        public String countReplies;
        @SerializedName("profile_pic")
        public String profilePic;
        @SerializedName("replies")
        public List<Replies> replies;

        @Override
        public String toString() {
            return "Comments{" +
                    "userId='" + userId + '\'' +
                    ", firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", id='" + id + '\'' +
                    ", ago='" + ago + '\'' +
                    ", comment='" + comment + '\'' +
                    ", liked='" + liked + '\'' +
                    ", following='" + following + '\'' +
                    ", likes='" + likes + '\'' +
                    ", countReplies='" + countReplies + '\'' +
                    ", profilePic='" + profilePic + '\'' +
                    ", replies=" + replies +
                    '}';
        }
    }

    public static class Data {
        @SerializedName("id")
        public String id;
        @SerializedName("title")
        public String title;
        @SerializedName("content")
        public String content;
        @SerializedName("user_id")
        public String userId;
        @SerializedName("firstname")
        public String firstname;
        @SerializedName("lastname")
        public String lastname;
        @SerializedName("url")
        public String url;
        @SerializedName("image")
        public String featuredImage;
        @SerializedName("is_liked")
        public boolean isLiked;
        @SerializedName("is_post_followed")
        public boolean isPostFollowed;
        @SerializedName("count_likes")
        public String countLikes;
        @SerializedName("count_comments")
        public String countComments;
        @SerializedName("time")
        public String time;
        @SerializedName("ago")
        public String ago;
        @SerializedName("profile_pic")
        public String profilePic;
        @SerializedName("is_writer_followed")
        public boolean isWriterFollowed;
        @SerializedName("comments")
        public List<Comments> comments;
        @SerializedName("tags")
        public List<String> tags;

        public Data(String id, String title, String content, String userId, String firstname, String lastname, String url, String featuredImage, boolean isLiked, boolean isPostFollowed, String countLikes, String countComments, String time, String ago, String profilePic, boolean isWriterFollowed, List<Comments> comments, List<String> tags) {
            this.id = id;
            this.title = title;
            this.content = content;
            this.userId = userId;
            this.firstname = firstname;
            this.lastname = lastname;
            this.url = url;
            this.featuredImage = featuredImage;
            this.isLiked = isLiked;
            this.isPostFollowed = isPostFollowed;
            this.countLikes = countLikes;
            this.countComments = countComments;
            this.time = time;
            this.ago = ago;
            this.profilePic = profilePic;
            this.isWriterFollowed = isWriterFollowed;
            this.comments = comments;
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

        public boolean isLiked() {
            return isLiked;
        }

        public void setLiked(boolean liked) {
            isLiked = liked;
        }

        public boolean isPostFollowed() {
            return isPostFollowed;
        }

        public void setPostFollowed(boolean postFollowed) {
            isPostFollowed = postFollowed;
        }

        public String getCountLikes() {
            return countLikes;
        }

        public void setCountLikes(String countLikes) {
            this.countLikes = countLikes;
        }

        public String getCountComments() {
            return countComments;
        }

        public void setCountComments(String countComments) {
            this.countComments = countComments;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getProfilePic() {
            return profilePic;
        }

        public void setProfilePic(String profilePic) {
            this.profilePic = profilePic;
        }

        public boolean isWriterFollowed() {
            return isWriterFollowed;
        }

        public void setWriterFollowed(boolean writerFollowed) {
            isWriterFollowed = writerFollowed;
        }

        public List<Comments> getComments() {
            return comments;
        }

        public void setComments(List<Comments> comments) {
            this.comments = comments;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "id='" + id + '\'' +
                    ", title='" + title + '\'' +
                    ", content='" + content + '\'' +
                    ", userId='" + userId + '\'' +
                    ", firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", url='" + url + '\'' +
                    ", featuredImage='" + featuredImage + '\'' +
                    ", isLiked=" + isLiked +
                    ", isPostFollowed=" + isPostFollowed +
                    ", countLikes='" + countLikes + '\'' +
                    ", countComments='" + countComments + '\'' +
                    ", time='" + time + '\'' +
                    ", ago='" + ago + '\'' +
                    ", profilePic='" + profilePic + '\'' +
                    ", isWriterFollowed=" + isWriterFollowed +
                    ", comments=" + comments +
                    ", tags=" + tags +
                    '}';
        }
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
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

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "SingleFeedResponse{" +
                "msg='" + msg + '\'' +
                ", done=" + done +
                ", code=" + code +
                ", data=" + data +
                '}';
    }
}
