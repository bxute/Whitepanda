package com.whitepanda.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ankit on 19-06-2017.
 */

public class DeviceUnRegistrationResponse {

    @SerializedName("done")
    public boolean done;
    @SerializedName("code")
    public int code;
    @SerializedName("msg")
    public String msg;
    @SerializedName("data")
    public DeviceRegistrationResponse.Data data;

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

    @Override
    public String toString() {
        return "DeviceUnRegistrationResponse{" +
                "done=" + done +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
