package com.ihappy.pj_mvp;

import android.app.Application;

import com.orhanobut.hawk.Hawk;
import com.orhanobut.hawk.HawkBuilder;
import com.orhanobut.hawk.LogLevel;

/**
 * Created by liuhuan-mac on 16/1/29.
 */
public class App extends Application {
    private static App instance;

    public App(){
        instance = this;
    }

    public static App newInstance(){
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initHawk();
    }

    public void initHawk(){
        Hawk.init(this)
                .setEncryptionMethod(HawkBuilder.EncryptionMethod.MEDIUM)
                .setStorage(HawkBuilder.newSqliteStorage(this))
                .setLogLevel(LogLevel.FULL)
                .setPassword("mvp")
                .setCallback(new HawkBuilder.Callback() {
                    @Override
                    public void onSuccess() {
                    }

                    @Override
                    public void onFail(Exception e) {
                        Hawk.init(App.this)
                                .setEncryptionMethod(HawkBuilder.EncryptionMethod.MEDIUM)
                                .setStorage(HawkBuilder.newSqliteStorage(App.this))
                                .setLogLevel(LogLevel.FULL)
                                .setPassword("mvp")
                                .build();
                    }
                })
                .build();
    }
}
