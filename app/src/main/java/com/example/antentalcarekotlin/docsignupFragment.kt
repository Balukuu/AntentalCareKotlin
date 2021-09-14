package com.example.antentalcarekotlin


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment


class docsignupFragment : Fragment(R.layout.fragment_docsignup) {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_docsignup, container, false)

        val button = root.findViewById<Button>(R.id.button)
        button.setOnClickListener {

            requireActivity().run{
                Log.d("EVEN", "onCreateView: Log checks ")
                Toast.makeText(applicationContext, "sign", Toast.LENGTH_SHORT).show()
        }}
        val btnsignup = root.findViewById<TextView>(R.id.btnsignup)
        btnsignup.setOnClickListener {

            requireActivity().run{
                startActivity(Intent(this, LogIn::class.java))


        }}

        return root
    }

}