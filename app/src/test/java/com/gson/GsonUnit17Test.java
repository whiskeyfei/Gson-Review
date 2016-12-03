package com.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.gson.demo.UserSimple3;
import com.gson.demo.UserSimple4;

import org.junit.Test;

public class GsonUnit17Test {

    @Test
    public void TestSerializationExposeGson() {
        GsonBuilder builder = new GsonBuilder();
        builder.excludeFieldsWithoutExposeAnnotation();
        Gson gson = builder.create();
        UserSimple3 userObject = new UserSimple3("Norman","norman@futurestud.io",26,true);
        String userJson = gson.toJson(userObject);
        System.out.println("userJson:" + userJson);
    }

    @Test
    public void TestDeSerializationExposeGson() {
        String userJson = "{\"age\":26,\"email\":\"norman@futurestud.io\",\"isDeveloper\":true,\"name\":\"Norman\"}";
        GsonBuilder builder = new GsonBuilder();
        builder.excludeFieldsWithoutExposeAnnotation();
        Gson gson = builder.create();
        UserSimple3 userObject = gson.fromJson(userJson, UserSimple3.class);
        System.out.println("userObject:" + userObject);
    }

    @Test
    public void TestDeSerializationTransientGson() {
        String userJson = "{\"age\":26,\"email\":\"norman@futurestud.io\",\"isDeveloper\":true,\"name\":\"Norman\"}";
        Gson gson = new Gson();
        UserSimple4 userObject = gson.fromJson(userJson, UserSimple4.class);
        System.out.println("userObject:" + userObject);
    }

}