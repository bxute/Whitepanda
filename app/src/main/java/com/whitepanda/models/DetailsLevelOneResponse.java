package com.whitepanda.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ankit on 5/13/2017.
 */

public class DetailsLevelOneResponse {
    @Expose
    @SerializedName("done")
    public String done;
    @Expose
    @SerializedName("msg")
    public String msg;
    @Expose
    @SerializedName("code")
    public int code;
    @Expose
    @SerializedName("data")
    public LData data;

    public class LData{
        @Expose
        @SerializedName("gender_id")
        public String gender_id;
        @Expose
        @SerializedName("country_id")
        public String country_id;
        @Expose
        @SerializedName("mobile")
        public String mobile;
        @Expose
        @SerializedName("dob")
        public String dob;
        @Expose
        @SerializedName("pen_name")
        public String pen_name;
        @Expose
        @SerializedName("address")
        public String address;
        @Expose
        @SerializedName("city")
        public String pin;


        public LData(String gender_id, String country_id, String mobile, String dob, String pen_name, String address, String pin) {
            this.gender_id = gender_id;
            this.country_id = country_id;
            this.mobile = mobile;
            this.dob = dob;
            this.pen_name = pen_name;
            this.address = address;
            this.pin = pin;
        }

        public String getGender_id() {
            return gender_id;
        }

        public void setGender_id(String gender_id) {
            this.gender_id = gender_id;
        }

        public String getCountry_id() {
            return country_id;
        }

        public void setCountry_id(String country_id) {
            this.country_id = country_id;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public String getPen_name() {
            return pen_name;
        }

        public void setPen_name(String pen_name) {
            this.pen_name = pen_name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPin() {
            return pin;
        }

        public void setPin(String pin) {
            this.pin = pin;
        }

        @Override
        public String toString() {
            return "LData{" +
                    "gender_id='" + gender_id + '\'' +
                    ", country_id='" + country_id + '\'' +
                    ", mobile='" + mobile + '\'' +
                    ", dob='" + dob + '\'' +
                    ", pen_name='" + pen_name + '\'' +
                    ", address='" + address + '\'' +
                    ", pin='" + pin + '\'' +
                    '}';
        }
    }

    public DetailsLevelOneResponse(String done, String msg, int code, LData data) {
        this.done = done;
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public LData getData() {
        return data;
    }

    public void setData(LData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DetailsLevelOneResponse{" +
                "done='" + done + '\'' +
                ", msg='" + msg + '\'' +
                ", code=" + code +
                ", data=" + data +
                '}';
    }
}

