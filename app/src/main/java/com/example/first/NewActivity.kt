package com.example.first

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_new.*

class NewActivity : AppCompatActivity(){
   lateinit var phone:EditText
    lateinit var password:EditText
    lateinit var button: Button
    lateinit var forgot:TextView
    lateinit var register:TextView
    val validphone="6239905839"
    val validpassword= arrayOf("thanos","tony","captainamerica","hulk")

    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        title = "Log In"
        phone = findViewById(R.id.phone)
        password = findViewById(R.id.password)
        button = findViewById(R.id.button)
        forgot = findViewById(R.id.forgot)
        register = findViewById(R.id.register)
        button.setOnClickListener {
            val phone = phone.text.toString()
            val password = password.text.toString()
             var nameofavenger= "Avengers"
           /* if (validpassword.contains(password) && phone==validphone) {
                val intent = Intent(this@NewActivity, MainActivity::class.java)
                startActivity(intent)
            } */
            val intent = Intent(this@NewActivity, MainActivity::class.java)
            if(phone==validphone &&validpassword.contains(password)){

             if(validpassword[0]==password){
                 nameofavenger="Thanos"
                 intent.putExtra("Name",nameofavenger)
                 startActivity(intent)
             }
                else if(validpassword[1]==password){
                 nameofavenger="Tony"
                 intent.putExtra("Name",nameofavenger)
                 startActivity(intent)
             }
                else if(validpassword[2]==password){
                 nameofavenger="Captain America"
                 intent.putExtra("Name",nameofavenger)
                 startActivity(intent)
             }
                else if(validpassword[3]==password){
                 nameofavenger="Hulk"
                 intent.putExtra("Name",nameofavenger)
                 startActivity(intent)
             }
            }
            else {
                Toast.makeText(this@NewActivity, "Inavlid User Details!!", Toast.LENGTH_LONG).show()
            }
        }
    }

}
