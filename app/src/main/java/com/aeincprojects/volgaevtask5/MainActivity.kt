package com.aeincprojects.volgaevtask5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val mainFragment = MainFragment()
        fragmentTransaction.replace(R.id.fragmentContainerView, mainFragment)
        fragmentTransaction.commit()

    }
}