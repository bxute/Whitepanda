package com.whitepanda.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ankit on 5/15/2017.
 */

public class CountryModel {
    @Override
    public String toString() {
        return "CountryModel{" +
                "country_id='" + country_id + '\'' +
                ", country_name='" + country_name + '\'' +
                ", country_code='" + country_code + '\'' +
                ", country_isd='" + country_isd + '\'' +
                '}';
    }

    @Expose
    @SerializedName("id")
    public String country_id;
    @Expose
    @SerializedName("name")
    public String country_name;
    @Expose
    @SerializedName("code_2")
    public String country_code;
    @Expose
    @SerializedName("isd")
    public String country_isd;

    public CountryModel(String country_id, String country_name, String country_code, String country_isd) {
        this.country_id = country_id;
        this.country_name = country_name;
        this.country_code = country_code;
        this.country_isd = country_isd;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getCountry_isd() {
        return country_isd;
    }

    public void setCountry_isd(String country_isd) {
        this.country_isd = country_isd;
    }
}
