package com.example.omar.mymenulist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.optin_1->{
                Toast.makeText(this, "one", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.optin_2->{
                Toast.makeText(this, "two", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.optin_3->{
                Toast.makeText(this, "three", Toast.LENGTH_SHORT).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}