package com.gson;

/**
 * Created by whiskeyfei on 16/12/2.
 */

public class AmountWithCurrency {
    String currency;
    int amount;

    @Override
    public String toString() {
        return "AmountWithCurrency{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}
