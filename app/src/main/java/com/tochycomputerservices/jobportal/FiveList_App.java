package com.tochycomputerservices.jobportal;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

import androidx.multidex.MultiDex;

import com.google.android.gms.ads.MobileAds;
import com.tochycomputerservices.jobportal.manager.Nokri_AppLifeCycleManager;
import com.tochycomputerservices.jobportal.utils.Nokri_LanguageSupport;

/**
 * Created by GlixenTech on 3/22/2018.
 */

public class FiveList_App extends Application {

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Nokri_AppLifeCycleManager.init(this);
        MobileAds.initialize(this,"ca-app-pub-3543987221312116~9785428511");
    }


    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(Nokri_LanguageSupport.onAttach(base, "en"));
        MultiDex.install(this);
    }

}


