package com.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.junit.Test;

public class GsonUnit10Test {

    @Test
    public void TestSerializationNullGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.serializeNulls();
        Gson gson = gsonBuilder.create();

        UserSimple userObject = new UserSimple("Norman",null,26,true);
        String userJson = gson.toJson(userObject);
        System.out.println("userJson:" + userJson);
    }

}