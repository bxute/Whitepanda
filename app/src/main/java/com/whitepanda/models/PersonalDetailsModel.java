package com.whitepanda.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ankit on 14-06-2017.
 */

public class PersonalDetailsModel {


    @SerializedName("done")
    public boolean done;
    @SerializedName("code")
    public int code;
    @SerializedName("data")
    public Data data;

    public static class Data {
        @SerializedName("firstname")
        public String firstname;
        @SerializedName("lastname")
        public String lastname;
        @SerializedName("city")
        public String city;
        @SerializedName("state")
        public String state;
        @SerializedName("headline")
        public String headline;
        @SerializedName("email")
        public String email;
        @SerializedName("mobile")
        public String mobile;
        @SerializedName("bio")
        public String bio;

        public Data(String firstname, String lastname, String city, String state, String headline, String email, String mobile, String bio) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.city = city;
            this.state = state;
            this.headline = headline;
            this.email = email;
            this.mobile = mobile;
            this.bio = bio;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getHeadline() {
            return headline;
        }

        public void setHeadline(String headline) {
            this.headline = headline;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getBio() {
            return bio;
        }

        public void setBio(String bio) {
            this.bio = bio;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", headline='" + headline + '\'' +
                    ", email='" + email + '\'' +
                    ", mobile='" + mobile + '\'' +
                    ", bio='" + bio + '\'' +
                    '}';
        }
    }

    public PersonalDetailsModel(boolean done, int code, Data data) {
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

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PersonalDetailsModel{" +
                "done=" + done +
                ", code=" + code +
                ", data=" + data +
                '}';
    }
}
