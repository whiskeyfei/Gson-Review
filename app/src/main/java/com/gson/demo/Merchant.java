package com.gson.demo;

/**
 * Created by whiskeyfei on 16/12/4.
 */

public class Merchant {
    private int Id;
    private String name;

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public Merchant(int id, String name) {
        Id = id;
        this.name = name;
    }
}
