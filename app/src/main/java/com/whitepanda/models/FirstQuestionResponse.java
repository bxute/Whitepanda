package com.whitepanda.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by IITGN on 05-06-2017.
 */

public class FirstQuestionResponse {

    @SerializedName("done")
    public boolean done;
    @SerializedName("code")
    public int code;
    @SerializedName("data")
    public Data data;
    @SerializedName("msg")
    public String msg;

    public static class Question {
        @SerializedName("id")
        public String id;
        @SerializedName("text")
        public String text;

        @Override
        public String toString() {
            return "Question{" +
                    "id='" + id + '\'' +
                    ", text='" + text + '\'' +
                    '}';
        }
    }

    public static class Options {
        @SerializedName("id")
        public String id;
        @SerializedName("text")
        public String text;

        @Override
        public String toString() {
            return "Options{" +
                    "id='" + id + '\'' +
                    ", text='" + text + '\'' +
                    '}';
        }
    }

    public static class NextQuestion {
        @SerializedName("test_id")
        public String testId;
        @SerializedName("question")
        public Question question;
        @SerializedName("options")
        public List<Options> options;

        @Override
        public String toString() {
            return "NextQuestion{" +
                    "testId='" + testId + '\'' +
                    ", question=" + question +
                    ", options=" + options +
                    '}';
        }
    }

    public static class Data {
        @SerializedName("finish_status")
        public boolean finishStatus;
        @SerializedName("pass_status")
        public boolean passStatus;
        @SerializedName("next_question")
        public NextQuestion nextQuestion;

        @Override
        public String toString() {
            return "Data{" +
                    "finishStatus=" + finishStatus +
                    ", passStatus=" + passStatus +
                    ", nextQuestion=" + nextQuestion +
                    '}';
        }
    }

    public FirstQuestionResponse(boolean done, int code, Data data) {
        this.done = done;
        this.code = code;
        this.data = data;
    }


    @Override
    public String toString() {
        return "FirstQuestionResponse{" +
                "done=" + done +
                ", code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
