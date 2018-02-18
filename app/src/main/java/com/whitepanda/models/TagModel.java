package com.whitepanda.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ankit on 16-06-2017.
 */

public class TagModel {

    @SerializedName("done")
    public boolean done;
    @SerializedName("data")
    public List<Data> data;

    public static class Data {
        @SerializedName("id")
        public String id;
        @SerializedName("name")
        public String name;

        @Override
        public String toString() {
            return "Data{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "TagModel{" +
                "done=" + done +
                ", data=" + data +
                '}';
    }
}
