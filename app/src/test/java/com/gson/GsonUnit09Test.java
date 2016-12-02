package com.gson;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.gson.demo.UserNaming2;

import org.junit.Test;

import java.lang.reflect.Field;

public class GsonUnit09Test {


    @Test
    public void TestSerializationIDENTITYGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.IDENTITY);
        Gson gson = gsonBuilder.create();

        UserNaming user = new UserNaming("Norman", "norman@futurestud.io", true, 26);
        String usersJson = gson.toJson(user);
        System.out.println("usersJson:" + usersJson);
    }

    @Test
    public void TestSerializationLOWER_CASE_WITH_UNDERSCORESGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        Gson gson = gsonBuilder.create();

        UserNaming user = new UserNaming("Norman", "norman@futurestud.io", true, 26);
        String usersJson = gson.toJson(user);
        System.out.println("usersJson:" + usersJson);
    }


    //接口和model类字段不一致，采用LOWER_CASE_WITH_UNDERSCORES 方式处理
    @Test
    public void TestSerializationLOWER_CASE_WITH_UNDERSCORES2Gson() {
        String userJson = "{\"reviewer_name\":\"Marcus\"}";
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        Gson gson = gsonBuilder.create();
        PostReviewer postReviewer = gson.fromJson(userJson,PostReviewer.class);
        System.out.println("postReviewer:" + postReviewer);
    }

    @Test
    public void TestSerializationLOWER_CASE_WITH_DASHESGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_DASHES);
        Gson gson = gsonBuilder.create();

        UserNaming user = new UserNaming("Norman", "norman@futurestud.io", true, 26);
        String usersJson = gson.toJson(user);
        System.out.println("usersJson:" + usersJson);
    }

    @Test
    public void TestSerializationUPPER_CAMEL_CASEGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
        Gson gson = gsonBuilder.create();

        UserNaming user = new UserNaming("Norman", "norman@futurestud.io", true, 26);
        String usersJson = gson.toJson(user);
        System.out.println("usersJson:" + usersJson);
    }

    @Test
    public void TestSerializationUPPER_CAMEL_CASE2Gson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
        Gson gson = gsonBuilder.create();

        UserNaming2 user = new UserNaming2("Norman", "norman@futurestud.io", true, 26);
        String usersJson = gson.toJson(user);
        System.out.println("usersJson:" + usersJson);
    }

    @Test
    public void TestSerializationCustomGson() {
        FieldNamingStrategy customPolicy = new FieldNamingStrategy() {
            @Override
            public String translateName(Field f) {
                return f.getName().replace("_", "");
            }
        };

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingStrategy(customPolicy);
        Gson gson = gsonBuilder.create();

        UserNaming user = new UserNaming("Norman", "norman@futurestud.io", true, 26);
        String usersJson = gson.toJson(user);
        System.out.println("usersJson:" + usersJson);
    }



}