package com.example.simpleinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("HkpxF7V0OJNO36O3v4aD5lwq4JZ8wau34AM40JU4")
                .clientKey("0tf41hAk9Wwugf2GHcuYeri6w1UeEsGFIesMpLRi")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
