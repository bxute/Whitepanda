package com.whitepanda.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ankit on 5/13/2017.
 */

public class LoginResponse {

    @SerializedName("done")
    public boolean done;
    @SerializedName("code")
    public int code;
    @SerializedName("token")
    public String token;
    @SerializedName("id")
    public String id;
    @SerializedName("access_level")
    public String accessLevel;
    @SerializedName("msg")
    public String msg;

    public LoginResponse(boolean done, int code, String token, String id, String accessLevel, String msg) {
        this.done = done;
        this.code = code;
        this.token = token;
        this.id = id;
        this.accessLevel = accessLevel;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "done=" + done +
                ", code=" + code +
                ", token='" + token + '\'' +
                ", id='" + id + '\'' +
                ", accessLevel='" + accessLevel + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
