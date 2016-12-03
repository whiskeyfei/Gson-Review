package com.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.junit.Test;

public class GsonUnit13Test {

    //throw an exception
    @Test
    public void TestSerializationFolatGson() {
        Gson gson = new Gson();
        UserFloat user = new UserFloat("Norman", Float.POSITIVE_INFINITY);
        String usersJson = gson.toJson(user); // will throw an exception
        System.out.println("userJson:" + usersJson);
    }

    @Test
    public void TestDeSerializationRightGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.serializeSpecialFloatingPointValues();
        Gson gson = gsonBuilder.create();
        UserFloat userFloat = new UserFloat("Norman", Float.POSITIVE_INFINITY);
        String usersJson = gson.toJson(userFloat);
        System.out.println("userJson:" + usersJson);
    }

}