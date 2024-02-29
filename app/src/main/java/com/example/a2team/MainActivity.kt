package com.example.a2team

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.a2team.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        binding.button1.setOnClickListener {
            // Activityone으로 이동
            val intent = Intent(this, Activityone::class.java)
            startActivity(intent)
        }


        binding.button2.setOnClickListener {
            // twoActivity 으로 이동
            val intent = Intent(this, twoActivity::class.java)
            startActivity(intent)
        }

        binding.button3.setOnClickListener {
            // threeActivity 으로 이동
            val intent = Intent(this, threeActivity::class.java)
            startActivity(intent)
        }


    }
}