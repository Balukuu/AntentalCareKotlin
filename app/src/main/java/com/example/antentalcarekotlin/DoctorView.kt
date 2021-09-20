package com.example.antentalcarekotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DoctorView : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_view)

        val DocMainView = DocMainView()
        val DocSecondView = DocSecondView()
        val DocThirdView = DocThirdView()


        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment, DocMainView)
            commit()
        }
        val home = findViewById<ImageView>(R.id.home)
        home.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment, DocMainView)

                commit()
            }
        }
        val details = findViewById<ImageView>(R.id.details)
        details.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment, DocThirdView)

                commit()
            }
    }}}