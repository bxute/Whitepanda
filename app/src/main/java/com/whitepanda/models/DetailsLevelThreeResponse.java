package com.whitepanda.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ankit on 5/15/2017.
 */

public class DetailsLevelThreeResponse {

    @SerializedName("done")
    public boolean done;
    @SerializedName("code")
    public int code;
    @SerializedName("msg")
    public String msg;
    @SerializedName("data")
    public Data data;

    public static class Data {
        @SerializedName("skills")
        public String skills;

        public Data(String skills) {
            this.skills = skills;
        }

        public String getSkills() {
            return skills;
        }

        public void setSkills(String skills) {
            this.skills = skills;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "skills='" + skills + '\'' +
                    '}';
        }
    }

    public DetailsLevelThreeResponse(boolean done, int code, String msg, Data data) {
        this.done = done;
        this.code = code;
        this.msg = msg;
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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DetailsLevelThreeResponse{" +
                "done=" + done +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}


