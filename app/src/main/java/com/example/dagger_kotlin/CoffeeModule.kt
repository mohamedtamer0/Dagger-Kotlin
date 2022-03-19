package com.example.dagger_kotlin

import dagger.Module
import dagger.Provides

@Module
class CoffeeModule {

    @Provides
    fun provideRiver(): River {
        return River()
    }
}