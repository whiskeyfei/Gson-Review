package com.gson.demo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by whiskeyfei on 16/12/2.
 */

public class UserSimple {

    @SerializedName("fullName")
    String name;
    String email;
    int age;
    boolean isDeveloper;


    public UserSimple(String name, String email, int age, boolean isDeveloper) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isDeveloper = isDeveloper;
    }

    @Override
    public String toString() {
        return "UserSimple{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", isDeveloper=" + isDeveloper +
                '}';
    }
}
