package com.example.dagger_kotlin

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RiverModule {


    @Singleton
    @Provides
    fun provideRiver(): River {
        return River()
    }


}