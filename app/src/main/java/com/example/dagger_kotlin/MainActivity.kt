package com.example.dagger_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var coffee: Coffee
    @Inject
    lateinit var coffee2:Coffee
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: CoffeeComponent = (application as MainApplication).getCoffeeComponent()
        component.inject(this)

        Log.d(LOG_TAG, "Tamer onCreate: " + coffee.getCoffeeCup() + "Coffee no " + coffee.farm)
        Log.i(LOG_TAG, "Tamer onCreate: " + coffee.getCoffeeCup() + "Coffee no " + coffee2.farm)

    }


    companion object {
        private const val LOG_TAG = "MainActivity"
    }
}