package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class LogIn : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        var signInButton=findViewById<TextView>(R.id.sign_btn)

        signInButton.setOnClickListener {
           var intent=Intent(this,SignIn::class.java)
            startActivity(intent)
        }

    }
}
