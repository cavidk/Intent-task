package com.example.intenttask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intenttask.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding:ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val user = intent.getSerializableExtra("user") as User

        binding.textView2.text = user.pName
        binding.textView3.text = user.uName
        binding.textView4.text = user.email
        binding.textView5.text = user.city

   binding.button2.setOnClickListener {

       val yeniIntent = Intent(this@MainActivity2,MainActivity3::class.java)

          yeniIntent.putExtra("user",user)

       startActivity(yeniIntent)

   }



    }
}