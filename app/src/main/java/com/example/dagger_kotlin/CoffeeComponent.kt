package com.example.dagger_kotlin

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@ActivityScope
@Subcomponent
interface CoffeeComponent {
    fun getCoffee(): Coffee

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun sugar(@Sugar("sugar") sugar: Int): Builder

        @BindsInstance
        fun milk(@Milk("milk") milk: Int): Builder


        fun build(): CoffeeComponent
    }
}