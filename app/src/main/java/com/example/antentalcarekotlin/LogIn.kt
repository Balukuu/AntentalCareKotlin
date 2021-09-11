package com.example.antentalcarekotlin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class LogIn : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        // get reference to textview
        val docLoginFragment = docLoginFragment()
        val motherLoginFragment = motherLoginFragment()
        val signup =SignUp()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragment, docLoginFragment)
            commit()
        }

        val btndoc = findViewById<Button>(R.id.btndoc)
        btndoc.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, docLoginFragment)

                commit()
            }
        }
        val  mother_btn = findViewById<Button>(R.id.mother_btn)
        mother_btn.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, motherLoginFragment)
                addToBackStack(null)
                commit()
            }
        }

    }
}