package com.example.dagger_kotlin

import android.app.Application

class MainApplication : Application() {

    private lateinit var coffeeComponent: CoffeeComponent

    override fun onCreate() {
        super.onCreate()

        coffeeComponent =
            DaggerCoffeeComponent.builder().sugar(4).milk(5).build()
    }

    fun getCoffeeComponent(): CoffeeComponent {
        return coffeeComponent
    }

}