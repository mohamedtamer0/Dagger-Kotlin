package com.example.dagger_kotlin

import dagger.Module
import dagger.Provides

@Module
class CoffeeModule {

    var sugar: Int = 0

    constructor(sugar: Int) {
        this.sugar = sugar
    }


    @Provides
    fun provideRiver(): River {
        return River()
    }

    @Provides
    fun provideSugar(): Int {
        return sugar;
    }
}