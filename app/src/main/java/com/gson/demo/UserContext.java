package com.gson.demo;

import android.content.Context;

/**
 * Created by whiskeyfei on 16/12/5.
 */

public class UserContext {
    private String name;
    private String email;
    private boolean isDeveloper;
    private int age;

    // additional attribute, which is not part of the data model
    private Context context;

    public UserContext(Context context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "UserContext{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", isDeveloper=" + isDeveloper +
                ", age=" + age +
                ", context=" + context +
                '}';
    }
}
