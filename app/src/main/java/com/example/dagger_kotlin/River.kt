package com.example.dagger_kotlin

import android.util.Log
import javax.inject.Inject

class River {
    @Inject
    constructor() {
        Log.d(LOG_TAG, "Tamer River: ")
    }


    fun getWater(): String {
        return "water"
    }

    companion object {
        private const val LOG_TAG = "River"
    }
}