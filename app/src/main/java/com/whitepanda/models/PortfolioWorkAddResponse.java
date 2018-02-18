package com.whitepanda.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by IITGN on 13-06-2017.
 */

public class PortfolioWorkAddResponse {


    @SerializedName("done")
    public boolean done;
    @SerializedName("code")
    public int code;
    @SerializedName("msg")
    public String msg;
    @SerializedName("data")
    public Data data;

    public static class Data {
        @SerializedName("work_organization")
        public String workOrganization;
        @SerializedName("work_position")
        public String workPosition;
        @SerializedName("work_from_year")
        public String workFromYear;
        @SerializedName("work_from_month")
        public String workFromMonth;
        @SerializedName("work_present")
        public String workPresent;

        public Data(String workOrganization, String workPosition, String workFromYear, String workFromMonth, String workPresent) {
            this.workOrganization = workOrganization;
            this.workPosition = workPosition;
            this.workFromYear = workFromYear;
            this.workFromMonth = workFromMonth;
            this.workPresent = workPresent;
        }

        public String getWorkOrganization() {
            return workOrganization;
        }

        public void setWorkOrganization(String workOrganization) {
            this.workOrganization = workOrganization;
        }

        public String getWorkPosition() {
            return workPosition;
        }

        public void setWorkPosition(String workPosition) {
            this.workPosition = workPosition;
        }

        public String getWorkFromYear() {
            return workFromYear;
        }

        public void setWorkFromYear(String workFromYear) {
            this.workFromYear = workFromYear;
        }

        public String getWorkFromMonth() {
            return workFromMonth;
        }

        public void setWorkFromMonth(String workFromMonth) {
            this.workFromMonth = workFromMonth;
        }

        public String getWorkPresent() {
            return workPresent;
        }

        public void setWorkPresent(String workPresent) {
            this.workPresent = workPresent;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "workOrganization='" + workOrganization + '\'' +
                    ", workPosition='" + workPosition + '\'' +
                    ", workFromYear='" + workFromYear + '\'' +
                    ", workFromMonth='" + workFromMonth + '\'' +
                    ", workPresent='" + workPresent + '\'' +
                    '}';
        }
    }

    public PortfolioWorkAddResponse(boolean done, int code, String msg, Data data) {
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
        return "PortfolioWorkAddResponse{" +
                "done=" + done +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
