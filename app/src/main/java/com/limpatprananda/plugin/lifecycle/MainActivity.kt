package com.limpatprananda.plugin.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timber.i("onCreate: lifecycle log")
    }

    override fun onStart() {
        super.onStart()
        Timber.i("onStart: lifecycle log")
    }

    override fun onRestart() {
        super.onRestart()
        Timber.i("onRestart: lifecycle log")
    }

    override fun onResume() {
        super.onResume()
        Timber.i("onResume: lifecycle log")
    }

    override fun onPause() {
        super.onPause()
        Timber.i("onPause: lifecycle log")
    }

    override fun onStop() {
        super.onStop()
        Timber.i("onStop: lifecycle log")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy: lifecycle log")
    }
}
