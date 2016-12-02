package com.gson;

import com.google.gson.Gson;

import org.junit.Test;

public class GsonUnit02Test {

    @Test
    public void TestSerializationGson() {
        UserAddress userAddress = new UserAddress(
                "Main Street",
                "42A",
                "Magdeburg",
                "Germany"
        );

        UserNested userObject = new UserNested("Norman",
                "norman@futurestud.io",
                26,
                true,
                userAddress
        );
        Gson gson = new Gson();
        String userJson = gson.toJson(userObject);
        System.out.println("userJson:" + userJson);
    }

    @Test
    public void TestDeSerializationGson() {
        String restaurantJson = "{ \"name\":\"Future Studio Steak House\", \"owner\":{ \"name\":\"Christian\", \"address\":{ \"city\":\"Magdeburg\", \"country\":\"Germany\", \"houseNumber\":\"42\", \"street\":\"Main Street\"}},\"cook\":{ \"age\":18, \"name\": \"Marcus\", \"salary\": 1500 }, \"waiter\":{ \"age\":18, \"name\": \"Norman\", \"salary\": 1000}}";
        Gson gson = new Gson();
        Restaurant restaurantObject = gson.fromJson(restaurantJson, Restaurant.class);
        System.out.println("restaurantObject:" + restaurantObject);
    }

}