package com.example.dagger_kotlin

import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [CoffeeModule::class])
interface CoffeeComponent {
    fun getCoffee(): Coffee

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun sugar(@Sugar("sugar") sugar: Int): Builder

        @BindsInstance
        fun milk(@Milk("milk") milk: Int): Builder


        fun build(): CoffeeComponent
    }
}