package com.example.antentalcarekotlin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class motherLoginFragment : Fragment(R.layout.motherloginfragment) {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.motherloginfragment, container, false)

        val button = root.findViewById<Button>(R.id.button)
        button.setOnClickListener {

            requireActivity().run{
                Log.d("EVEN", "onCreateView: Log checks ")
                startActivity(Intent(this, MotherView::class.java))
            }}
        val btnsignup = root.findViewById<TextView>(R.id.btnsignup)
        btnsignup.setOnClickListener {

            requireActivity().run{
                startActivity(Intent(this, SignUp::class.java))


            }}

        return root


}}