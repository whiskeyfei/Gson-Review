package com.gson;


/**
 * Created by whiskeyfei on 16/12/2.
 * test 02
 */

public class Restaurant {

    String name;
    Owner owner;
    Cook cook;
    Waiter waiter;

    public class Owner {
        String name;

        UserAddress address;

        @Override
        public String toString() {
            return "Owner{" +
                    "name='" + name + '\'' +
                    ", address=" + address +
                    '}';
        }
    }

    public class Cook {
        String name;
        int age;
        int salary;

        @Override
        public String toString() {
            return "Cook{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    '}';
        }
    }

    public class Waiter {
        String name;
        int age;
        int salary;

        @Override
        public String toString() {
            return "Waiter{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", owner=" + owner +
                ", cook=" + cook +
                ", waiter=" + waiter +
                '}';
    }
}
