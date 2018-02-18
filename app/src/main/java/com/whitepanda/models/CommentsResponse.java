package com.whitepanda.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ankit on 5/13/2017.
 */

public class CommentsResponse {
    @Expose
    @SerializedName("done")
    public String done;
    @Expose
    @SerializedName("code")
    public int code;
    @Expose
    @SerializedName("data")
    public List<SingleFeedResponse.Comments> data;

    public CommentsResponse(String done, int code, List<SingleFeedResponse.Comments> data) {
        this.done = done;
        this.code = code;
        this.data = data;
    }

    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<SingleFeedResponse.Comments> getData() {
        return data;
    }

    public void setData(List<SingleFeedResponse.Comments> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CommentsResponse{" +
                "done='" + done + '\'' +
                ", code=" + code +
                ", data=" + data +
                '}';
    }
}


