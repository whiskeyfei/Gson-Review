package com.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.junit.Test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
/**
 *http://www.jianshu.com/p/9a4dcd436d7f
 */
public class GsonUnit03Test {
    private static final String founderJson = "[{\"name\": \"Christian\",\"flowerCount\": 1}, {\"name\": \"Marcus\", \"flowerCount\": 3}, {\"name\": \"Norman\", \"flowerCount\": 2}]";

    @Test
    public void TestSerializationGson() {
        List<RestaurantWithMenu.RestaurantMenuItem> menu = new ArrayList<RestaurantWithMenu.RestaurantMenuItem>();
        menu.add(new RestaurantWithMenu.RestaurantMenuItem("Spaghetti", 7.99f));
        menu.add(new RestaurantWithMenu.RestaurantMenuItem("Steak", 12.99f));
        menu.add(new RestaurantWithMenu.RestaurantMenuItem("Salad", 5.99f));

        RestaurantWithMenu restaurant =
                new RestaurantWithMenu("Future Studio Steak House", menu);

        Gson gson = new Gson();
        String restaurantJson = gson.toJson(restaurant);
        System.out.println("userJson:" + restaurantJson);
    }

    @Test
    public void TestDeSerializationArraysGson() {
        Gson gson = new Gson();
        Founder[] founderArray = gson.fromJson(founderJson, Founder[].class);
        for (int i =0;i<founderArray.length;i++){
            System.out.println("founderArray:" + founderArray[i]);
        }
    }

    @Test
    public void TestDeSerializationListGson() {
        Type founderListType = new TypeToken<ArrayList<Founder>>(){}.getType();
        Gson gson = new Gson();
        List<Founder> founderList = gson.fromJson(founderJson, founderListType);
        System.out.println("founderList:" + founderList);
    }

}