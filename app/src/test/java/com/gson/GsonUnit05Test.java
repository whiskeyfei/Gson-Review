package com.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.junit.Test;

import java.lang.reflect.Type;
import java.util.HashSet;

/**
 *http://www.jianshu.com/p/215708d00015
 */
public class GsonUnit05Test {

    @Test
    public void TestSerializationSetGson() {
        HashSet<String> users = new HashSet<>();
        users.add("Christian");
        users.add("Marcus");
        users.add("Norman");
        users.add("Marcus"); // would not be added again
        Gson gson = new Gson();
        String usersJson = gson.toJson(users);
        System.out.println("usersJson:" + usersJson);
    }

    @Test
    public void TestDeSerializationSetGson() {
        String founderJson = "[{\"name\": \"Christian\",\"flowerCount\": 1}, {\"name\": \"Marcus\", \"flowerCount\": 3}, {\"name\": \"Norman\", \"flowerCount\": 2}]";

        Gson gson = new Gson();

        Type founderSetType = new TypeToken<HashSet<Founder>>(){}.getType();

        HashSet<Founder> founderSet = gson.fromJson(founderJson, founderSetType);
        System.out.println("founderSet:" + founderSet);
    }

}