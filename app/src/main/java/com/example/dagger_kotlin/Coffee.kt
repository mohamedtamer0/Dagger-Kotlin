package com.example.dagger_kotlin

import android.util.Log
import javax.inject.Inject

class Coffee {
    @Inject
    lateinit var farm: Farm


    lateinit var river: River

    @Inject
    constructor(river: River) {
        this.river = river
    }


    @Inject
    fun connectElectri() {
        Log.d(LOG_TAG, "Tamer connectElectri: connecting...............")
    }


    fun getCoffeeCup(): String {
        return farm.getBeans() + "+" + river.getWater()
    }


    companion object {
        private const val LOG_TAG = "Coffee"
    }
}