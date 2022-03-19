package com.example.dagger_kotlin

import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car
}