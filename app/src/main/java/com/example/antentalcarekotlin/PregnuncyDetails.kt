package com.example.antentalcarekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PregnuncyDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregnuncy_details)
        val button =findViewById<Button>(R.id.submit)
        button.setOnClickListener{ val intent = Intent(this,MotherView::class.java )
            startActivity(intent)}

    }

}