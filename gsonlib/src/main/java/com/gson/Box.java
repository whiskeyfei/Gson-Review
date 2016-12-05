package com.gson;

/**
 * Created by whiskeyfei on 16/12/4.
 */

public class Box<T> {
    private T boxContent;

    public Box(T t) {
        this.boxContent = t;
    }

    @Override
    public String toString() {
        return "Box{" +
                "boxContent=" + boxContent +
                '}';
    }
}

