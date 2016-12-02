package com.gson;

/**
 * Created by whiskeyfei on 16/12/2.
 */

public class UserNaming {
    String Name;
    String email_of_developer;
    boolean isDeveloper;
    int _ageOfDeveloper;

    public UserNaming(String name, String email_of_developer, boolean isDeveloper, int _ageOfDeveloper) {
        Name = name;
        this.email_of_developer = email_of_developer;
        this.isDeveloper = isDeveloper;
        this._ageOfDeveloper = _ageOfDeveloper;
    }

    @Override
    public String toString() {
        return "UserNaming{" +
                "Name='" + Name + '\'' +
                ", email_of_developer='" + email_of_developer + '\'' +
                ", isDeveloper=" + isDeveloper +
                ", _ageOfDeveloper=" + _ageOfDeveloper +
                '}';
    }
}
