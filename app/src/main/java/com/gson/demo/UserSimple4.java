package com.gson.demo;

/**
 * Created by whiskeyfei on 16/12/2.
 */

public class UserSimple4 {

    String name;
    transient String email;
    int age;
    transient boolean  isDeveloper; // will not be serialized or deserialized

    public UserSimple4(String name, String email, int age, boolean isDeveloper) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isDeveloper = isDeveloper;
    }

    @Override
    public String toString() {
        return "UserSimple4{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", isDeveloper=" + isDeveloper +
                '}';
    }
}
