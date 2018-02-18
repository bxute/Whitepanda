package com.whitepanda.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by IITGN on 13-06-2017.
 */

public class PortfolioWorkDeleteResponse {


    @SerializedName("done")
    public boolean done;
    @SerializedName("code")
    public int code;
    @SerializedName("msg")
    public String msg;

    public PortfolioWorkDeleteResponse(boolean done, int code, String msg) {
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
        return "PortfolioWorkDeleteResponse{" +
                "done=" + done +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
