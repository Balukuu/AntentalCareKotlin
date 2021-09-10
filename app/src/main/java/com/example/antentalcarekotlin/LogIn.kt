package com.example.antentalcarekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val docLoginFragment = docLoginFragment()
        val motherLoginFragment = motherLoginFragment()

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