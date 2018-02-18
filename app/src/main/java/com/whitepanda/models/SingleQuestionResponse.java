package com.whitepanda.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ankit on 5/31/2017.
 */

public class SingleQuestionResponse {


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
        public boolean isLiked;
        @SerializedName("likes")
        public String likes;
        @SerializedName("profile_pic")
        public String profilePic;

        public Replies(String userId, String firstname, String lastname, String id, String time, String reply, boolean isLiked, String likes, String profilePic) {
            this.userId = userId;
            this.firstname = firstname;
            this.lastname = lastname;
            this.id = id;
            this.time = time;
            this.reply = reply;
            this.isLiked = isLiked;
            this.likes = likes;
            this.profilePic = profilePic;
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

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getReply() {
            return reply;
        }

        public void setReply(String reply) {
            this.reply = reply;
        }

        public boolean isLiked() {
            return isLiked;
        }

        public void setLiked(boolean liked) {
            isLiked = liked;
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

        @Override
        public String toString() {
            return "Replies{" +
                    "userId='" + userId + '\'' +
                    ", firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", id='" + id + '\'' +
                    ", time='" + time + '\'' +
                    ", reply='" + reply + '\'' +
                    ", isLiked=" + isLiked +
                    ", likes='" + likes + '\'' +
                    ", profilePic='" + profilePic + '\'' +
                    '}';
        }
    }

    public static class Answers {
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
        @SerializedName("answer")
        public String answer;
        @SerializedName("is_liked")
        public boolean isLiked;
        @SerializedName("is_followed")
        public boolean isFollowed;
        @SerializedName("likes")
        public String likes;
        @SerializedName("count_replies")
        public String countReplies;
        @SerializedName("profile_pic")
        public String profilePic;
        @SerializedName("replies")
        public List<Replies> replies;

        public Answers(String userId, String firstname, String lastname, String id, String time, String answer, boolean isLiked, boolean isFollowed, String likes, String countReplies, String profilePic, List<Replies> replies) {
            this.userId = userId;
            this.firstname = firstname;
            this.lastname = lastname;
            this.id = id;
            this.time = time;
            this.answer = answer;
            this.isLiked = isLiked;
            this.isFollowed = isFollowed;
            this.likes = likes;
            this.countReplies = countReplies;
            this.profilePic = profilePic;
            this.replies = replies;
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

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getAnswer() {
            return answer;
        }

        public void setAnswer(String answer) {
            this.answer = answer;
        }

        public boolean isLiked() {
            return isLiked;
        }

        public void setLiked(boolean liked) {
            isLiked = liked;
        }

        public boolean isFollowed() {
            return isFollowed;
        }

        public void setFollowed(boolean followed) {
            isFollowed = followed;
        }

        public String getLikes() {
            return likes;
        }

        public void setLikes(String likes) {
            this.likes = likes;
        }

        public String getCountReplies() {
            return countReplies;
        }

        public void setCountReplies(String countReplies) {
            this.countReplies = countReplies;
        }

        public String getProfilePic() {
            return profilePic;
        }

        public void setProfilePic(String profilePic) {
            this.profilePic = profilePic;
        }

        public List<Replies> getReplies() {
            return replies;
        }

        public void setReplies(List<Replies> replies) {
            this.replies = replies;
        }

        @Override
        public String toString() {
            return "Answers{" +
                    "userId='" + userId + '\'' +
                    ", firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", id='" + id + '\'' +
                    ", time='" + time + '\'' +
                    ", answer='" + answer + '\'' +
                    ", isLiked=" + isLiked +
                    ", isFollowed=" + isFollowed +
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
        @SerializedName("question")
        public String question;
        @SerializedName("user_id")
        public String userId;
        @SerializedName("firstname")
        public String firstname;
        @SerializedName("image")
        public String featuredImage;
        @SerializedName("lastname")
        public String lastname;
        @SerializedName("url")
        public String url;
        @SerializedName("is_liked")
        public boolean isLiked;
        @SerializedName("is_que_followed")
        public boolean isQueFollowed;
        @SerializedName("count_likes")
        public String countLikes;
        @SerializedName("count_answers")
        public String countAnswers;
        @SerializedName("time")
        public String time;
        @SerializedName("ago")
        public String ago;
        @SerializedName("profile_pic")
        public String profilePic;
        @SerializedName("is_writer_followed")
        public boolean isWriterFollowed;
        @SerializedName("answers")
        public List<Answers> answers;
        @SerializedName("tags")
        public List<String> tags;

        public Data(String id, String title, String question, String userId, String firstname, String featuredImage, String lastname, String url, boolean isLiked, boolean isQueFollowed, String countLikes, String countAnswers, String time, String ago, String profilePic, boolean isWriterFollowed, List<Answers> answers, List<String> tags) {
            this.id = id;
            this.title = title;
            this.question = question;
            this.userId = userId;
            this.firstname = firstname;
            this.featuredImage = featuredImage;
            this.lastname = lastname;
            this.url = url;
            this.isLiked = isLiked;
            this.isQueFollowed = isQueFollowed;
            this.countLikes = countLikes;
            this.countAnswers = countAnswers;
            this.time = time;
            this.ago = ago;
            this.profilePic = profilePic;
            this.isWriterFollowed = isWriterFollowed;
            this.answers = answers;
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

        public String getName(){
            return firstname+" "+lastname;
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

        public boolean isQueFollowed() {
            return isQueFollowed;
        }

        public void setQueFollowed(boolean queFollowed) {
            isQueFollowed = queFollowed;
        }

        public String getCountLikes() {
            return countLikes;
        }

        public void setCountLikes(String countLikes) {
            this.countLikes = countLikes;
        }

        public String getCountAnswers() {
            return countAnswers;
        }

        public void setCountAnswers(String countAnswers) {
            this.countAnswers = countAnswers;
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

        public List<Answers> getAnswers() {
            return answers;
        }

        public void setAnswers(List<Answers> answers) {
            this.answers = answers;
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
                    ", userId='" + userId + '\'' +
                    ", firstname='" + firstname + '\'' +
                    ", featuredImage='" + featuredImage + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", url='" + url + '\'' +
                    ", isLiked=" + isLiked +
                    ", isQueFollowed=" + isQueFollowed +
                    ", countLikes='" + countLikes + '\'' +
                    ", countAnswers='" + countAnswers + '\'' +
                    ", time='" + time + '\'' +
                    ", ago='" + ago + '\'' +
                    ", profilePic='" + profilePic + '\'' +
                    ", isWriterFollowed=" + isWriterFollowed +
                    ", answers=" + answers +
                    ", tags=" + tags +
                    '}';
        }
    }

    public SingleQuestionResponse(boolean done, int code, Data data) {
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

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "SingleQuestionResponse{" +
                "done=" + done +
                ", code=" + code +
                ", data=" + data +
                '}';
    }
}
