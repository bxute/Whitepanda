package com.whitepanda.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by IITGN on 12-06-2017.
 */

public class ProfilePictureUploadResponse {

    @SerializedName("done")
    public boolean done;
    @SerializedName("code")
    public int code;
    @SerializedName("profile_pic")
    public String profile_pic;
    @SerializedName("msg")
    public String msg;


    public ProfilePictureUploadResponse(boolean done, int code, String profile_pic, String msg) {
        this.done = done;
        this.code = code;
        this.profile_pic = profile_pic;
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

    public String getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(String profile_pic) {
        this.profile_pic = profile_pic;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ProfilePictureUploadResponse{" +
                "done=" + done +
                ", code=" + code +
                ", profile_pic='" + profile_pic + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
