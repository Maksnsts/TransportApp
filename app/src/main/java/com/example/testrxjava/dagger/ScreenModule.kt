package com.example.testrxjava.dagger

import com.example.testrxjava.screens.main.MainFragment
import com.example.testrxjava.screens.splash.SplashFragment
import dagger.Module
import dagger.Provides

@Module
class ScreenModule {

    @Provides
    fun provideSplashScreen(): SplashFragment {
        return SplashFragment()
    }

    @Provides
    fun provideMainScreen(): MainFragment{
        return MainFragment()
    }
}