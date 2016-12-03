package com.gson;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.junit.Test;

import java.lang.reflect.Modifier;
import java.util.Date;

public class GsonUnit11Test {

    @Test
    public void TestSerializationExclusionStrategyGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setExclusionStrategies(new ExclusionStrategy() {
            @Override
            public boolean shouldSkipField(FieldAttributes f) {
                return false;
            }

            @Override
            public boolean shouldSkipClass(Class<?> incomingClass) {
                return incomingClass == Date.class || incomingClass == boolean.class;
            }
        });
        Gson gson = gsonBuilder.create();

        UserDate user = new UserDate("Norman", "norman@futurestud.io", 26, true);
        String usersJson = gson.toJson(user);
        System.out.println("userJson:" + usersJson);
    }

    @Test
    public void TestDeSerializationSkipFieldGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setExclusionStrategies(new ExclusionStrategy() {
            @Override
            public boolean shouldSkipField(FieldAttributes f) {
                return f.getName().contains("_");
            }

            @Override
            public boolean shouldSkipClass(Class<?> incomingClass) {
                return incomingClass == Date.class || incomingClass == boolean.class;
            }
        });
        Gson gson = gsonBuilder.create();

        UserDate user = new UserDate("Norman", "norman@futurestud.io", 26, true);
        String usersJson = gson.toJson(user);
        System.out.println("userJson:" + usersJson);

    }

    @Test
    public void TestDeSerializationFieldsWithModifiersGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithModifiers(Modifier.STATIC, Modifier.FINAL);
        Gson gson = gsonBuilder.create();

        UserModifier user = new UserModifier("Norman", "norman@fs.io", 26, true);
        String usersJson = gson.toJson(user);
        System.out.println("userJson:" + usersJson);
    }

}