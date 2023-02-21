package com.example.intenttask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intenttask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var name:String
    private lateinit var usName:String
    private lateinit var emailP : String
    private lateinit var cityD:String
    private lateinit var user: User
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.sendButton.setOnClickListener {
            name = binding.personName.text.toString()
            usName = binding.userName.text.toString()
            emailP = binding.email.text.toString()
            cityD = binding.city.text.toString()
            user = User(name,usName,emailP,cityD)

            val yeniIntent = Intent(this,MainActivity2::class.java)

            yeniIntent.putExtra("user",user)
            yeniIntent.putExtra("username",usName)
            yeniIntent.putExtra("email",emailP)
            yeniIntent.putExtra("city",cityD)

            startActivity(yeniIntent)

        }
    }
}