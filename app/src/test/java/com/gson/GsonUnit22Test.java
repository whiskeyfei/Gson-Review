package com.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.reflect.TypeToken;
import com.gson.demo.Merchant;
import com.gson.demo.UserSubscription;

import org.junit.Test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GsonUnit22Test {

    @Test
    public void TestSerializationCustomGson() {
        // get the list of merchants from an API endpoint
        Merchant futureStudio = new Merchant(23, "Future Studio");
        Merchant coffeeShop = new Merchant(42, "Coffee Shop");

// create a new subscription object and pass the merchants to it
        List<Merchant> subscribedMerchants = Arrays.asList(futureStudio, coffeeShop);
        UserSubscription subscription = new UserSubscription(
                "Norman",
                "norman@fs.io",
                26,
                true,
                subscribedMerchants);

        Gson gson = new Gson();
        String fullJSON = gson.toJson(subscription);
        System.out.println("stringJson:" + fullJSON);
    }

    @Test
    public void TestSerializationJsonSerializerGson() {
        // get the list of merchants from an API endpoint
        Merchant futureStudio = new Merchant(23, "Future Studio");
        Merchant coffeeShop = new Merchant(42, "Coffee Shop");

// create a new subscription object and pass the merchants to it
        List<Merchant> subscribedMerchants = Arrays.asList(futureStudio, coffeeShop);
        UserSubscription subscription = new UserSubscription(
                "Norman",
                "norman@fs.io",
                26,
                true,
                subscribedMerchants);

        GsonBuilder gsonBuilder = new GsonBuilder();

        JsonSerializer<Merchant> serializer = new JsonSerializer<Merchant>() {
            @Override
            public JsonElement serialize(Merchant src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject jsonMerchant = new JsonObject();

                jsonMerchant.addProperty("Id", src.getId());

                return jsonMerchant;
            }
        }; // will implement in a second
        gsonBuilder.registerTypeAdapter(Merchant.class, serializer);

        Gson customGson = gsonBuilder.create();
        String json = customGson.toJson(subscription);
        System.out.println("json:" + json);
    }

    @Test
    public void TestSerializationJsonSerializerListGson() {
        // get the list of merchants from an API endpoint
        Merchant futureStudio = new Merchant(23, "Future Studio");
        Merchant coffeeShop = new Merchant(42, "Coffee Shop");

// create a new subscription object and pass the merchants to it
        List<Merchant> subscribedMerchants = Arrays.asList(futureStudio, coffeeShop);
        UserSubscription subscription = new UserSubscription(
                "Norman",
                "norman@fs.io",
                26,
                true,
                subscribedMerchants);

        GsonBuilder gsonBuilder = new GsonBuilder();
        Type merchantListType = new TypeToken<List<Merchant>>() {
        }.getType();

        JsonSerializer<List<Merchant>> serializer =
                new JsonSerializer<List<Merchant>>() {
                    @Override
                    public JsonElement serialize(List<Merchant> src, Type typeOfSrc, JsonSerializationContext context) {
                        JsonObject jsonMerchant = new JsonObject();

                        List<String> merchantIds = new ArrayList<>(src.size());
                        for (Merchant merchant : src) {
                            merchantIds.add("" + merchant.getId());
                        }

                        String merchantIdsAsString = new StringBuilder().append(",").append(merchantIds).toString();

                        jsonMerchant.addProperty("Ids", merchantIdsAsString);

                        return jsonMerchant;
                    }
                };
        gsonBuilder.registerTypeAdapter(merchantListType, serializer);

        Gson customGson = gsonBuilder.create();
        String json = customGson.toJson(subscription);
        System.out.println("json:" + json);
    }

    @Test
    public void TestSerializationJsonSerializerListArrayGson() {
        // get the list of merchants from an API endpoint
        Merchant futureStudio = new Merchant(23, "Future Studio");
        Merchant coffeeShop = new Merchant(42, "Coffee Shop");

// create a new subscription object and pass the merchants to it
        List<Merchant> subscribedMerchants = Arrays.asList(futureStudio, coffeeShop);
        UserSubscription subscription = new UserSubscription(
                "Norman",
                "norman@fs.io",
                26,
                true,
                subscribedMerchants);

        GsonBuilder gsonBuilder = new GsonBuilder();
        Type merchantListType = new TypeToken<List<Merchant>>() {
        }.getType();

        JsonSerializer<List<Merchant>> serializer =
                new JsonSerializer<List<Merchant>>() {
                    @Override
                    public JsonElement serialize(List<Merchant> src, Type typeOfSrc, JsonSerializationContext context) {
                        JsonArray jsonMerchant = new JsonArray();

                        for (Merchant merchant : src) {
                            jsonMerchant.add("" + merchant.getId());
                        }

                        return jsonMerchant;
                    }
                };
        gsonBuilder.registerTypeAdapter(merchantListType, serializer);

        Gson customGson = gsonBuilder.create();
        String json = customGson.toJson(subscription);
        System.out.println("json:" + json);
    }

}