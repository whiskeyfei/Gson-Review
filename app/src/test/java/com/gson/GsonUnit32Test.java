package com.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.gson.demo.RuntimeTypeAdapterFactory;

import org.junit.Test;

import java.util.List;

/**
 *  http://www.jianshu.com/p/006c9eef0c70
 */
public class GsonUnit32Test {

    @Test
    public void TestSerializationCustomGson() {

        String json = "[{\"chasesRedLaserDot\":true,\"name\":\"cat\",\"type\":\"Cat\"},{\"playsCatch\":true,\"name\":\"dog2\",\"type\":\"Dog\"},{\"playsCatch\":false,\"name\":\"dog1\",\"type\":\"Dog\"}]";

// which format has the response of the server
        final TypeToken<List<Animal>> requestListTypeToken = new TypeToken<List<Animal>>() {};

// adding all different container classes with their flag
        final RuntimeTypeAdapterFactory<Animal> typeFactory = RuntimeTypeAdapterFactory
                .of(Animal.class, "type") // Here you specify which is the parent class and what field particularizes the child class.
                .registerSubtype(Animal.Dog.class, "Dog") // if the flag equals the class name, you can skip the second parameter. This is only necessary, when the "type" field does not equal the class name.
                .registerSubtype(Animal.Cat.class, "Cat");

// add the polymorphic specialization
        final Gson gson = new GsonBuilder().registerTypeAdapterFactory(typeFactory).create();

// do the mapping
        final List<Animal> deserializedRequestList = gson.fromJson(json, requestListTypeToken.getType() );
        System.out.println("deserializedRequestList:" + deserializedRequestList);
    }

}