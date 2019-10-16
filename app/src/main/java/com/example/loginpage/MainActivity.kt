package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button=findViewById<Button>(R.id.login_btn)
        button.setOnClickListener {
            var intent = Intent(this, LogIn::class.java)
            startActivity(intent)
        }
    }


}
