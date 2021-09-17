package com.example.antentalcarekotlin


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment



class MotherSignupFragment : Fragment(R.layout.fragment_mothersignup) {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_mothersignup, container, false)

        val button2 = root.findViewById<Button>(R.id.button3)
        button2.setOnClickListener {

            requireActivity().run{
                startActivity(Intent(this, MedicalDetail::class.java))
            }}

        val btnsignup2 = root.findViewById<TextView>(R.id.btnsignup2)
        btnsignup2.setOnClickListener {

            requireActivity().run{
                startActivity(Intent(this, SignUp::class.java))


            }}


        return root


}}