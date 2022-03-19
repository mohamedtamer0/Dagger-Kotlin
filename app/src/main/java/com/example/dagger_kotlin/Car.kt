package com.example.dagger_kotlin

import android.util.Log
import javax.inject.Inject

class Car {
    lateinit var wheels: Wheels
    lateinit var engine: Engine

    @Inject
    constructor(wheels: Wheels, engine: Engine) {
        this.wheels = wheels
        this.engine = engine
    }


    fun start() {
        Log.d(LOG_TAG, "driving.............")
    }

    companion object{
        private const val LOG_TAG = "MAIN_ACTIVITY"
    }

}