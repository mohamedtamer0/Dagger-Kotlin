package com.example.dagger_kotlin

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton


class Farm {
    @Inject
    constructor(){
        Log.d(LOG_TAG, "Tamer Farm: ")
    }


    fun getBeans(): String {
        return "Beans"
    }

    companion object {
        private const val LOG_TAG = "Farm"
    }
}