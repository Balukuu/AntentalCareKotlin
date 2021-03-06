package com.example.antentalcarekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MotherView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mother_view)

        val MotherMainView = MotherMainView()
        val MotherSecondView =MotherSecondView()
        val MotherThirdView =MotherThirdView()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment, MotherMainView)
            commit()
        }
        val home = findViewById<ImageView>(R.id.home)
        home.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment, MotherMainView)

                commit()
            }
        }
        val details = findViewById<ImageView>(R.id.details)
        details.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment, MotherSecondView)

                commit()
            }
            val about = findViewById<ImageView>(R.id.about)
           about.setOnClickListener {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fragment, MotherThirdView)

                    commit()
                }
        }}}}

