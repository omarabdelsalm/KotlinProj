package com.example.omar.mybottomnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnNav :BottomNavigationView=findViewById(R.id.bottom_navigation)
        btnNav.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.page_1 -> {
                    // Respond to navigation item 1 click
                    Toast.makeText(this, "This is an Info Page1 Message",
                        Toast.LENGTH_LONG).show()

                    true
                }
                R.id.page_2-> {
                    // Respond to navigation item 2 click
                    Toast.makeText(this, "This is an Info Page2 Message",
                        Toast.LENGTH_LONG).show()
                    test()

                    true
                }
                else -> false
            }
        }
    }
    private fun test(){
        var intent=Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }
}