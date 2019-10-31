package com.limpatprananda.plugin.lifecycle

import android.app.Application
import timber.log.Timber

class LifecycleApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }


}