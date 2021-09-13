package com.example.antentalcarekotlin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val docsignupFragment = docsignupFragment()
        val mothersignupFragment = mothersignupFragment()


        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragment, docsignupFragment)
            commit()
        }

        val btndoc = findViewById<Button>(R.id.btndoc)
        btndoc.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, docsignupFragment)

                commit()
            }
        }
        val  mother_btn = findViewById<Button>(R.id.mother_btn)
        mother_btn.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, mothersignupFragment)
                addToBackStack(null)
                commit()
            }
        }

    }
}