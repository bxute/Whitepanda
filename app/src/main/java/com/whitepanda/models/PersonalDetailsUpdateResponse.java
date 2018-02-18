package com.whitepanda.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ankit on 14-06-2017.
 */

public class PersonalDetailsUpdateResponse {


    @SerializedName("done")
    public boolean done;
    @SerializedName("code")
    public int code;
    @SerializedName("msg")
    public String msg;

    public PersonalDetailsUpdateResponse(boolean done, int code, String msg) {
        this.done = done;
        this.code = code;
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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "PersonalDetailsUpdateResponse{" +
                "done=" + done +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
