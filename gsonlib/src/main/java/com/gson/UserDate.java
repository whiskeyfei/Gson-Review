package com.gson;

import java.util.Date;

/**
 * Created by whiskeyfei on 16/12/3.
 */

public class UserDate {
    private String _name;
    private String email;
    private boolean isDeveloper;
    private int age;
    private Date registerDate = new Date();

    public UserDate(String _name, String email, int age, boolean isDeveloper) {
        this._name = _name;
        this.email = email;
        this.isDeveloper = isDeveloper;
        this.age = age;
    }

    public UserDate(String _name, String email, int age, boolean isDeveloper,Date date) {
       this(_name,email,age,isDeveloper);
        this.registerDate = date;
    }

    @Override
    public String toString() {
        return "UserDate{" +
                "_name='" + _name + '\'' +
                ", email='" + email + '\'' +
                ", isDeveloper=" + isDeveloper +
                ", age=" + age +
                ", registerDate=" + registerDate +
                '}';
    }
}
