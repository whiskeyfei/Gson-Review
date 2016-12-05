package com.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.junit.Test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class GsonUnit21Test {

    @Test
    public void TestSerializationGenericsGson() {
        Gson gson = new Gson();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");

        Type integerType = new TypeToken<List<Integer>>() {}.getType();
        Type stringType = new TypeToken<List<String>>() {}.getType();

        String integerJson = gson.toJson(integerList, integerType);
        String stringJson = gson.toJson(stringList, stringType);
        System.out.println("integerJson:" + integerJson);
        System.out.println("stringJson:" + stringJson);
    }

    @Test
    public void TestSerializationGenericsBoxGson() {

        Gson gson = new Gson();

        Box<String> stringBox = new Box<>("String Type");
        Box<Integer> integerBox = new Box<>(42);
// the class UserDate is from previous guides (https://futurestud.io/blog/gson-builder-formatting-of-dates-custom-date-time-mapping/)
        Box<UserDate> complexBox = new Box<>(new UserDate("Norman", "norman@fs.io", 26, true));

        Type stringType = new TypeToken<Box<String>>() {}.getType();
        Type integerType = new TypeToken<Box<Integer>>() {}.getType();
        Type complexType = new TypeToken<Box<UserDate>>() {}.getType();

        String integerJson = gson.toJson(integerBox, integerType);
        String stringJson = gson.toJson(stringBox, stringType);
        String complexJson = gson.toJson(complexBox, complexType);
        System.out.println("integerJson:" + integerJson);
        System.out.println("stringJson:" + stringJson);
        System.out.println("complexJson:" + complexJson);
    }

    @Test
    public void TestDeSerializationGenericsGson() {
        String complexGenericJson = "{\"boxContent\":{\"_name\":\"Norman\",\"age\":26,\"email\":\"norman@fs.io\",\"isDeveloper\":true,\"registerDate\":\"Jun 7, 2016 7:15:29 AM\"}}";

        Type complexType = new TypeToken<Box<UserDate>>() {}.getType();

        Gson gson = new Gson();
        Box boxWithData = gson.fromJson(complexGenericJson, complexType);
        Box<UserDate> boxWithoutData = gson.fromJson(complexGenericJson, Box.class);
        System.out.println("boxWithoutData:" + boxWithoutData);
        System.out.println("boxWithData:" + boxWithData);
    }

}