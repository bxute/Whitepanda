package com.whitepanda.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ankit on 5/25/2017.
 */

public class QuestionResponse {


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
        @SerializedName("question")
        public String question;
        @SerializedName("time")
        public String time;
        @SerializedName("image")
        public String featuredImage;
        @SerializedName("ago")
        public String ago;
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
        @SerializedName("answers")
        public String answers;
        @SerializedName("likes")
        public String likes;
        @SerializedName("profile_pic")
        public String profilePic;
        @SerializedName("tags")
        public List<String> tags;

        public Data(String id, String title, String question, String time, String featuredImage, String ago, String userId, String firstname, String lastname, String url, String views, String answers, String likes, String profilePic, List<String> tags) {
            this.id = id;
            this.title = title;
            this.question = question;
            this.time = time;
            this.featuredImage = featuredImage;
            this.ago = ago;
            this.userId = userId;
            this.firstname = firstname;
            this.lastname = lastname;
            this.url = url;
            this.views = views;
            this.answers = answers;
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

        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
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

        public String getAnswers() {
            return answers;
        }

        public void setAnswers(String answers) {
            this.answers = answers;
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

        @Override
        public String toString() {
            return "Data{" +
                    "id='" + id + '\'' +
                    ", title='" + title + '\'' +
                    ", question='" + question + '\'' +
                    ", time='" + time + '\'' +
                    ", featuredImage='" + featuredImage + '\'' +
                    ", ago='" + ago + '\'' +
                    ", userId='" + userId + '\'' +
                    ", firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", url='" + url + '\'' +
                    ", views='" + views + '\'' +
                    ", answers='" + answers + '\'' +
                    ", likes='" + likes + '\'' +
                    ", profilePic='" + profilePic + '\'' +
                    ", tags=" + tags +
                    '}';
        }
    }

    public QuestionResponse(boolean done, int code, List<Data> data) {
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
        return "QuestionResponse{" +
                "done=" + done +
                ", code=" + code +
                ", data=" + data +
                '}';
    }

}