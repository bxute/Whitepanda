package com.whitepanda.models;

import android.support.annotation.IntDef;

/**
 * Created by Ankit on 5/30/2017.
 */

public class CommentThreadModel{

    public static final int THREAD_COMMENT=0;
    public static final int THREAD_REPLY = 1;
    @IntDef({THREAD_COMMENT,THREAD_REPLY})
    public @interface CommentThreadType{}

    public int dataType;
    public SingleFeedResponse.Replies reply;
    public SingleFeedResponse.Comments comment;

    public CommentThreadModel(SingleFeedResponse.Replies reply) {
        this.dataType = THREAD_REPLY;
        this.reply = reply;

    }

    public CommentThreadModel(SingleFeedResponse.Comments comment) {
        this.comment = comment;
        this.dataType = THREAD_COMMENT;
    }

    @Override
    public String toString() {
        return "CommentThreadModel{" +
                "dataType=" + dataType +
                ", reply=" + reply +
                ", comment=" + comment +
                '}';
    }
}
