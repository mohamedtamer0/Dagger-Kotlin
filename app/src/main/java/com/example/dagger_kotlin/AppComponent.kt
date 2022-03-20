package com.example.dagger_kotlin

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RiverModule::class])
interface AppComponent {
    fun getRiver(): River
}