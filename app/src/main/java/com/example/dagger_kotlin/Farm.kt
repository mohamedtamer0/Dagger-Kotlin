package com.example.dagger_kotlin

import javax.inject.Inject

class Farm {
    @Inject
    constructor()


    fun getBeans(): String {
        return "Beans"
    }
}