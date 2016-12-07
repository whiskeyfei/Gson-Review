package com.gson;

import com.google.gson.Gson;
import com.gson.demo.UserSimple;

import org.junit.Test;

/**
 * http://www.jianshu.com/p/cf326567f759
 */
public class GsonUnit07Test {

    @Test
    public void TestDeSerializationSerializedNameGson() {
        String userJson = "{\"age\":26,\"email\":\"norman@futurestud.io\",\"isDeveloper\":true,\"fullName\":\"Norman\"}";
        Gson gson = new Gson();
        UserSimple userObject = gson.fromJson(userJson, UserSimple.class);
        System.out.println("userObject:" + userObject);
    }

}