package com.example.testrxjava.screens.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testrxjava.R
import com.example.testrxjava.TransportApp
import com.example.testrxjava.screens.splash.SplashFragment
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var splashScreen: SplashFragment

    @Inject
    lateinit var mainFragment: MainFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        TransportApp.appComponent.inject(activity = this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.flMainActivity, mainFragment)
            .commitNow()

    }

}