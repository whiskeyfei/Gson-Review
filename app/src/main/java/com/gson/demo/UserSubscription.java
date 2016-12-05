package com.gson.demo;

import java.util.List;

/**
 * Created by whiskeyfei on 16/12/4.
 */

public class UserSubscription {
    String name;
    String email;
    int age;
    boolean isDeveloper;

    // new!
    List<Merchant> merchantList;

    public UserSubscription(String name, String email, int age, boolean isDeveloper, List<Merchant> merchantList) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isDeveloper = isDeveloper;
        this.merchantList = merchantList;
    }

    @Override
    public String toString() {
        return "UserSubscription{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", isDeveloper=" + isDeveloper +
                ", merchantList=" + merchantList +
                '}';
    }
}
