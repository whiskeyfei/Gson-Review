package com.gson.demo;

/**
 * Created by whiskeyfei on 16/12/3.
 */

public class UserDayEnum2 {
    private String _name;
    private String email;
    private boolean isDeveloper;
    private int age;

    private Day2 day = Day2.FRIDAY;

    public UserDayEnum2(String _name, String email, boolean isDeveloper, int age, Day2 day) {
        this._name = _name;
        this.email = email;
        this.isDeveloper = isDeveloper;
        this.age = age;
        this.day = day;
    }

    @Override
    public String toString() {
        return "UserDayEnum{" +
                "_name='" + _name + '\'' +
                ", email='" + email + '\'' +
                ", isDeveloper=" + isDeveloper +
                ", age=" + age +
                ", day2=" + day +
                '}';
    }
}
