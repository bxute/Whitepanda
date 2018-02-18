package com.whitepanda.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by IITGN on 13-06-2017.
 */

public class PortfolioEducationResponse {

    @SerializedName("done")
    public boolean done;
    @SerializedName("code")
    public int code;
    @SerializedName("data")
    public List<Data> data;

    public static class Data {
        @SerializedName("id")
        public String id;
        @SerializedName("school")
        public String school;
        @SerializedName("location")
        public String location;
        @SerializedName("degree")
        public String degree;
        @SerializedName("from_date")
        public String fromDate;
        @SerializedName("from_month")
        public String fromMonth;
        @SerializedName("from_year")
        public String fromYear;
        @SerializedName("to_date")
        public String toDate;
        @SerializedName("to_month")
        public String toMonth;
        @SerializedName("to_year")
        public String toYear;
        @SerializedName("present")
        public String present;
        @SerializedName("description")
        public String description;

        public Data(String id, String school, String location, String degree, String fromDate, String fromMonth, String fromYear, String toDate, String toMonth, String toYear, String present, String description) {
            this.id = id;
            this.school = school;
            this.location = location;
            this.degree = degree;
            this.fromDate = fromDate;
            this.fromMonth = fromMonth;
            this.fromYear = fromYear;
            this.toDate = toDate;
            this.toMonth = toMonth;
            this.toYear = toYear;
            this.present = present;
            this.description = description;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getDegree() {
            return degree;
        }

        public void setDegree(String degree) {
            this.degree = degree;
        }

        public String getFromDate() {
            return fromDate;
        }

        public void setFromDate(String fromDate) {
            this.fromDate = fromDate;
        }

        public String getFromMonth() {
            return fromMonth;
        }

        public void setFromMonth(String fromMonth) {
            this.fromMonth = fromMonth;
        }

        public String getFromYear() {
            return fromYear;
        }

        public void setFromYear(String fromYear) {
            this.fromYear = fromYear;
        }

        public String getToDate() {
            return toDate;
        }

        public void setToDate(String toDate) {
            this.toDate = toDate;
        }

        public String getToMonth() {
            return toMonth;
        }

        public void setToMonth(String toMonth) {
            this.toMonth = toMonth;
        }

        public String getToYear() {
            return toYear;
        }

        public void setToYear(String toYear) {
            this.toYear = toYear;
        }

        public String getPresent() {
            return present;
        }

        public void setPresent(String present) {
            this.present = present;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "id='" + id + '\'' +
                    ", school='" + school + '\'' +
                    ", location='" + location + '\'' +
                    ", degree='" + degree + '\'' +
                    ", fromDate='" + fromDate + '\'' +
                    ", fromMonth='" + fromMonth + '\'' +
                    ", fromYear='" + fromYear + '\'' +
                    ", toDate='" + toDate + '\'' +
                    ", toMonth='" + toMonth + '\'' +
                    ", toYear='" + toYear + '\'' +
                    ", present='" + present + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }
    }

    public PortfolioEducationResponse(boolean done, int code, List<Data> data) {
        this.done = done;
        this.code = code;
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

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PortfolioEducationResponse{" +
                "done=" + done +
                ", code=" + code +
                ", data=" + data +
                '}';
    }
}
