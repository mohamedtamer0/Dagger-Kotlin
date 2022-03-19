package com.example.dagger_kotlin

import dagger.Component


@Component
interface CoffeeComponent {
    fun getCoffee(): Coffee

    fun inject(mainActivity: MainActivity)
}