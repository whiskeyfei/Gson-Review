package com.gson;

/**
 * Created by whiskeyfei on 16/12/3.
 */

public class UserFloat {
    String name;
    Float weight;

    public UserFloat(String name, Float weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "UserFloat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
