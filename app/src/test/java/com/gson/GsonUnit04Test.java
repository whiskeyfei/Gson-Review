package com.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.junit.Test;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GsonUnit04Test {

    @Test
    public void TestSerializationMapGson() {
        HashMap<String, List<String>> employees = new HashMap<>();
        employees.put("A", Arrays.asList("Andreas", "Arnold", "Aden"));
        employees.put("C", Arrays.asList("Christian", "Carter"));
        employees.put("M", Arrays.asList("Marcus", "Mary"));
        Gson gson = new Gson();
        String employeeJson = gson.toJson(employees);
        System.out.println("employeeJson:" + employeeJson);
    }

    @Test
    public void TestDeSerializationMapGson() {
        String dollarJson = "{ \"1$\": { \"amount\": 1, \"currency\": \"Dollar\"}, \"2$\": { \"amount\": 2, \"currency\": \"Dollar\"}, \"3€\": { \"amount\": 3, \"currency\": \"Euro\"} }";
        Gson gson = new Gson();
        Type amountCurrencyType = new TypeToken<HashMap<String, AmountWithCurrency>>(){}.getType();

        HashMap<String, AmountWithCurrency> amountCurrency = gson.fromJson(dollarJson, amountCurrencyType);
            System.out.println("amountCurrency:" + amountCurrency);
    }

}