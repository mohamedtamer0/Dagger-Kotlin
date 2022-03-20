package com.example.dagger_kotlin

import android.util.Log
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

@ActivityScope
class Coffee {
    @Inject
    lateinit var farm: Farm

    var sugar: Int = 0
    var milk: Int = 0

    lateinit var river: River

    @Inject
    constructor(river: River, @Sugar("sugar") sugar: Int, @Milk("milk") milk: Int) {
        this.river = river
        this.sugar = sugar
        this.milk = milk
    }


    @Inject
    fun connectElectri() {
        Log.d(LOG_TAG, "Tamer connectElectri: connecting...............")
    }


    fun getCoffeeCup(): String {
        return farm.getBeans() + "+" + river.getWater() + "sugar: " + sugar + " milk: " + milk
    }


    companion object {
        private const val LOG_TAG = "Coffee"
    }
}