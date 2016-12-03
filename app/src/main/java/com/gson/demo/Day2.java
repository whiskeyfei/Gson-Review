package com.gson.demo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by whiskeyfei on 16/12/3.
 */

public enum Day2 {
    @SerializedName("0")
    MONDAY(),
    @SerializedName("1")
    TUESDAY,
    @SerializedName("2")
    WEDNESDAY,
    @SerializedName("3")
    THURSDAY,
    @SerializedName("4")
    FRIDAY,
    @SerializedName("5")
    SATURDAY,
    @SerializedName("6")
    SUNDAY
}
