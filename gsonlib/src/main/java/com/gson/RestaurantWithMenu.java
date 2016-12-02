package com.gson;

import java.util.List;

/**
 * Created by whiskeyfei on 16/12/2.
 */

public class RestaurantWithMenu {
    String name;

    List<RestaurantMenuItem> menu;
    //RestaurantMenuItem[] menu; // alternative, either one is fine


    public RestaurantWithMenu(String name, List<RestaurantMenuItem> menu) {
        this.name = name;
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "RestaurantWithMenu{" +
                "name='" + name + '\'' +
                ", menu=" + menu +
                '}';
    }

    public static class RestaurantMenuItem {
        String description;
        float price;

        public RestaurantMenuItem(String description, float price) {
            this.description = description;
            this.price = price;
        }

        @Override
        public String toString() {
            return "RestaurantMenuItem{" +
                    "description='" + description + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
