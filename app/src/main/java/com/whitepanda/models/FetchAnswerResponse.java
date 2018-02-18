package com.whitepanda.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ankit on 5/31/2017.
 */

public class FetchAnswerResponse {
    @Expose
    @SerializedName("done")
    public String done;
    @Expose
    @SerializedName("msg")
    public String msg;
    @Expose
    @SerializedName("code")
    public int code;

    public FetchAnswerResponse(String done, String msg, int code) {
        this.done = done;
        this.msg = msg;
        this.code = code;
    }


}
