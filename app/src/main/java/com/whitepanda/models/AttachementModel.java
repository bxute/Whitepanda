package com.whitepanda.models;

import android.net.Uri;

/**
 * Created by Ankit on 5/22/2017.
 */

public class AttachementModel {

    public int fileId;
    public Uri fileUri;
    public int uploadProgress;
    public boolean done;

    public AttachementModel(int fileId, Uri fileUri, int uploadProgress, boolean done) {
        this.fileId = fileId;
        this.fileUri = fileUri;
        this.uploadProgress = uploadProgress;
        this.done = done;
    }

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    public Uri getFileUri() {
        return fileUri;
    }

    public void setFileUri(Uri fileUri) {
        this.fileUri = fileUri;
    }

    public int getUploadProgress() {
        return uploadProgress;
    }

    public void setUploadProgress(int uploadProgress) {
        this.uploadProgress = uploadProgress;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "AttachementModel{" +
                "fileId=" + fileId +
                ", fileUri=" + fileUri +
                ", uploadProgress=" + uploadProgress +
                ", done=" + done +
                '}';
    }
}
