package com.whitepanda.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ankit on 5/15/2017.
 */

public class DetailsLevelTwoResponse {


    @SerializedName("done")
    public boolean done;
    @SerializedName("code")
    public int code;
    @SerializedName("msg")
    public String msg;
    @SerializedName("data")
    public Data data;

    public static class Data {
        @SerializedName("have_worked")
        public String haveWorked;
        @SerializedName("edu_school")
        public String eduSchool;
        @SerializedName("edu_degree")
        public String eduDegree;
        @SerializedName("edu_from_year")
        public String eduFromYear;
        @SerializedName("edu_from_month")
        public String eduFromMonth;
        @SerializedName("edu_present")
        public String eduPresent;

        public Data(String haveWorked, String eduSchool, String eduDegree, String eduFromYear, String eduFromMonth, String eduPresent) {
            this.haveWorked = haveWorked;
            this.eduSchool = eduSchool;
            this.eduDegree = eduDegree;
            this.eduFromYear = eduFromYear;
            this.eduFromMonth = eduFromMonth;
            this.eduPresent = eduPresent;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "haveWorked='" + haveWorked + '\'' +
                    ", eduSchool='" + eduSchool + '\'' +
                    ", eduDegree='" + eduDegree + '\'' +
                    ", eduFromYear='" + eduFromYear + '\'' +
                    ", eduFromMonth='" + eduFromMonth + '\'' +
                    ", eduPresent='" + eduPresent + '\'' +
                    '}';
        }
    }

    public DetailsLevelTwoResponse(boolean done, int code, String msg, Data data) {
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
        return "DetailsLevelTwoResponse{" +
                "done=" + done +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}


