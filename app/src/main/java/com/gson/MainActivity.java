package com.gson;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.InstanceCreator;
import com.gson.demo.UserContext;

import java.lang.reflect.Type;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testGsonInstanceCreator();
    }


    private void testGsonInstanceCreator(){
        String json = "{\n" +
                "  \"age\": 26,\n" +
                "  \"email\": \"norman@fs.io\",\n" +
                "  \"isDeveloper\": true,\n" +
                "  \"name\": \"Norman\"\n" +
                "}  ";
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(
                UserContext.class,
                new UserContextInstanceCreator(getApplicationContext())
        );
        Gson customGson = gsonBuilder.create();

        UserContext customObject = customGson.fromJson(json, UserContext.class);
        System.out.println("customObject:" + customObject);
    }


    private class UserContextInstanceCreator implements InstanceCreator<UserContext> {
        private Context context;

        public UserContextInstanceCreator(Context context) {
            this.context = context;
        }

        @Override
        public UserContext createInstance(Type type) {
            // create new object with our additional property
            UserContext userContext = new UserContext(context);

            // return it to gson for further usage
            return userContext;
        }
    }

}
