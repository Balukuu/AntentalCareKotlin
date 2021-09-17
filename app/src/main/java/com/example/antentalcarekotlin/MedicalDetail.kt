package com.example.antentalcarekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MedicalDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medical_detail)

        val submit2 =findViewById<Button>(R.id.submit2)
        submit2.setOnClickListener { val intent =Intent(this,PregnuncyDetails::class.java )
            startActivity(intent) }
               }

}