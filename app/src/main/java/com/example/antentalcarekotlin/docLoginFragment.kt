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


class docLoginFragment : Fragment(R.layout.fragment_doc_login) {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_doc_login, container, false)

        val button = root.findViewById<Button>(R.id.button)
        //rb = root.findViewById<View>(R.id.rb) as RatingBar
        button.setOnClickListener {

            requireActivity().run{
                Log.d("EVEN", "onCreateView: Log checks ")
                startActivity(Intent(this, DoctorView::class.java))
                // startActivity(Intent(this, SignUp::class.java))

//            val intent =  Intent (activity, SignUp::class.java)
//            startActivity(intent)
            }}

        val btnsignup = root.findViewById<TextView>(R.id.btnsignup)
        //rb = root.findViewById<View>(R.id.rb) as RatingBar
        btnsignup.setOnClickListener {

            requireActivity().run{
                Toast.makeText(this, "sigin", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, SignUp::class.java))
            }}

        return root
    }



}