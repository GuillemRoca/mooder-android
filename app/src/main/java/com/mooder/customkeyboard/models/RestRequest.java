package com.mooder.customkeyboard.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by guillemroca on 9/11/17.
 * Copyright © 2017 Badi. All rights reserved.
 */

public class RestRequest {

    public static final String CLIENT_ANDROID = "android";

    @SerializedName("content")
    private String content;

    @SerializedName("application")
    private String application;

    @SerializedName("client_type")
    private String clientType;

    @SerializedName("user_id")
    private Integer userID;

    @SerializedName("sent")
    private Boolean sent;

    public RestRequest(String content, String application, Boolean sent) {
        this.content = content;
        this.application = application;
        this.clientType = CLIENT_ANDROID;
        this.userID = 2;
        this.sent = sent;
    }

    @Override
    public String toString() {
        return "RestRequest{" +
                "content='" + content + '\'' +
                ", application='" + application + '\'' +
                ", clientType='" + clientType + '\'' +
                ", userID=" + userID +
                '}';
    }
}
