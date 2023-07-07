package com.ib.testexercise.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ib.testexercise.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.place_holder, ListFragment())
            .commit()
    }
}