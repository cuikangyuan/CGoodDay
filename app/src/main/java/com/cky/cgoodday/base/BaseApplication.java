package com.cky.cgoodday.base;

import android.app.Application;
import android.content.Context;

/**
 * Created by cuikangyuan on 16/6/20.
 */
public class BaseApplication extends Application {

    public static Context mAppContext = null;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppContext = getApplicationContext();
    }

    public static Context getAppContext() {
        return mAppContext;
    }
}
