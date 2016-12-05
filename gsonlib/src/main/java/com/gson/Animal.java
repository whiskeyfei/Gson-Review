package com.gson;

/**
 * Created by whiskeyfei on 16/12/5.
 */

public class Animal {
    public String name;
    public String type; // this specifies which animal it is

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public static class Dog extends Animal {
        public boolean playsCatch;

        public Dog(String name, String type, boolean playsCatch) {
            this.playsCatch = playsCatch;
            this.name = name;
            this.type = type;
        }

        @Override
        public String toString() {
            return "Dog{"
                    +super.toString()+
                    "playsCatch=" + playsCatch +
                    '}';
        }
    }

    public static class Cat extends Animal {
        public boolean chasesRedLaserDot;

        @Override
        public String toString() {
            return "Cat{"   +super.toString()+
                    "chasesRedLaserDot=" + chasesRedLaserDot +
                    '}';
        }
    }
}
