package com.example.testrxjava.dagger

import com.example.testrxjava.screens.main.MainActivity
import com.example.testrxjava.screens.main.MainFragment
import com.example.testrxjava.screens.splash.SplashFragment
import dagger.Component

@Component(modules = [ApplicationModule::class, ScreenModule::class, VMModule::class])
interface AppComponent{

    //Fragment
    fun inject(fragment: MainFragment)

    //Activity
    fun inject(activity: MainActivity)
}