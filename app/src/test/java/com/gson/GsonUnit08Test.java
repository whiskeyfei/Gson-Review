package com.gson;

import com.google.gson.Gson;
import com.gson.demo.UserSimpleSerializedName;

import org.junit.Test;

/**
 * http://www.jianshu.com/p/dcfe792ba71d
 */
public class GsonUnit08Test {

    @Test
    public void TestDeSerializationMultipleGson() {
        String userJson = "{\"age\":26,\"email\":\"norman@futurestud.io\",\"isDeveloper\":true,\"username\":\"Norman\",\"fullName\":\"Marcus\"}";
        Gson gson = new Gson();
        UserSimpleSerializedName userObject = gson.fromJson(userJson, UserSimpleSerializedName.class);
        System.out.println("userObject:" + userObject);
    }

}