package com.whitepanda.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ankit on 5/13/2017.
 */

public class RegisterResponse {
    @Expose
    @SerializedName("done")
    public String done;
    @Expose
    @SerializedName("msg")
    public String msg;
    @Expose
    @SerializedName("code")
    public int code;
    @Expose
    @SerializedName("data")
    public LocalData data;

    public RegisterResponse(String done, String msg, int code, LocalData data) {
        this.done = done;
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public LocalData getData() {
        return data;
    }

    public void setData(LocalData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RegisterResponse{" +
                "done='" + done + '\'' +
                ", msg='" + msg + '\'' +
                ", code=" + code +
                ", data=" + data +
                '}';
    }

    public class LocalData{
        @Expose
        @SerializedName("email")
        public String email;

        public LocalData(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "LocalData{" +
                    "email='" + email + '\'' +
                    '}';
        }
    }
}

