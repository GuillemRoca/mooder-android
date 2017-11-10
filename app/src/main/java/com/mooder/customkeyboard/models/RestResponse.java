package com.mooder.customkeyboard.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guillemroca on 9/11/17.
 * Copyright © 2017 Badi. All rights reserved.
 */

public class RestResponse {

    @SerializedName("content")
    private String content;

    @SerializedName("tones")
    private List<String> tones = new ArrayList<>();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getTones() {
        return tones;
    }

    public void setTones(List<String> tones) {
        this.tones = tones;
    }

}
