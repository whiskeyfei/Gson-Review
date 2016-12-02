package com.gson;

/**
 * Created by whiskeyfei on 16/12/2.
 */

public class UserNested {
    String name;
    String email;
    boolean isDeveloper;
    int age;

    // new, see below!
    UserAddress userAddress;

    public UserNested(String name, String email, int age, boolean isDeveloper, UserAddress userAddress) {
        this.name = name;
        this.email = email;
        this.isDeveloper = isDeveloper;
        this.age = age;
        this.userAddress = userAddress;
    }

    @Override
    public String toString() {
        return "UserNested{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", isDeveloper=" + isDeveloper +
                ", age=" + age +
                ", userAddress=" + userAddress +
                '}';
    }
}
