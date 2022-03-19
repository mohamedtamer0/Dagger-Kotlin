package com.example.dagger_kotlin

import android.util.Log
import javax.inject.Inject

class Coffee {
    @Inject
    lateinit var farm: Farm

    var sugar: Int = 0

    lateinit var river: River

    @Inject
    constructor(river: River, sugar: Int) {
        this.river = river
        this.sugar = sugar
    }


    @Inject
    fun connectElectri() {
        Log.d(LOG_TAG, "Tamer connectElectri: connecting...............")
    }


    fun getCoffeeCup(): String {
        return farm.getBeans() + "+" + river.getWater() + "sugar: " + sugar
    }


    companion object {
        private const val LOG_TAG = "Coffee"
    }
}