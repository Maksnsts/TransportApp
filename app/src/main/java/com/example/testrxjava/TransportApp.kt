package com.example.testrxjava

import android.app.AppComponentFactory
import android.app.Application
import com.example.testrxjava.dagger.AppComponent
import com.example.testrxjava.dagger.ApplicationModule
import com.example.testrxjava.dagger.DaggerAppComponent

class TransportApp: Application() {

    companion object{
        lateinit var  appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .applicationModule(ApplicationModule(application = this))
            .build()
    }
}