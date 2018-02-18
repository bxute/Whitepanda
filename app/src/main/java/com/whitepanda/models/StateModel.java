package com.whitepanda.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ankit on 5/15/2017.
 */

public class StateModel {

    @Expose
    @SerializedName("id")
    public String state_id;
    @Expose
    @SerializedName("name")
    public String state_name;

    public StateModel(String state_id, String state_name) {
        this.state_id = state_id;
        this.state_name = state_name;
    }

    public String getState_id() {
        return state_id;
    }

    public void setState_id(String state_id) {
        this.state_id = state_id;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    @Override
    public String toString() {
        return "StateModel{" +
                "state_id='" + state_id + '\'' +
                ", state_name='" + state_name + '\'' +
                '}';
    }
}
