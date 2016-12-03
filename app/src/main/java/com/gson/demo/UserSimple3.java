package com.gson.demo;

import com.google.gson.annotations.Expose;

/**
 * Created by whiskeyfei on 16/12/2.
 */

public class UserSimple3 {

    @Expose()
    String name; // equals serialize & deserialize

    @Expose(serialize = false, deserialize = false)
    String email; // equals neither serialize nor deserialize

    @Expose(serialize = false)
    int age; // equals only deserialize

    @Expose(deserialize = false)
    boolean isDeveloper; // equals only serialize

    public UserSimple3(String name, String email, int age, boolean isDeveloper) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isDeveloper = isDeveloper;
    }

    @Override
    public String toString() {
        return "UserSimple3{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", isDeveloper=" + isDeveloper +
                '}';
    }
}
