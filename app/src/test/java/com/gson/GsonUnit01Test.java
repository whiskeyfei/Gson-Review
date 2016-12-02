package com.gson;

import com.google.gson.Gson;

import org.junit.Test;

public class GsonUnit01Test {

    @Test
    public void TestSerializationGson() {
        UserSimple userObject = new UserSimple("Norman","norman@futurestud.io",26,true);
        Gson gson = new Gson();
        String userJson = gson.toJson(userObject);
        System.out.println("userJson:" + userJson);
    }

    @Test
    public void TestDeSerializationGson() {
        String userJson = "{\"age\":26,\"email\":\"norman@futurestud.io\",\"isDeveloper\":true,\"name\":\"Norman\"}";
        Gson gson = new Gson();
        UserSimple userObject = gson.fromJson(userJson, UserSimple.class);
        System.out.println("userObject:" + userObject);
    }


}