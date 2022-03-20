package com.example.dagger_kotlin

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ActivityScope
@Component(dependencies = [AppComponent::class])
interface CoffeeComponent {
    fun getCoffee(): Coffee

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun sugar(@Sugar("sugar") sugar: Int): Builder

        @BindsInstance
        fun milk(@Milk("milk") milk: Int): Builder

        fun appComponent(appComponent: AppComponent):Builder

        fun build(): CoffeeComponent
    }
}