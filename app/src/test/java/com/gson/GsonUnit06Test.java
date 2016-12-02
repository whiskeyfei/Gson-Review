package com.gson;

import com.google.gson.Gson;

import org.junit.Test;

public class GsonUnit06Test {

    @Test
    public void TestSerializationNullGson() {
        UserSimple userObject = new UserSimple(null, "norman@futurestud.io", 26, true);
        Gson gson = new Gson();
        String userJson = gson.toJson(userObject); // userJson = ??
        System.out.println("userObject:" + userJson);
    }

    @Test
    public void TestDeSerializationNullGson() {
        String userJson = "{\"age\":26,\"email\":\"norman@futurestud.io\",\"isDeveloper\":true}";
        Gson gson = new Gson();
        UserSimple userObject = gson.fromJson(userJson, UserSimple.class);
        System.out.println("userObject:" + userObject);
    }

}