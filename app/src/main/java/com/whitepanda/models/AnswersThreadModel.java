package com.whitepanda.models;

import android.support.annotation.IntDef;

/**
 * Created by Ankit on 5/31/2017.
 */

public class AnswersThreadModel {


    public static final int THREAD_ANSWER=0;
    public static final int THREAD_REPLY = 1;
    @IntDef({THREAD_ANSWER,THREAD_REPLY})
    public @interface AnswerThreadType{}

    public int dataType;
    public SingleQuestionResponse.Replies reply;
    public SingleQuestionResponse.Answers answer;

    public AnswersThreadModel(SingleQuestionResponse.Replies reply) {
        this.reply = reply;
        this.dataType = THREAD_REPLY;
    }

    public AnswersThreadModel(SingleQuestionResponse.Answers answers) {
        this.answer = answers;
        this.dataType = THREAD_ANSWER;
    }

    public SingleQuestionResponse.Replies getReply() {
        return reply;
    }

    public void setReply(SingleQuestionResponse.Replies reply) {
        this.reply = reply;
    }

    public SingleQuestionResponse.Answers getAnswers() {
        return answer;
    }

    public void setAnswers(SingleQuestionResponse.Answers answers) {
        this.answer = answers;
    }

    @Override
    public String toString() {
        return "AnswersThreadModel{" +
                "dataType=" + dataType +
                ", reply=" + reply +
                ", answers=" + answer +
                '}';
    }
}
