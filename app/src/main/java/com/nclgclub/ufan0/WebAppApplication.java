package com.nclgclub.ufan0;

import android.app.Application;
public class WebAppApplication extends Application {

    public WebAppApplication() {
    }


    @Override
    public void onCreate() {
        super.onCreate();

        // http://stackoverflow.com/a/9752494
        try {
            Class.forName("android.os.AsyncTask");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
