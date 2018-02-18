package com.whitepanda.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ankit on 5/19/2017.
 */

public class SkillsFetchResponse {

    @Expose
    @SerializedName("done")
    public boolean done;
    @Expose
    @SerializedName("data")
    public List<SkillData> data;

    public SkillsFetchResponse(boolean done, List<SkillData> data) {
        this.done = done;
        this.data = data;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public List<SkillData> getData() {
        return data;
    }

    public void setData(List<SkillData> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "SkillsFetchResponse{" +
                "done=" + done +
                ", data=" + data +
                '}';
    }

    public class SkillData{
        @Expose
        @SerializedName("id")
        public String id;
        @Expose
        @SerializedName("name")
        public String name;

        public SkillData(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "SkillData{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

}
