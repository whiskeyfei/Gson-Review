package com.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import org.junit.Test;

import java.lang.reflect.Type;
import java.util.Date;

public class GsonUnit24Test {

    @Test
    public void TestSerializationCustomGson() {
        String userJson = "{\n" +
                "    \"year\": 116,\n" +
                "    \"month\": 5,\n" +
                "    \"day\": 21,\n" +
                "    \"age\": 26,\n" +
                "    \"email\": \"norman@futurestud.io\",\n" +
                "    \"isDeveloper\": true,\n" +
                "    \"name\": \"Norman\"\n" +
                "}";
        GsonBuilder gsonBuilder = new GsonBuilder();

        JsonDeserializer<UserDate> deserializer = new JsonDeserializer<UserDate>() {
            @Override
            public UserDate deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                JsonObject jsonObject = json.getAsJsonObject();
                Date date = new Date(
                        jsonObject.get("year").getAsInt(),
                        jsonObject.get("month").getAsInt(),
                        jsonObject.get("day").getAsInt()
                );

                return new UserDate(
                        jsonObject.get("name").getAsString(),
                        jsonObject.get("email").getAsString(),
                        jsonObject.get("age").getAsInt(),
                        jsonObject.get("isDeveloper").getAsBoolean(),
                        date
                );
            }
        }; // will implement in a second
        gsonBuilder.registerTypeAdapter(UserDate.class, deserializer);

        Gson customGson = gsonBuilder.create();
        UserDate stringJson = customGson.fromJson(userJson, UserDate.class);
        System.out.println("stringJson:" + stringJson);
    }

}