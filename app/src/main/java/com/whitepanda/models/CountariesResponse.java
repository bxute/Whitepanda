package com.whitepanda.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ankit on 5/13/2017.
 */

public class CountariesResponse {
    @Expose
    @SerializedName("done")
    public String done;
    @Expose
    @SerializedName("data")
    public List<CountryModel> countries;

    public CountariesResponse(String done, List<CountryModel> countries) {
        this.done = done;
        this.countries = countries;
    }

    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }

    public List<CountryModel> getCountries() {
        return countries;
    }

    public void setCountries(List<CountryModel> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "CountariesResponse{" +
                "done='" + done + '\'' +
                ", countries=" + countries +
                '}';
    }
}



