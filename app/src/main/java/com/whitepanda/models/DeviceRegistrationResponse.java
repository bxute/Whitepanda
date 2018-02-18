package com.whitepanda.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ankit on 16-06-2017.
 */

public class DeviceRegistrationResponse {


    @SerializedName("done")
    public boolean done;
    @SerializedName("code")
    public int code;
    @SerializedName("msg")
    public String msg;
    @SerializedName("data")
    public Data data;

    public static class Data {
        @SerializedName("device_id")
        public String deviceId;

        public Data(String deviceId) {
            this.deviceId = deviceId;
        }

        public String getDeviceId() {
            return deviceId;
        }

        public void setDeviceId(String deviceId) {
            this.deviceId = deviceId;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "deviceId='" + deviceId + '\'' +
                    '}';
        }
    }

    public DeviceRegistrationResponse(boolean done, int code, String msg, Data data) {
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
        return "DeviceRegistrationResponse{" +
                "done=" + done +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
