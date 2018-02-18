package com.whitepanda.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ankit on 5/15/2017.
 */

public class LoggedInStatusResponse {

    @SerializedName("done")
    public boolean done;
    @SerializedName("code")
    public int code;
    @SerializedName("data")
    public Data data;

    public static class Notification {
        @SerializedName("type")
        public String type;
        @SerializedName("from_id")
        public String fromId;
        @SerializedName("ownership")
        public boolean ownership;
        @SerializedName("top_parent_url")
        public String topParentUrl;
        @SerializedName("from_name")
        public String fromName;
        @SerializedName("text_id")
        public String textId;
        @SerializedName("text")
        public String text;
        @SerializedName("seen")
        public String seen;
        @SerializedName("from_profile_pic")
        public String fromProfilePic;
        @SerializedName("ago")
        public String ago;

        public Notification(String type, String fromId, boolean ownership, String topParentUrl, String fromName, String textId, String text, String seen, String fromProfilePic, String ago) {
            this.type = type;
            this.fromId = fromId;
            this.ownership = ownership;
            this.topParentUrl = topParentUrl;
            this.fromName = fromName;
            this.textId = textId;
            this.text = text;
            this.seen = seen;
            this.fromProfilePic = fromProfilePic;
            this.ago = ago;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getFromId() {
            return fromId;
        }

        public void setFromId(String fromId) {
            this.fromId = fromId;
        }

        public boolean isOwnership() {
            return ownership;
        }

        public void setOwnership(boolean ownership) {
            this.ownership = ownership;
        }

        public String getTopParentUrl() {
            return topParentUrl;
        }

        public void setTopParentUrl(String topParentUrl) {
            this.topParentUrl = topParentUrl;
        }

        public String getFromName() {
            return fromName;
        }

        public void setFromName(String fromName) {
            this.fromName = fromName;
        }

        public String getTextId() {
            return textId;
        }

        public void setTextId(String textId) {
            this.textId = textId;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSeen() {
            return seen;
        }

        public void setSeen(String seen) {
            this.seen = seen;
        }

        public String getFromProfilePic() {
            return fromProfilePic;
        }

        public void setFromProfilePic(String fromProfilePic) {
            this.fromProfilePic = fromProfilePic;
        }

        public String getAgo() {
            return ago;
        }

        public void setAgo(String ago) {
            this.ago = ago;
        }

        @Override
        public String toString() {
            return "Notification{" +
                    "type='" + type + '\'' +
                    ", fromId='" + fromId + '\'' +
                    ", ownership=" + ownership +
                    ", topParentUrl='" + topParentUrl + '\'' +
                    ", fromName='" + fromName + '\'' +
                    ", textId='" + textId + '\'' +
                    ", text='" + text + '\'' +
                    ", seen='" + seen + '\'' +
                    ", fromProfilePic='" + fromProfilePic + '\'' +
                    ", ago='" + ago + '\'' +
                    '}';
        }
    }

    public static class Data {
        @SerializedName("id")
        public String id;
        @SerializedName("firstname")
        public String firstname;
        @SerializedName("lastname")
        public String lastname;
        @SerializedName("profile_pic")
        public String profilePic;
        @SerializedName("access_level")
        public String accessLevel;
        @SerializedName("notification")
        public List<Notification> notification;
        @SerializedName("user_type")
        public String userType;

        public Data(String id, String firstname, String lastname, String profilePic, String accessLevel, List<Notification> notification, String userType) {
            this.id = id;
            this.firstname = firstname;
            this.lastname = lastname;
            this.profilePic = profilePic;
            this.accessLevel = accessLevel;
            this.notification = notification;
            this.userType = userType;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
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

        public String getProfilePic() {
            return profilePic;
        }

        public void setProfilePic(String profilePic) {
            this.profilePic = profilePic;
        }

        public String getAccessLevel() {
            return accessLevel;
        }

        public void setAccessLevel(String accessLevel) {
            this.accessLevel = accessLevel;
        }

        public List<Notification> getNotification() {
            return notification;
        }

        public void setNotification(List<Notification> notification) {
            this.notification = notification;
        }

        public String getUserType() {
            return userType;
        }

        public void setUserType(String userType) {
            this.userType = userType;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "id='" + id + '\'' +
                    ", firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", profilePic='" + profilePic + '\'' +
                    ", accessLevel='" + accessLevel + '\'' +
                    ", notification=" + notification +
                    ", userType='" + userType + '\'' +
                    '}';
        }
    }

    public LoggedInStatusResponse(boolean done, int code, Data data) {
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
        return "LoggedInStatusResponse{" +
                "done=" + done +
                ", code=" + code +
                ", data=" + data +
                '}';
    }
}
