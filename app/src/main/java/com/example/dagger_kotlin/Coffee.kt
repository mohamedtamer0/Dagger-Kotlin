package com.example.dagger_kotlin

import javax.inject.Inject

class Coffee {
    @Inject
    lateinit var farm: Farm
    @Inject
    lateinit var river: River

    @Inject
    constructor() {
    }

    fun getCoffeeCup(): String {
        return farm.getBeans() + "+" + river.getWater()
    }
}