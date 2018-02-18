package com.whitepanda.models;

/**
 * Created by Ankit on 15-06-2017.
 */

public class LocalNotificationModel {

    public String icon;
    public String imageUrl;
    public String content;
    public String time;

    public LocalNotificationModel(String icon, String imageUrl, String content, String time) {
        this.icon = icon;
        this.imageUrl = imageUrl;
        this.content = content;
        this.time = time;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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

    @Override
    public String toString() {
        return "LocalNotificationModel{" +
                "icon='" + icon + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", content='" + content + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
