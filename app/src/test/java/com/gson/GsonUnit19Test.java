package com.gson;

import com.google.gson.Gson;
import com.gson.demo.Day;
import com.gson.demo.UserDayEnum;
import com.gson.demo.UserDayEnum2;

import org.junit.Test;

public class GsonUnit19Test {

    @Test
    public void TestSerializationEnumGson() {
        UserDayEnum userObject = new UserDayEnum("Norman", "norman@fs.io", true, 26, Day.SUNDAY);
        Gson gson = new Gson();
        String userWithEnumJson = gson.toJson(userObject);
        System.out.println("userWithEnumJson:" + userWithEnumJson);
    }

    @Test
    public void TestDeSerializationEnumGson() {
        String userJson = "{\"age\":26,\"email\":\"norman@futurestud.io\",\"isDeveloper\":true,\"day\":\"FRIDAY\"}";
        Gson gson = new Gson();
        UserDayEnum userObject = gson.fromJson(userJson, UserDayEnum.class);
        System.out.println("userObject:" + userObject);
    }

    @Test
    public void TestDeSerializationTransientGson() {
        String userJson = "{\"age\":26,\"email\":\"norman@futurestud.io\",\"isDeveloper\":true,\"day\":0}";
        Gson gson = new Gson();
        UserDayEnum2 userDayEnum2 = gson.fromJson(userJson, UserDayEnum2.class);
        System.out.println("userDayEnum2:" + userDayEnum2);
    }

}