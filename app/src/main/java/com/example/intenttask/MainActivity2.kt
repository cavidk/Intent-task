package com.example.intenttask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intenttask.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding:ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val email = intent.getStringExtra("email")
        val name = intent.getStringExtra("username")
        val city = intent.getStringExtra("city")

        binding.textView3.text = email.toString()
        binding.textView4.text = name.toString()
        binding.textView5.text = city.toString()



    }
}