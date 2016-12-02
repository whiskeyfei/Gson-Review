package com.gson;

/**
 * Created by whiskeyfei on 16/12/2.
 */

public class UserAddress {
    String street;
    String houseNumber;
    String city;
    String country;

    public UserAddress(String street, String houseNumber, String city, String country) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
