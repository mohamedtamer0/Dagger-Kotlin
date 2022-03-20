package com.example.dagger_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var coffee: Coffee

    @Inject
    lateinit var coffee2: Coffee
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: AppComponent = (application as MainApplication).getAppComponent()

        val coffeeComponent: CoffeeComponent =
            component.getCoffeeComponentBuilder().milk(4).sugar(4).build()
        coffeeComponent.inject(this)

        Log.d(LOG_TAG, "Tamer coffee1: " + coffee + "river for Coffee no1 " + coffee.river)
        Log.i(LOG_TAG, "Tamer coffee2: " + coffee2 + "river for Coffee no2 " + coffee2.river)

    }


    companion object {
        private const val LOG_TAG = "MainActivity"
    }
}