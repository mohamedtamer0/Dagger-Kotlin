package com.example.dagger_kotlin

import javax.inject.Inject

class River {
    @Inject
    constructor()


    fun getWater(): String {
        return "water"
    }
}