package com.gson;

/**
 * Created by whiskeyfei on 16/12/3.
 */

public class UserModifier {
    private String name;
    private transient String email;
    private static boolean isDeveloper;
    private final int age;

    public UserModifier(String name, String email, int age,boolean isDeveloper) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isDeveloper = isDeveloper;
    }

    @Override
    public String toString() {
        return "UserModifier{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", isDeveloper=" + isDeveloper +
                '}';
    }
}
