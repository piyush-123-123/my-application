package com.example.first

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var button1:Button
   var new:String?="Avengers"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scroll)
        println("Created")
      if(intent!=null){
          new=  intent.getStringExtra("Name")

      }
        title=new

        button1=findViewById(R.id.button1)
   button1.setOnClickListener {
    val intent =Intent(this@MainActivity,NewActivity::class.java)
       startActivity(intent)
   }

    }
    override fun onStart() {
        super.onStart()
        println("Started")
    }

    override fun onResume() {
        super.onResume()
        println("Resumed")
    }

    override fun onPause() {
        super.onPause()
        println("Paused")
    }

    override fun onStop() {
        super.onStop()
        println("Stopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("Destroyed")
    }
    override fun onRestart() {
        super.onRestart()
        println("Restarted")
    }
}
