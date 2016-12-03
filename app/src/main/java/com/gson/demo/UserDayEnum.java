package com.gson.demo;

/**
 * Created by whiskeyfei on 16/12/3.
 */

public class UserDayEnum {
    private String _name;
    private String email;
    private boolean isDeveloper;
    private int age;

    private Day day = Day.FRIDAY;

    public UserDayEnum(String _name, String email, boolean isDeveloper, int age, Day day) {
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
                ", day=" + day +
                '}';
    }
}
