package com.example.omar.myfragmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    val fragmentone = oneFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getFragment(fragmentone)
    }
    private fun getFragment(fragment: Fragment){
      val transaction =  supportFragmentManager.beginTransaction()
        transaction.add(R.id.frgone1,fragment)
        transaction.commit()

    }
}