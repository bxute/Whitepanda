package com.whitepanda.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by IITGN on 13-06-2017.
 */

public class PortfolioEducationAddResponse {


    @SerializedName("done")
    public boolean done;
    @SerializedName("code")
    public int code;
    @SerializedName("msg")
    public String msg;
    @SerializedName("data")
    public Data data;

    public static class Data {
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


        public Data(String eduSchool, String eduDegree, String eduFromYear, String eduFromMonth, String eduPresent) {
            this.eduSchool = eduSchool;
            this.eduDegree = eduDegree;
            this.eduFromYear = eduFromYear;
            this.eduFromMonth = eduFromMonth;
            this.eduPresent = eduPresent;
        }

        public String getEduSchool() {
            return eduSchool;
        }

        public void setEduSchool(String eduSchool) {
            this.eduSchool = eduSchool;
        }

        public String getEduDegree() {
            return eduDegree;
        }

        public void setEduDegree(String eduDegree) {
            this.eduDegree = eduDegree;
        }

        public String getEduFromYear() {
            return eduFromYear;
        }

        public void setEduFromYear(String eduFromYear) {
            this.eduFromYear = eduFromYear;
        }

        public String getEduFromMonth() {
            return eduFromMonth;
        }

        public void setEduFromMonth(String eduFromMonth) {
            this.eduFromMonth = eduFromMonth;
        }

        public String getEduPresent() {
            return eduPresent;
        }

        public void setEduPresent(String eduPresent) {
            this.eduPresent = eduPresent;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "eduSchool='" + eduSchool + '\'' +
                    ", eduDegree='" + eduDegree + '\'' +
                    ", eduFromYear='" + eduFromYear + '\'' +
                    ", eduFromMonth='" + eduFromMonth + '\'' +
                    ", eduPresent='" + eduPresent + '\'' +
                    '}';
        }
    }

    public PortfolioEducationAddResponse(boolean done, int code, String msg, Data data) {
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
        return "PortfolioEducationAddResponse{" +
                "done=" + done +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
