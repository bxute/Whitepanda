package com.whitepanda.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ankit on 5/13/2017.
 */

public class StatesResponse {
    @Expose
    @SerializedName("done")
    public String done;
    @Expose
    @SerializedName("data")
    public List<StateModel> states;

    public StatesResponse(String done, List<StateModel> states) {
        this.done = done;
        this.states = states;
    }

    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }

    public List<StateModel> getStates() {
        return states;
    }

    public void setStates(List<StateModel> states) {
        this.states = states;
    }

    @Override
    public String toString() {
        return "StatesResponse{" +
                "done='" + done + '\'' +
                ", states=" + states +
                '}';
    }
}



