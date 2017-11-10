package com.mooder.customkeyboard;

import com.mooder.customkeyboard.models.RestRequest;
import com.mooder.customkeyboard.models.RestResponse;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by guillemroca on 9/11/17.
 * Copyright © 2017 Badi. All rights reserved.
 */

public class EmotionService {

    private static String BASE_URL =  "https://agile-fjord-58944.herokuapp.com/";

    public interface EmotionAPI {

        @POST("api/inputs")
        Call<RestResponse> getEmotion(@Body RestRequest request);
    }

    public EmotionAPI getAPI(){
        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(EmotionAPI.class);
    }
}
