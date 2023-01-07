package com.example.omar.myfragmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    val fragmentone = oneFragment()
    val fragmenttow= fragmentTow()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn1=findViewById<Button>(R.id.btn1)
        var btn2=findViewById<Button>(R.id.btn2)
        btn1.setOnClickListener {
            getFragment(fragmentone)
        }
        btn2.setOnClickListener {
            getFragment(fragmenttow)
        }

    }
    private fun getFragment(fragment: Fragment){
      val transaction =  supportFragmentManager.beginTransaction()
        transaction.add(R.id.frgone1,fragment)
        transaction.commit()

    }
}